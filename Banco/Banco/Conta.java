package Banco;

public class Conta {
    private int numero;
    private String nomeTitular;
    private double valorConta;

    public Conta(int numero, String nomeTitular, double depositoInicial) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        depositar(depositoInicial);
    }

    public Conta(int numero,String nomeTitular){
        this.numero = numero;
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void sacar(double valor){
        this.valorConta -= valor + 5;
    }

    public void depositar(double valor){
        this.valorConta += valor;
    }

    public String toString(){
        return "Numero da conta: " + numero + " Nome do titular: " + nomeTitular + " Saldo da conta: " + valorConta;
    }

}

