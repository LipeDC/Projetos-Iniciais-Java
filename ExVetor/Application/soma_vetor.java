package Application;

import java.util.Scanner;

public class soma_vetor {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double vetor[] = new double[n];

        for( int i = 0; i < vetor.length; i++){
            System.out.println("Digite um valor: ");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;
        for(int i = 0; i< vetor.length; i++){
            soma += vetor[i];
        }
        double media = soma / vetor.length;
        System.out.println("Valores: ");
        for(int i = 0; i< vetor.length; i++){
            System.out.println(vetor[i]);
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: "+  media);

    }
}
