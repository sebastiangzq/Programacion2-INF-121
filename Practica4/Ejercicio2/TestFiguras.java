import java.util.Random;
import java.util.Scanner;
public class TestFiguras {
    public static void main(String[]args){
        Scanner lee=new Scanner(System.in);
        Random random=new Random();
        Figura[] figuras=new Figura[5];
        String[] colores={"Rojo","Azul","Verde","Amarillo","Negro"};
        for (int i=0; i< figuras.length;i++){
            int tipo=random.nextInt(2)+1;
            String color= colores[random.nextInt(colores.length)];
            if(tipo==1){
                double lado = 1+ random.nextDouble()*9;
                figuras[i]=new Cuadrado(lado, color);
            }
            else {
                double radio = 1+ random.nextDouble()*9;
                figuras[i]=new Circulo(radio,color);
            }
        }
        for (Figura figura: figuras){
            System.out.println(figura.toString());
            System.out.println("Area: "+figura.area());
            System.out.println("Perimetro: "+figura.perimero());
            if (figura instanceof Coloreado){
                Coloreado coloreado=(Coloreado) figura;
                System.out.println("Como colorear: "+ coloreado.comoColorear());
            }
        }
    }
}
