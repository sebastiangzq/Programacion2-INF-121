public class Vector3D {
    private double x, y, z;
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3D suma(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }
    public Vector3D resta(Vector3D v) {
        return new Vector3D(this.x - v.x, this.y - v.y, this.z - v.z);
    }
    public Vector3D multEscalar(double r) {
        return new Vector3D(r * this.x, r * this.y, r * this.z);
    }
    public double longitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }
    public Vector3D normalizar() {
        double len = this.longitud();
        if (len == 0) throw new ArithmeticException("No se puede normalizar el vector cero.");
        return new Vector3D(x / len, y / len, z / len);
    }
    public double productoEscalar(Vector3D v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }
    public Vector3D productoVectorial(Vector3D v) {
        double cx = this.y * v.z - this.z * v.y;
        double cy = this.z * v.x - this.x * v.z;
        double cz = this.x * v.y - this.y * v.x;
        return new Vector3D(cx, cy, cz);
    }
    public boolean esOrtogonal(Vector3D v) {
        double dot = this.productoEscalar(v);
        return Math.abs(dot) < 1e-10;
    }
    public Vector3D proyeccionOrtogonal(Vector3D b) {
        double bLenSq = b.x*b.x + b.y*b.y + b.z*b.z;
        if (bLenSq == 0) throw new ArithmeticException("No se puede proyectar sobre el vector cero.");
        double scalar = this.productoEscalar(b) / bLenSq;
        return b.multEscalar(scalar);
    }
    public String toString() {
        return String.format("(%.4f, %.4f, %.4f)", x, y, z);
    }
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }
    public static void main(String[] args) {
        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, -5, 6);
        System.out.println("Ejercicio numero 2");
        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b);
        System.out.println("a + b = " + a.suma(b));
        System.out.println("a - b = " + a.resta(b));
        System.out.println("2 * a = " + a.multEscalar(2));
        System.out.println("|a| = " + a.longitud());
        System.out.println("Normalizado a = " + a.normalizar());
        System.out.println("Producto escalar a·b = " + a.productoEscalar(b));
        System.out.println("Producto vectorial a x b = " + a.productoVectorial(b));
        System.out.println("¿a es ortogonal a b? " + a.esOrtogonal(b));
        Vector3D proy = a.proyeccionOrtogonal(b);
        System.out.println("Proyección ortogonal de a sobre b = " + proy);
    }
}
