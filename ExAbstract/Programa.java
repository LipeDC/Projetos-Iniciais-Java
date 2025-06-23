import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Contribuintes> contribuinte = new ArrayList<>();
        System.out.println("Enter the number of tax payers:");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)?");
            char resp = sc.next().charAt(0);
            System.out.println("Name:");
            String nome = sc.next();
            System.out.println("Anual Income");
            double rendaAnual = sc.nextDouble();
if(resp == 'i'){
     System.out.println("Health expenditures:");
    double gastosSaude = sc.nextDouble();
    contribuinte.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
}
else if(resp == 'c'){
    System.out.println("Number of employees:");
    int numeroFuncionarios = sc.nextInt();
    contribuinte.add(new PessoaJuridica(nome,rendaAnual,numeroFuncionarios));
}

        }
        System.out.println("TAXES PAID:");
        for (Contribuintes c : contribuinte){
            System.out.println(c.getNome() + " $ " + c.calcImposto());
        }

        double soma = 0;
        for(Contribuintes c : contribuinte){
            soma += c.calcImposto();
        }

        System.out.println("TOTAL TAXES:" + " $ " + soma);
    }
}
