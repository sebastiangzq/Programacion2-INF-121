public class Aplicacion {
    public static void main(String[]args){
        System.out.println("______________________");
        System.out.println("Adivinacion de numeros");
        System.out.println("______________________");
        JuegoAdivinaNumero juego=new JuegoAdivinaNumero(3);
        juego.juega();
        System.out.println((juego));
        System.out.println("____________________________");
        System.out.println("Adivinacion de numeros pares");
        System.out.println("____________________________");
        JuegoAdivinaPar juego1=new JuegoAdivinaPar(3);
        juego1.juega();
        System.out.println((juego1));
        System.out.println("______________________________");
        System.out.println("Adivinacion de numeros impares");
        System.out.println("______________________________");
        JuegoAdivinaImpar juego2=new JuegoAdivinaImpar(3);
        juego2.juega();
        System.out.println((juego2));
    }
}
