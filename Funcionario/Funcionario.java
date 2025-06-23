public class Funcionario {

String name;
double salarioBruto;
double imposto;

public double salarioLiquido(){
  return salarioBruto - imposto;

}

public double aumentarSalario(double porcentagem){

    return salarioBruto += salarioBruto * porcentagem / 100;

}

 }


