import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Digite o valor");
        double preco = sc.nextDouble();
        System.out.println("Digite a quantidade");
        int quantidade = sc.nextInt();
        Produto p = new Produto(nome, preco, quantidade);
        System.out.println(p.getNome() + " " + p.getPreco() + " " + p.getQuantidade() + " " + p.calcularTotal());
        System.out.println("Coloque a quantidade que deseja adicionar: ");
        quantidade = sc.nextInt();
        p.addProduto(quantidade);
        System.out.println(p.getNome() + " " + p.getPreco() + " " + p.getQuantidade() + " " + p.calcularTotal());
        System.out.println("Coloque a quantidade que deseja subtrair: ");
        quantidade  = sc.nextInt();
        p.subProduto(quantidade);
        System.out.println(p.getNome() + " " + p.getPreco() + " " + p.getQuantidade() + " " + p.calcularTotal());


    }

}
