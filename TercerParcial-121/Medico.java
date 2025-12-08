public class Medico {
    private int idMed ;
    private String nombreMed;
    private String apellidoMed;
    private int aniosExperiencia;

    public Medico(int idMed, String nombreMed, String apellidoMed, int aniosExperiencia) {
        this.idMed=idMed;
        this.nombreMed=nombreMed;
        this.apellidoMed=apellidoMed;
        this.aniosExperiencia=aniosExperiencia;
    }
    public String nombreMed() {
        return this.nombreMed;
    }
    public String apellidoMed() {
        return this.apellidoMed;
    }
    public int getId() {
        return idMed;
    }
    public String toString() {
        return(this.nombreMed+" "+this.apellidoMed);
    }
}
