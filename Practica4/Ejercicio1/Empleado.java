abstract class Empleado {
    public String nombre;

     public Empleado(String nombre){
         this.nombre=nombre;
     }

    public abstract void CalcularSalarioMensual();

    public String toString() {
        return "[nombre: "+ this.nombre+" ";
    }
}
