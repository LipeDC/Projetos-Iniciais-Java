package Application;

import Entities.Produtos;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Produtos[] vetor = new Produtos[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vetor[i] = new Produtos(nome, preco);
        }
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i].getPreco();
        }
        double avg = soma / n;

        System.out.printf("MEDIA = %.2f\n", avg);



        sc.close();

    }


}
