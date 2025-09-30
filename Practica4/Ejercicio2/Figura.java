public abstract class Figura {
    public  String color;
    public Figura(String color){
        this.color=color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "color de la figura: "+this.color;
    }
    public abstract double area();
    public abstract double perimero();
}
