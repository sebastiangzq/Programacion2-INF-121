public class Estudiante {
    private String codigo_de_estudiante,nombre;
    public Estudiante(String codigo_de_estudiante, String nombre){
        this.codigo_de_estudiante=codigo_de_estudiante;
        this.nombre=nombre;
    }
    public void mostrarInfo(){
        System.out.print("[ codigo del estudiante: "+codigo_de_estudiante+", nombre: "+nombre+" ]");
    }
}
