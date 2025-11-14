public class Autor {
    private String nombre,nacionalidad;
    public Autor(String nombre, String nacionalidad){
        this.nombre=nombre;
        this.nacionalidad=nacionalidad;
    }
    public void mostrarInfo(){
        System.out.println("Autor [ nombre: "+this.nombre+", nacionalidad: "+this.nacionalidad+" ]");
    }
}
