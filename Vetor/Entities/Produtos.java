package Entities;

public class Produtos {

private String nome;
private double preco;

public Produtos(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
}

public String getNome() {
    return nome;
}

public double getPreco() {
    return preco;
}

public void setPreco(double preco) {
    this.preco = preco;
}

public void setNome(String nome) {
    this.nome = nome;
}

}
