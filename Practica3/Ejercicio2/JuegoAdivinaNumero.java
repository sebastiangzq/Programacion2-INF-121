import java.util.Random;
import java.util.Scanner;
public class JuegoAdivinaNumero extends Juego{
    public int numeroAAdivinar;
    public int num;
    public JuegoAdivinaNumero(int numeroDeVidas){
        super(numeroDeVidas);
    }
    public boolean validaNumero() {
        Scanner lee = new Scanner(System.in);
        int num;
        System.out.println("------------------------------");
        System.out.println("Adivine un numero del 1 al 10:");
        System.out.println("------------------------------");
        num = lee.nextInt();
        this.num=num;
        Random random=new Random();
        this.numeroAAdivinar=random.nextInt(10)+1;
        if(num>=0 && num<=10){
            return true;
        }
        else {
            System.out.print("[ Error ]");
            return false;
        }
    }
    public void juega(){
        reiniciaPartida();
        Scanner lee=new Scanner(System.in);
        boolean nvidas=true;
        if(validaNumero()==true){
            int numeroAAdivinado=this.num;
            if(numeroAAdivinado==this.numeroAAdivinar){
                System.out.println("| Acertaste!! |");
                actualizaRecord(1);
            }
            else {
                nvidas=quitaVida();
                System.out.println("| Fallaste, aun le quedan vidas, intentelo de nuevo!! |");
                while(nvidas==true){
                    if(numeroAAdivinado>this.numeroAAdivinar)
                    {
                        System.out.println("| El numero a adivinar es menor |");
                    }
                    else{
                        System.out.println("| El numero a adivinar es mayor |");
                    }
                    validaNumero();
                    numeroAAdivinado=this.num;
                    if(numeroAAdivinado==this.numeroAAdivinar){
                        System.out.println("| Acertaste!! |");
                        actualizaRecord(1);
                        break;
                    }
                    else {
                        nvidas=quitaVida();
                        System.out.print("| Fallaste, ");
                        if(nvidas==false){
                            System.out.println(" ya no te quedan vidas!! |");
                        }
                        else {
                            System.out.println("| aun le quedan vidas, intentelo de nuevo!! |");
                        }
                    }
                }
            }
        }
    }
    public String toString(){
        int record= actualizaRecord(0);
        return "[ Su record fue de: "+record+" ]";
    }
}
