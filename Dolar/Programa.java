import java.util.Scanner;

public class Programa {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CurrencyConverter conversor = new CurrencyConverter();
        System.out.println("Digite o valor em dolar: ");
        conversor.valor = sc.nextDouble();
        System.out.println("Digite a quantidade de dolares: ");
        conversor.quantidadeDollar = sc.nextDouble();
        conversor.conversao();
        System.out.println(conversor.conversao());



    }
}
