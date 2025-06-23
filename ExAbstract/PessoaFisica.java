public class PessoaFisica extends Contribuintes {
    private double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calcImposto() {
        double imposto ;

        if (getRendaAnual() < 20000) {
            imposto = (getRendaAnual() / 100 * 15) - gastosSaude / 100 * 50 ;
        }
        else {
            imposto = (getRendaAnual() / 100 * 25)  - gastosSaude / 100 * 50 ;;
        }
        return imposto;
    }
}