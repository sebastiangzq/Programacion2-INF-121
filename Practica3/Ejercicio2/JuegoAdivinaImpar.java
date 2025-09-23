import java.util.Random;
import java.util.Scanner;
public class JuegoAdivinaImpar extends JuegoAdivinaNumero{
    public JuegoAdivinaImpar(int numeroDeVIdas){
        super(numeroDeVIdas);
    }
    @Override
    public boolean validaNumero() {
        Scanner lee = new Scanner(System.in);
        int num;
        Random random=new Random();
        do {
            this.numeroAAdivinar=random.nextInt(10)+1;
        }while (this.numeroAAdivinar%2==0);
        System.out.println("Ingrese un numero entre 0 y 10: ");
        num = lee.nextInt();
        this.num=num;
        if(num>10 || num<=0){
            System.out.println("[ Error ]");
            return false;
        }
        else{
            if(num%2!=0){
                return true;
            }
            else {
                System.out.print("[ Error ]");
                return false;
            }
        }
    }
}
