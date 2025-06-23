import java.util.Scanner;

public class Programa {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno1.nome = sc.nextLine();
        System.out.println("Digite a nota 1: ");
        aluno1.nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        aluno1.nota2 = sc.nextDouble();
        System.out.println("Digite a nota 3: ");
        aluno1.nota3 = sc.nextDouble();
        aluno1.calcularMedia();
        System.out.println("Final Grade: " + aluno1.calcularMedia());

        if (aluno1.calcularMedia() >= 60){
            System.out.println("Pass");
        }
        else {

            System.out.println("Fail");
            aluno1.pontosFaltantes();
            System.out.println("Pontos Faltantes: " + aluno1.pontosFaltantes());
        }


sc.close();


    }

}
