public class EmpleadoTiempoHorario extends Empleado{
    public double horas_trabajadas,tarifa_por_hora;

    public EmpleadoTiempoHorario(String nombre, double horas_trabajadas, double tarifa_por_hora){
        super(nombre);
        this.horas_trabajadas=horas_trabajadas;
        this.tarifa_por_hora=tarifa_por_hora;
    }

    @Override
    public void CalcularSalarioMensual() {
        System.out.print(", el salario mensual es: "+this.horas_trabajadas*this.tarifa_por_hora+" ]");
    }
    public String toString() {
        String n=super.toString();
        return n+ ", las horas trabajadas son :"+this.horas_trabajadas+" , la tarifa por hora es: "+tarifa_por_hora;
    }
}
