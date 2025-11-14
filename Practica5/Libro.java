import java.util.ArrayList;
import java.util.List;
public class Libro {
    private String titulo,ISBN;
    private List<Pagina> paginas;
    public Libro(String titulo, String ISBN,Pagina pagina){
        this.titulo=titulo;
        this.ISBN=ISBN;
        this.paginas=new ArrayList<>();
        this.paginas.add(pagina);
    }
    public void leer(){
        System.out.println("[ Titulo del libro: "+this.titulo+" ]");
    }
}
