public class EmpleadoTiempoCompleto extends Empleado{
    public double salario_anual;

    public EmpleadoTiempoCompleto(String nombre,double salario_anual) {
        super(nombre);
        this.salario_anual = salario_anual;
    }

    @Override
    public void CalcularSalarioMensual() {
        System.out.print(", el salario mensual es: "+this.salario_anual/12+" ]");
    }

    @Override
    public String toString() {
        String n=super.toString();
        return n+ ", su salario anual es: "+this.salario_anual;
    }
}
