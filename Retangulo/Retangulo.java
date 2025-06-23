public class Retangulo {
    double largura;
    double altura;

    public double area(){
        return altura * largura;
    }

    public double perimetro(){
        return altura * 2 + largura * 2 ;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(altura,2) + Math.pow(largura,2));
    }

}
