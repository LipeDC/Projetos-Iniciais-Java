import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);
       System.out.println("Enter client data:");
       System.out.println("Name:");
       String name = sc.nextLine();
       System.out.println("Email:");
       String email = sc.nextLine();
       System.out.println("Birth date (dd/MM/yyyy):");
       Date birthDate = sdf.parse(sc.next());
       Client client = new Client(name, email, birthDate);
       System.out.println("Enter order data:");
       sc.nextLine();
       System.out.println("Status: " );
       OrderStatus status = OrderStatus.valueOf(sc.nextLine());
       Order order = new Order(new Date(), status, client);

       System.out.println("How many item to this order?");
       int n = sc.nextInt();
       for(int i = 1; i <= n; i++){
           System.out.println("Enter item #" + i + " data:");
           System.out.println("Product name:");
           sc.nextLine();
           String productName = sc.nextLine();
           System.out.println("Product price:");
           double productPrice = sc.nextDouble();
           System.out.println("Quantity:");
           int quantity = sc.nextInt();
           Product product = new Product(productName, productPrice);
           OrderItem item = new OrderItem(quantity, productPrice, product);
           order.addItem(item);
       }

       System.out.println("Order Summary:");
       System.out.println("Order moment: " + order.getMoment());
       System.out.print("Order status: " + order.getStatus());
       System.out.println("Client: " + client.getName() + " - " + "(" + sdf.format(client.getBirthDate()) + ")" + " - " + client.getEmail() );
       System.out.println("Order items:");
       for(OrderItem item : order.getItems()){
           System.out.println(item.getProduct().getName() + " - " + item.getQuantity() + " - " + item.subTotal());
       }
       System.out.println("Total: " + order.total());











    }
}
