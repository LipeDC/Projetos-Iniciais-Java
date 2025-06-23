package Application;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();
        Altura vetor[] = new Altura[n];



        for(int i=0; i < vetor.length; i++){
            System.out.println("Dados da " + (i+1) +"a pessoa:");
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            vetor[i] = new Altura(nome, idade, altura);
        }

        double soma = 0;
        int menoresDe16 = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i].getAltura();
            if (vetor[i].getIdade() < 16){
                menoresDe16++;
            }
        }
        double media = soma / vetor.length;
        double porcentagemMenoresDe16 = ((double) menoresDe16 / vetor.length) * 100;

        System.out.printf("Média de altura: %.2f\n", media);
        System.out.println("Pessoas com menos de 16 anos: " + porcentagemMenoresDe16);
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i].getIdade() < 16){
                System.out.println(vetor[i].getNome());            }
        }
        sc.close();
    }


}
