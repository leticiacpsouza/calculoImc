class Main {
  public static void main(String[] args) {

    Paciente leticia = new Paciente(69,1.70);
  
     Paciente ana = new Paciente(50,1.69);
     
     Paciente victor = new Paciente(100,1.75);
    


    System.out.printf("IMC Leticia: %.2f\n",leticia.calcularIMC());
    System.out.print("Diagnóstico: ");
    leticia.diagnostico();

    System.out.printf("IMC Ana: %.2f\n",ana.calcularIMC());
    System.out.print("Diagnóstico: ");
    ana.diagnostico();

    System.out.printf("IMC Victor: %.2f\n",victor.calcularIMC());
    System.out.print("Diagnóstico: ");
    victor.diagnostico();
  }
}