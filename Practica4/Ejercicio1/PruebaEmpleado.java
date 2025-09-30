import java.util.Scanner;
public class PruebaEmpleado {
    public static void main(String[]args){
        Scanner lee=new Scanner(System.in);
        Empleado[]empleados=new Empleado[5];
        System.out.println("[ Ingrese datos de 3 empleados a tiempo completo: ]");
        for (int i=0; i<3;i++){
            System.out.println("Empleado "+(i+1)+":");
            System.out.print("Nombre: ");
            String nombre=lee.nextLine();
            System.out.print("Salario anual: ");
            double salarioAnual= Double.parseDouble(lee.nextLine());
            empleados[i]= new EmpleadoTiempoCompleto(nombre,salarioAnual);
        }
        System.out.println("[ Ingrese datos de dos empleados a tiempo horario: ]");
        for (int j=0; j<2; j++){
            System.out.println("Empleado "+(j+1)+":");
            System.out.print("Nombre: ");
            String nombre=lee.nextLine();
            System.out.print("Horas trabajadas: ");
            double horas=Double.parseDouble(lee.nextLine());
            System.out.print("Traifa por hora: ");
            double tarifa=Double.parseDouble(lee.nextLine());
            empleados[j+3]=new EmpleadoTiempoHorario(nombre,horas,tarifa);
        }
        System.out.println("[ lista de empleados y sus salarios mensaules: ]");
        for (Empleado empleado: empleados){
            System.out.print(empleado.toString());empleado.CalcularSalarioMensual();System.out.println(" ");
        }
    }
}
