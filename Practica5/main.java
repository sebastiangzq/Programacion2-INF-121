public class main {
    public static void main(String[]args){
        Biblioteca biblioteca=new Biblioteca("Bilioteca de Alejandria","lunes, martes, miercoles, jueves, viernes",8,20);
        Libro libro1= new Libro("Don Quijote de la Mancha","|| | | | ||||| ||",new Pagina(455,"Capitulo 5"));
        biblioteca.agregarLibro(libro1);
        Libro libro2= new Libro("Crimen y Castigo","|| | |||| ||| ||| |", new Pagina(247,"Capito 3"));
        biblioteca.agregarLibro(libro2);
        Libro libro3= new Libro("La larga marcha","||| | ||| || | |||", new Pagina(143,"Cap 4"));
        biblioteca.agregarLibro(libro3);
        Autor autor1= new Autor("Miguel Servantes","española");
        biblioteca.agregarAutor(autor1);
        Autor autor2= new Autor("Fiodor Dostoyevski","rusa");
        biblioteca.agregarAutor(autor2);
        Autor autor3= new Autor("Stephen King","estadounidense");
        biblioteca.agregarAutor(autor3);
        Estudiante estudiante= new Estudiante("298697","Juan Perez");
        biblioteca.prestarLibro(estudiante,libro1);
        biblioteca.mostrarEstado();
        biblioteca.cerrarBiblioteca();
    }
}
