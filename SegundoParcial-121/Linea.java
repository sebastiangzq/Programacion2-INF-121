import java.util.ArrayList;
import java.util.List;

public class Linea {
    private String color;
    private List<Persona>filaPersonas;
    private List<Cabina>cabinas;
    private int cantidadCabinas;
    public Linea(String color){
        this.color=color;
        this.filaPersonas=new ArrayList<>();
        this.cabinas=new ArrayList<>();
    }
    public void agregarPersona(Persona p){
        this.filaPersonas.add(p);
    }
    public List<Cabina> cabinas(){
        return cabinas;
    }
    public void agregarCabina(int nroCab){
        this.cantidadCabinas=this.cantidadCabinas+nroCab;
    }
    public void agregarCabina(Cabina c){
        this.cabinas.add(c);
    }
    public void agregarPersona(Persona p, int nroCabina){
        for (Cabina c: cabinas){
            if (c.getNroCabina()==nroCabina){
                c.agregarPersona(p);
            }
        }
    }
    public void ingreso(){
        double totalprefe=0, totalreg=0;
        for (Cabina c:cabinas){
            totalprefe=totalprefe+c.tarifaPreferencial();
        }
        for (Cabina c:cabinas){
            totalreg=totalreg+c.tarifaRegular();
        }
        double total=totalprefe+totalreg;
        System.out.println("--------Ingresos linea: "+color+"----------");
        System.out.println("Tarifa preferencial: "+totalprefe);
        System.out.println("Tarifa regular: "+totalreg);
        System.out.println("Total ingresos : "+total);
        System.out.println("--------------------------------------------");
    }
    public double ingresoLineaRegular(){
        double totalreg=0;
        for (Cabina c:cabinas){
            totalreg=totalreg+c.tarifaRegular();
        }
        return totalreg;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Linea : "+color;
    }
}
