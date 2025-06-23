public class PessoaJuridica extends Contribuintes {
private int numeroFuncionarios;

public PessoaJuridica(){
    super();
}

    public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double calcImposto() {
    double imposto;
        if(numeroFuncionarios <= 10){
            imposto = getRendaAnual() / 100 * 16;

        }
        else {
            imposto = getRendaAnual() / 100 * 14;
        }
        return imposto;
    }
}
