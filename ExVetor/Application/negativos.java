package Application;

import java.util.Scanner;

public class negativos {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você irá digitar?");
        int n = sc.nextInt();
        int vetor[] = new int [n];


        if(n <= 10){
            for(int i = 0; i < vetor.length; i++){
                System.out.println("Digite um valor: ");
                sc.nextLine();
                vetor[i] = sc.nextInt();
            }
            }
        else {
            System.out.println("Vetor fora do limite");
        }

        System.out.println("Números negativos: ");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }

}
