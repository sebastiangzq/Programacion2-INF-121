public class Persona {
    private String nombre;
    private int edad;
    private float pesoPersona;
    public Persona(String nombre, int edad, float pesoPersona){
        this.nombre=nombre;
        this.edad=edad;
        this.pesoPersona=pesoPersona;
    }
    public float getPeso(){
        return pesoPersona;
    }

    public int getEdad() {
        return edad;
    }
}
