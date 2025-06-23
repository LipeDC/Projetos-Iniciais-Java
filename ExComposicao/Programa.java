import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite o nome do departamento: ");
        String nomeDepartamento = scanner.nextLine();
        System.out.println("Enter worker data");
        System.out.println("Digite o nome do trabalhador: ");
        String nomeTrabalhador = scanner.nextLine();
        System.out.println("Level:");
        String level = scanner.nextLine();
        System.out.println("Salário base:");
        double salarioBase = scanner.nextDouble();

        Trabalhador trabalhador = new Trabalhador(
                nomeTrabalhador,
                WorkerLevel.valueOf(level),
                salarioBase,
                new Department(nomeDepartamento)
        );

        System.out.println("Quantos contratos o trabalhador terá?");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data");
            System.out.println("Data (DD/MM/AAAA): ");
            LocalDate contractDate = LocalDate.parse(scanner.nextLine(), dtf);

            System.out.println("Valor por hora:");
            double valorPorHora = scanner.nextDouble();
            System.out.println("Horas trabalhadas:");
            int horas = scanner.nextInt();
            scanner.nextLine();

            HourContract contract = new HourContract(contractDate, valorPorHora, horas);
            trabalhador.addContract(contract);
        }

        System.out.print("Coloque o mês e o ano para calcular a renda: (MM/YYYY) ");
        String monthYear = scanner.next();
        int month = Integer.parseInt(monthYear.substring(0, 2));
        int year = Integer.parseInt(monthYear.substring(3));

        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartment().getName());
        System.out.println("Renda por: " + monthYear + ": " +
                String.format("%.2f", trabalhador.income(month, year)));

        scanner.close();
    }
}
