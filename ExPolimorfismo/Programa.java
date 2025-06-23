import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + ":");
            System.out.println("Common, used or imported (c/u/i)?");
            char resp = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(resp == 'c'){
                products.add(new Product(name, price));
            }
            else if (resp == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(name,price, date));

            }

            else {
                System.out.println("Customs fee: ");
                double fee = sc.nextDouble();
                products.add(new ImportedProduct(name,price, fee));
            }
        }

        System.out.println();
        System.out.println("ETIQUETAS DE PREÇO");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }
sc.close();
        }
    }

