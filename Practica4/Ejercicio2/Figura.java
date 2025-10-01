public abstract class Figura {
    public  String color;
    public Figura(String color){
        this.color=color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public abstract double area();
    public abstract double perimero();
    @Override
    public String toString() {
        return "color de la figura: "+getColor();
    }

}
