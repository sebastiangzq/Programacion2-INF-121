import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private String nombre_de_la_biblioteca;
    private List<Libro>libros_disponibles;
    private List<Autor>autores_registrados;
    private List<Prestamo>prestamos_activos;
    private Horario horario;
    public Biblioteca(String nombre_de_la_biblioteca,String dias_de_apertura, int hora_de_apertura, int hora_de_cierre){
        this.nombre_de_la_biblioteca=nombre_de_la_biblioteca;
        this.horario=new Horario(dias_de_apertura,hora_de_apertura,hora_de_cierre);
        this.nombre_de_la_biblioteca=nombre_de_la_biblioteca;
        this.libros_disponibles=new ArrayList<>();
        this.autores_registrados=new ArrayList<>();
        this.prestamos_activos=new ArrayList<>();
    }
    public void agregarLibro(Libro libro){
        if (libro!=null){
            this.libros_disponibles.add(libro);
        }
    }
    public void agregarAutor(Autor autor){
        if (autor!=null){
            this.autores_registrados.add(autor);
        }
    }
    public void prestarLibro(Estudiante estudiante, Libro libro){
        Prestamo prestamo= new Prestamo("13/10/2025","29/10/2025",estudiante,libro);
        this.prestamos_activos.add(prestamo);
    }
    public void mostrarEstado() {
        System.out.println("----------------------------------------");
        System.out.println(" Esta es la: "+nombre_de_la_biblioteca);
        System.out.println("----------------------------------------");
        System.out.print(" | Horario: "+this.horario+" |");
        System.out.println(" |  Autores Registrados:  |");
        for (Autor a: autores_registrados){
            System.out.print("- ");a.mostrarInfo();
        }
        System.out.println(" |  Libros disponibles:  |");
        for (Libro l: libros_disponibles){
            System.out.print("- ");l.leer();
        }
        System.out.println(" |  Prestamos activos:  | ");
        for (Prestamo p: prestamos_activos){
            System.out.print("- ");p.mostrarInfo();
        }
    }
    public void cerrarBiblioteca(){
        System.out.println(" |  Cerrando la biblioteca...  |");
        for (Prestamo p: prestamos_activos){
            prestamos_activos.remove(p);
        }
        System.out.print("Se cerro la biblioteca... ya no exiten los prestamos");
    }
}
