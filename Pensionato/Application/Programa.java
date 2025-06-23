package Application;

import Entidades.Reserva;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Reserva[] vetor = new Reserva[10];

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Rent #" + (i) + ":");
            System.out.println("Name:");
            String nome = sc.next();
            sc.nextLine();
            System.out.println("Email:");
            String email = sc.next();
            System.out.println("Room:");
            int roomNumber = sc.nextInt();
            vetor[roomNumber] = new Reserva(nome, email);
        }


        System.out.println("Busy rooms:");
       for(int i = 0; i < vetor.length; i++){
           if(vetor[i] != null){
               System.out.println(i + ": "  + vetor[i].getNome() + ", " + vetor[i].getEmail());
           }
       }

        sc.close();

    }





}
