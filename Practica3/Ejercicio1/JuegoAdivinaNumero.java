import java.util.Random;
import java.util.Scanner;
public class JuegoAdivinaNumero extends Juego{
    public int numeroAAdivinar;
    public JuegoAdivinaNumero(int numeroDeVidas){
        super(numeroDeVidas);
    }
    public void juega(){
        reiniciaPartida();
        Scanner lee=new Scanner(System.in);
        boolean nvidas=true;
        Random random=new Random();
        this.numeroAAdivinar=random.nextInt(10)+1;
        System.out.println("------------------------------");
        System.out.println("Adivine un numero del 1 al 10:");
        System.out.println("------------------------------");
        int numeroAAdivinado= lee.nextInt();
        if(numeroAAdivinado==this.numeroAAdivinar){
            System.out.println("| Acertaste!! |");
            actualizaRecord(1);
        }
        else {
            nvidas=quitaVida();
            while(nvidas==true){
                System.out.println("| Fallaste, aun le quedan vidas, intentelo de nuevo!! |");
                if(numeroAAdivinado>this.numeroAAdivinar)
                {
                    System.out.println("| El numero a adivinar es menor |");
                }
                else{
                    System.out.println("| El numero a adivinar es mayor |");
                }
                System.out.println("------------------------------");
                System.out.println("Adivine un numero del 1 al 10:");
                System.out.println("------------------------------");
                numeroAAdivinado= lee.nextInt();
                if(numeroAAdivinado==this.numeroAAdivinar){
                    System.out.println("| Acertaste!! |");
                    actualizaRecord(1);
                    break;
                }
                else {
                    nvidas=quitaVida();
                }
                if(nvidas==false){
                    System.out.println("| Ya no te quedan vidas!! |");
                }
            }
        }
    }
    public String toString(){
        int record= actualizaRecord(0);
        return "[ Su record fue de: "+record+" ]";
    }
}
