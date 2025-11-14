public class Prestamo {
    private String fecha_de_prestamo,fecha_de_devolucion;
    private Estudiante referencias_al_estudiante;
    private Libro referecia_al_libro;
    public Prestamo(String fecha_de_prestamo,String fecha_de_devolucion, Estudiante estudiante, Libro libro){
        this.fecha_de_prestamo=fecha_de_prestamo;
        this.fecha_de_devolucion=fecha_de_devolucion;
        this.referencias_al_estudiante=estudiante;
        this.referecia_al_libro=libro;
    }
    public void mostrarInfo(){
        System.out.print("Fecha de prestamo: "+fecha_de_prestamo+", fecha de devolucion: "+fecha_de_devolucion+", referencia al estudiante: ");referencias_al_estudiante.mostrarInfo();System.out.print(", referencia del libro: ");referecia_al_libro.leer();
    }
}
