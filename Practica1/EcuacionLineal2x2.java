import java.util.Scanner;

public class EcuacionLineal2x2 {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    public EcuacionLineal2x2 (int va, int vb, int vc, int vd, int ve, int vf){
        this.a=va;this.b=vb;this.c=vc;this.d=vd;this.e=ve;this.f=vf;
    }
    public boolean TieneSolucion(){
        if(a*d-b*c==0){
            return (true);
        }
        else{
            return (false);
        }
    }
    public int getX(){
        int x;
        x=(e*d-b*f)/(a*d-b*c);
        return (x);
    }
    public int getY(){
        int y;
        y=(a*f-e*c)/(a*d-b*c);
        return (y);
    }
    public String toString(){
        return String.format("Ecu1 [%d, %d]",this.a,this.b,this.c,this.d,this.e,this.f);
    }
    public static void main(String[] args){
        int va,vb,vc,vd,ve, vf;
        Scanner lee= new Scanner(System.in);
        System.out.println("Ejercicio N°1");
        System.out.println("Ingrese a, b, c ,d ,e ,f :");
        va= lee.nextInt();
        vb= lee.nextInt();
        vc= lee.nextInt();
        vd= lee.nextInt();
        ve= lee.nextInt();
        vf= lee.nextInt();
        EcuacionLineal2x2 ecu = new EcuacionLineal2x2(va, vb, vc, vd, ve, vf);
        boolean x;
        x= ecu.TieneSolucion();
        if(x==true){
            System.out.println("No tiene solucion");
        }
        else{
            System.out.println("X = " + ecu.getX());
            System.out.println("Y = " + ecu.getY());
        }
    }
}
