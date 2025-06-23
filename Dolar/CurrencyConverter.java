public class CurrencyConverter {

    public double valor;
    public double quantidadeDollar;

    public static final double IOF = 0.06;

    public double conversao(){

        return (quantidadeDollar * valor) + (quantidadeDollar * valor * IOF);

    }

}
