import javax.sound.sampled.Line;

public class main {
    public static void main(String[]args){

        Cabina cabina1= new Cabina(1);
        cabina1.agregarPersona(new Persona("Juan",19,68));
        Cabina cabina2= new Cabina(2);
        cabina2.agregarPersona(new Persona("Alfredo",45,30));

        Linea l1= new Linea("Rojo");
        l1.agregarCabina(cabina1);
        cabina1.cumple();
        Linea l2= new Linea("Amarillo");
        l2.agregarCabina(cabina2);
        cabina2.cumple();
        Linea l3= new Linea("Verde");

        l1.ingreso();
        l2.ingreso();

        if(l1.ingresoLineaRegular()> l2.ingresoLineaRegular()){
            System.out.print("La linea "+l1+" tiene mayor ingreso con la tarifa regular");
        }
        else {
            System.out.print("La linea "+l2+" tiene mayor ingreso con la tarifa regular");
        }

    }
}
