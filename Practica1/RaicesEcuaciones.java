import java.util.Scanner;
import static java.lang.Math.sqrt;
public class RaicesEcuaciones {
    private int a;
    private int b;
    private int c;
    public RaicesEcuaciones (int va, int vb, int vc){
        this.a=va; this.b=vb; this.c=vc;
    }
    public int getDiscriminante(){
        int d;
        d=b*b-4*a*c;
        if(d>0){
            return(d);
        }
        else{
            return(d);
        }
    }
    public double getRaiz1(){
        double r1, s;
        s= (double) sqrt(b*b-4*a*c);
        r1=(-b+s)/2*a;
        return (r1);
    }
    public double getRaiz2(){
        double r2, s;
        s= (double) sqrt(b*b-4*a*c);
        r2=(-b-s)/2*a;
        return (r2);
    }
    public String toString(){
        return String.format("Ecu1 [%d, %d]",this.a,this.b,this.c);
    }
    public static void main(String[] args){
        int x, va, vb, vc;
        Scanner lee= new Scanner(System.in);
        System.out.println("Ingrese a, b, c :");
        va= lee.nextInt();
        vb= lee.nextInt();
        vc= lee.nextInt();
        RaicesEcuaciones ecu = new RaicesEcuaciones(va , vb ,vc);
        x=ecu.getDiscriminante();
        if(x>0){
            System.out.println("La ecuacion tiene dos raices = " + ecu.getRaiz1() + " y  " + ecu.getRaiz2());
        }
        if(x==0){
            System.out.println("La ecuacion tiene una raiz = " + ecu.getRaiz1());
        }
        if(x<0){
            System.out.println("La ecuacion no tiene raices reales");
        }

    }
}
