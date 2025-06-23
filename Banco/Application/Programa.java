package Application;

import Banco.Conta;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta;
        System.out.println("Digite o numero da conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("Digite o nome do titular: ");
        sc.nextLine();
        String nomeTitular = sc.nextLine();
        System.out.println("Gostaria de um depósito inicial? y/n");
        char resposta = sc.nextLine().charAt(0);
        if(resposta == 'y'){
            System.out.println("Coloque o valor do depósito");
            double deposito = sc.nextDouble();
            conta = new Conta(numeroConta,nomeTitular, deposito);

        }else{
            conta = new Conta(numeroConta,nomeTitular);
        }
        System.out.println(conta);
        System.out.println("Coloque um valor de deposito");
        double deposito = sc.nextDouble();
        conta.depositar(deposito);
        System.out.println(conta);
        System.out.println("Digite um valor para sacar");
        double saque = sc.nextDouble();
        conta.sacar(saque);
        System.out.println(conta);
    }
}
