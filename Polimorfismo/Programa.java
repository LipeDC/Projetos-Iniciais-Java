import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees:");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i<=n; i++) {
            System.out.println("Enter #" + i + " data:");
            System.out.println("Outsourced (y/n)?");
            char resp = sc.nextLine().charAt(0);

            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Hours:");
            int hours = sc.nextInt();
            System.out.println("Value per hour:");
            double valuePerHours = sc.nextDouble();
sc.nextLine();
            if (resp == 'y') {
                System.out.println("Additional charge:");
                double additionalCharge = sc.nextDouble();
                sc.nextLine();
                Employee emp = new OutSourcedEmployee(name, hours, valuePerHours, additionalCharge);
                list.add(emp);
            } else {
                Employee emp = new Employee(name, hours, valuePerHours);
                list.add(emp);
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : list) {
            System.out.println(emp.getName() + "- $" + emp.payment());
        }

        sc.close();
    }


}
