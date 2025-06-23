import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();
        List <Product> products = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            System.out.println("Product #" + i + " data: ");
            System.out.println("Common, used or imported (c/u/i)?");
            char resp = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if(resp == 'c'){
                products.add(new Product(name, price));
            }
            else if (resp == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }
            else {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                products.add(new UsedProduct(name, price, manufactureDate));
            }
        }

        System.out.println("Price Tags: ");
        for(Product p : products){
            System.out.println(p.priceTag());
        }

    }


}
