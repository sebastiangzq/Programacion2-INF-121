public class Circulo extends Figura{
    public double radio;
    public Circulo(double radio, String color){
        super(color);
        this.radio=radio;
    }

    @Override
    public double area() {
        return Math.PI*this.radio*this.radio;
    }

    @Override
    public double perimero() {
        return 2*Math.PI*this.radio;
    }

    @Override
    public String toString() {
        return "[ Circulo de radio: "+this.radio+" color: "+color+" ]";
    }

}
