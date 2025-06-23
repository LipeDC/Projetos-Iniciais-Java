import java.awt.geom.Area;
import java.util.Scanner;

public class Programa {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Coloque a largura e altura do retangulo:");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();
        System.out.println(retangulo.area());
        System.out.println(retangulo.perimetro());
        System.out.println(retangulo.diagonal());


    }

}
