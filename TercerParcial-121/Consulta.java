public class Consulta {
    private int ci;
    private String nombrePaciente;
    private String apellidoPaciente;
    private int idMed;
    private int dia;
    private String mes;
    private int anio;

    public Consulta(int ci, String nombrePaciente, String apellidoPaciente, int idMed, int dia, String mes, int anio) {
        this.ci=ci;
        this.nombrePaciente=nombrePaciente;
        this.apellidoPaciente=apellidoPaciente;
        this.idMed=idMed;
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;
    }
    public String nombre() {
        return this.nombrePaciente;
    }
    public String apellidoPaciente() {
        return this.apellidoPaciente;
    }
    public void darDeAlta(Medico m){
        System.out.println("Se dio de alta al paciente "+this.nombrePaciente+" "+this.apellidoPaciente+", Medico: "+m.getId());
    }
}
