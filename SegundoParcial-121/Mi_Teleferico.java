import java.util.ArrayList;
import java.util.List;

public class Mi_Teleferico {
    private List<Linea>lineas;
    private float cantidadIngresos;
    public Mi_Teleferico(){
        this.lineas=new ArrayList<>();
    }
    public void agregarPersonaFila(Persona p, String linea){
        Linea linea1 = new Linea(linea);
        linea1.agregarPersona(p);
        this.lineas.add(linea1);
    }
    public void agregarCabina(String linea){
        this.lineas.add(new Linea(linea));
    }
}
