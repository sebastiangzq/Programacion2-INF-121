public class Cuadrado extends Figura implements Coloreado{
    public double lado;
    public Cuadrado(double lado, String color){
        super(color);
        this.lado=lado;
    }

    @Override
    public double area() {
        return this.lado*this.lado;
    }

    @Override
    public double perimero() {
        return 4*this.lado;
    }

    @Override
    public String comoColorear() {
        return "Colorear cuatro lados";
    }

    @Override
    public String toString() {
        return "[ Cuadrado de lado: "+this.lado+", color: "+color+" ]";
    }
}
