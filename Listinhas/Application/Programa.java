package Application;

import Entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
    System.out.println("How many Employees will be registered?");
    int quantidade = sc.nextInt();


        for (int i = 1; i <= quantidade; i++){
            System.out.println("Employee #"+ i);
            System.out.println("Id");
            int id = sc.nextInt();
            System.out.println("Name");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Salary");
            sc.nextLine();
            double salario = sc.nextDouble();
            Funcionario funcionario = new Funcionario(id, nome, salario);
            funcionarios.add(funcionario);
        }

        System.out.println("Enter the employee id that will have salary increase :");
        int id = sc.nextInt();
        for (Funcionario funcionario : funcionarios){
            if (funcionario.getId() == id){
                System.out.println("Enter the percentage to be increase in salary:");
                double percentual = sc.nextDouble();
                funcionario.aumentarSalario(percentual);
            }
        }
            System.out.println("List of employees: ");
            for (Funcionario funcionario : funcionarios){
                System.out.println(funcionario.getId() + " - " + funcionario.getNome() + " - " + funcionario.getSalario());
            }
        }


    }



