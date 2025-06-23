import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of shapes:");
        int n = sc.nextInt();
        List<Shape> formas = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.println("Rectangle or cicle (c/r)?");
            char resp = sc.next().charAt(0);
            System.out.println("Color (BLACK, BLUE, RED):");
            Color color = Color.valueOf(sc.next());
            if (resp == 'r') {

                System.out.println("Width:");
                double width = sc.nextDouble();
                System.out.println("Height:");
                double height = sc.nextDouble();
                formas.add(new Rectangle(width, height, color));
            } else {
                System.out.println("Radius:");
                double radius = sc.nextDouble();
                formas.add(new Circle(color,radius));
            }

        }
        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape forma : formas) {
            System.out.println(String.format("%.2f", forma.area()));
        }
        sc.close();
    }

    }


