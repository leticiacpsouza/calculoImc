public class Paciente{

  double peso;
  double altura;

  public Paciente (double peso , double altura){
    this.altura = altura;
    this.peso = peso;
  }

  double calcularIMC(){
    return this.peso / (this.altura * this.altura);
  }

  void diagnostico(){
    if (calcularIMC() < 16){
      System.out.println("Baixo peso muito grave");
    }
    else if (calcularIMC()>= 16 && calcularIMC()< 17){
      System.out.println("Baixo peso grave");
    }
    else if (calcularIMC()>= 17 && calcularIMC()<18.50){
      System.out.println("Baixo peso");
    }
    else if (calcularIMC() >=18.50 && calcularIMC() < 25){
      System.out.println("Peso normal");
    }
    else if (calcularIMC() >= 25 && calcularIMC()< 30){
      System.out.println("Sobrepeso");
    }
    else if (calcularIMC() >= 30 && calcularIMC() < 35){
      System.out.println("Obesidade grau I");
    }
    else if (calcularIMC() >= 35 && calcularIMC() < 40){
      System.out.println("Obesidade grau II");
    }
    else{
      System.out.println("Obesidade grau III (obesidade mórbida");
    }

  }
}