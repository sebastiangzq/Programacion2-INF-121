import java.util.ArrayList;
import java.util.List;

public class Cabina {
    private int nroCabina;
    private List<Persona>personasAbordo;
    public Cabina(int nroCabina){
        this.nroCabina=nroCabina;
        this.personasAbordo= new ArrayList<>();
    }
    public void agregarPersona(Persona p){
        float k=0;
        for (Persona e: personasAbordo){
            k=k+e.getPeso();
        }
        if (this.personasAbordo.size()<11){
            if (k<850){
                this.personasAbordo.add(p);
            }
            else {
                System.out.println("La cabina esta al maximo de capacidad de peso de 850 kg ");
            }
        }
        else {
            System.out.println("La cabina esta al maximo de capacidad de 10 personas");
        }
    }
    public void cumple(){
        float k=0;
        for (Persona e: personasAbordo){
            k=k+e.getPeso();
        }
        if (this.personasAbordo.size()<11 && k<850){
            System.out.println("[ La cabina nro "+nroCabina+" cumple con todas las reglas ]");
        }
    }
    public int getNroCabina(){
        return nroCabina;
    }
    public double tarifaPreferencial(){
        double tp;
        int con1=0;
        for (Persona p: personasAbordo){
            if (p.getEdad()<25 || p.getEdad()>60){
                con1=con1+1;
            }
        }
        tp=1.50*con1;
        return tp;
    }
    public double tarifaRegular(){
        double tr;
        int con1=0;
        for (Persona p: personasAbordo){
            if (p.getEdad()>25 && p.getEdad()<60){
                con1=con1+1;
            }
        }
        tr=3*con1;
        return tr;
    }
}
