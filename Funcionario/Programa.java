import java.util.Scanner;

public class Programa {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Nome:");
        funcionario.name = sc.nextLine();
        System.out.println("Salário:");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Imposto:");
        funcionario.imposto = sc.nextDouble();

        
        System.out.println("Employee: " + funcionario.name + " " + funcionario.salarioLiquido());

        System.out.println("Quantos porcento você gostaria de aumentar o salário?");
        double porcentagem = sc.nextDouble();
        funcionario.aumentarSalario(porcentagem);
        System.out.println("Dados atualizados: " + funcionario.name + " " + funcionario.salarioLiquido());
    }

}