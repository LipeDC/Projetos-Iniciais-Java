public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }



    public int getQuantidade(){
        return quantidade;
    }

public double calcularTotal(){
    return preco * quantidade;
}

public void addProduto(int quantidade){

   this.quantidade += quantidade;


}

public void subProduto(int quantidade){

        this.quantidade -= quantidade;

}

}
