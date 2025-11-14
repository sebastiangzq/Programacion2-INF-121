public class Horario {
    private String dias_de_apertura;
    private int hora_de_apertura,hora_de_cierre;
    public Horario(String dias_de_apertura, int hora_de_apertura, int hora_de_cierre){
        this.dias_de_apertura=dias_de_apertura;
        this.hora_de_apertura=hora_de_apertura;
        this.hora_de_cierre=hora_de_cierre;
    }
    public void mostrarHorario(){
        System.out.println("Dias de apertura: "+dias_de_apertura+", hora de apertura: "+hora_de_apertura+" am, hora de clausura: "+hora_de_cierre+" pm");
    }
}
