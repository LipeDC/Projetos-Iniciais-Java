import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (dd/MM/yyyy): ");
        Date birthDate = sdf.parse(sc.next());
        Client client = new Client(name, email, birthDate);
        System.out.println("Enter order data:");
        System.out.println("Status:");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        Order order = new Order(new Date(), status, client);
System.out.println("How many items to this order? ");
int n = sc.nextInt();

for (int i = 1; i <= n; i++) {
    System.out.println("Item #" + i + ":");
    System.out.print("Product name: ");
    sc.nextLine();
    String productName = sc.nextLine();
    System.out.print("Price: ");
    Double price = sc.nextDouble();
    System.out.print("Quantity: ");
    Integer quantity = sc.nextInt();
    Product product = new Product(productName, price);
    OrderItem item = new OrderItem(quantity, price, product);
    order.addItem(item);
}
System.out.println();
System.out.println(order);


sc.close();
    }
}
