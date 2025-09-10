public class AlgebraVectorial {
    private double x, y, z;
    public AlgebraVectorial() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public AlgebraVectorial(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }
    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double magnitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public AlgebraVectorial suma(AlgebraVectorial b) {
        return new AlgebraVectorial(this.x + b.x, this.y + b.y, this.z + b.z);
    }
    public AlgebraVectorial resta(AlgebraVectorial b) {
        return new AlgebraVectorial(this.x - b.x, this.y - b.y, this.z - b.z);
    }
    public double productoPunto(AlgebraVectorial b) {
        return this.x * b.x + this.y * b.y + this.z * b.z;
    }
    public AlgebraVectorial productoCruz(AlgebraVectorial b) {
        double cx = this.y * b.z - this.z * b.y;
        double cy = this.z * b.x - this.x * b.z;                                            //
        double cz = this.x * b.y - this.y * b.x;
        return new AlgebraVectorial(cx, cy, cz);
    }
    public AlgebraVectorial escalarPor(double r) {
        return new AlgebraVectorial(this.x * r, this.y * r, this.z * r);
    }
    public boolean esPerpendicularMetodoA(AlgebraVectorial b) {
        return Math.abs(this.suma(b).magnitud() - this.resta(b).magnitud()) < 1e-9;
    }
    public boolean esPerpendicularMetodoB(AlgebraVectorial b) {
        return Math.abs(this.resta(b).magnitud() - b.resta(this).magnitud()) < 1e-9;
    }
    public boolean esPerpendicularMetodoC(AlgebraVectorial b) {
        return Math.abs(this.productoPunto(b)) < 1e-9;
    }
    public boolean esPerpendicularMetodoD(AlgebraVectorial b) {
        double lhs = Math.pow(this.suma(b).magnitud(), 2);
        double rhs = Math.pow(this.magnitud(), 2) + Math.pow(b.magnitud(), 2);
        return Math.abs(lhs - rhs) < 1e-9;
    }
    public boolean esParaleloMetodoE(AlgebraVectorial b) {
        if (b.magnitud() == 0) return false;
        if (this.magnitud() == 0) return true;
        double rx = (b.x != 0) ? this.x / b.x : Double.NaN;
        double ry = (b.y != 0) ? this.y / b.y : Double.NaN;
        double rz = (b.z != 0) ? this.z / b.z : Double.NaN;
        double r = Double.NaN;
        if (!Double.isNaN(rx)) r = rx;
        if (!Double.isNaN(ry)) {
            if (Double.isNaN(r)) r = ry;                                                     //
            else if (Math.abs(r - ry) > 1e-9) return false;
        }
        if (!Double.isNaN(rz)) {
            if (Double.isNaN(r)) r = rz;
            else if (Math.abs(r - rz) > 1e-9) return false;
        }
        return true;
    }
    public boolean esParaleloMetodoF(AlgebraVectorial b) {
        AlgebraVectorial cruz = this.productoCruz(b);
        return cruz.magnitud() < 1e-9;
    }
    public AlgebraVectorial proyeccionSobre(AlgebraVectorial b) {
        double b2 = Math.pow(b.magnitud(), 2);
        if (b2 == 0) return new AlgebraVectorial(0, 0, 0);
        double coef = this.productoPunto(b) / b2;
        return b.escalarPor(coef);
    }
    public double componenteEn(AlgebraVectorial b) {
        return proyeccionSobre(b).magnitud();
    }
    public String toString() {
        return String.format("(%.4f, %.4f, %.4f)", x, y, z);
    }
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(1, 0, 0);
        AlgebraVectorial b = new AlgebraVectorial(0, 1, 0);
        System.out.println("Ejercicio numero 1");
        System.out.println("Vectores:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();
        System.out.println("a) |a + b| == |a - b| ? " + a.esPerpendicularMetodoA(b));
        System.out.println("b) |a - b| == |b - a| ? " + a.esPerpendicularMetodoB(b));
        System.out.println("c) a · b == 0 ? " + a.esPerpendicularMetodoC(b));
        System.out.println("d) |a + b|^2 == |a|^2 + |b|^2 ? " + a.esPerpendicularMetodoD(b));
        System.out.println("e) a es paralelo a b (a = r*b)? " + a.esParaleloMetodoE(b));
        System.out.println("f) a × b == 0 ? " + a.esParaleloMetodoF(b));
        AlgebraVectorial proy = b.proyeccionSobre(a);
        System.out.println("g) Proyección de a sobre b: " + proy);
        double comp = b.componenteEn(a);
        System.out.println("h) Componente de a en b: " + comp);
    }
}
