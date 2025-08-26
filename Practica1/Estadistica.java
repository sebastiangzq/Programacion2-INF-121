import java.util.Scanner;
import static java.lang.Math.sqrt;
public class Estadistica {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    public Estadistica (float va, float vb, float vc, float vd, float ve, float vf, float vg, float vh, float vi, float vj ){
        this.a=va; this.b=vb; this.c=vc; this.d=vd; this.e=ve; this.f=vf; this.g=vg; this.h=vh; this.i=vi; this.j=vi;
    }
    public float promedio(){
        float prom;
        prom=(a+b+c+d+e+f+g+h+i+j)/10;
        return (prom);
    }
    public float desviacion(){
        float va, vb, vc, vd, ve, vf, vg, vh, vi ,vj, desvi;
        va= (int) Math.pow(a-promedio(),2);
        vb= (int) Math.pow(a-promedio(),2);
        vc= (int) Math.pow(a-promedio(),2);
        vd= (int) Math.pow(a-promedio(),2);
        ve= (int) Math.pow(a-promedio(),2);
        vf= (int) Math.pow(a-promedio(),2);
        vg= (int) Math.pow(a-promedio(),2);
        vh= (int) Math.pow(a-promedio(),2);
        vi= (int) Math.pow(a-promedio(),2);
        vj= (int) Math.pow(a-promedio(),2);
        desvi=(float) sqrt((va+vb+vc+vd+ve+vf+vg+vh+vi+vj)/(9));
        return(desvi);
    }
    public String toString(){
        return String.format("Ecu1 [%d, %d]",this.a,this.b,this.c,this.d,this.e,this.f,this.g,this.h,this.i,this.j);
    }
    public static void main(String[] args){
        float va, vb, vc, vd, ve, vf, vg, vh, vi, vj;
        Scanner lee= new Scanner(System.in);
        System.out.println("Ingrese 10 valores y siempre usando la coma " + "( , ) "+ " si tiene decimales  :");
        va= lee.nextFloat();
        vb= lee.nextFloat();
        vc= lee.nextFloat();
        vd= lee.nextFloat();
        ve= lee.nextFloat();
        vf= lee.nextFloat();
        vg= lee.nextFloat();
        vh= lee.nextFloat();
        vi= lee.nextFloat();
        vj= lee.nextFloat();
        Estadistica ecu = new Estadistica(va, vb, vc, vd, ve, vf, vg, vh, vi, vj);
        System.out.println("EL promedio es = " + ecu.promedio());
        System.out.println("La desviacion estandar es = " + ecu.desviacion());
    }
}
