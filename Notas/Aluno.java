public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;

    public double calcularMedia(){
        return (nota1 + nota2 + nota3);
    }

    public double pontosFaltantes(){
        if (calcularMedia() < 60){
            return 60 - calcularMedia();
        }
        return 0;
    }


}
