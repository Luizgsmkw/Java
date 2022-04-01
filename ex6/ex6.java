

public class ex6
{
  public static void main(String args []) {
      // Entrada de dados //
      int n1 = Teclado.leInt("Digite o primeiro número: ");
      int n2 = Teclado.leInt("Digite o segundo número: ");
      int n3 = Teclado.leInt("Digite o terceiro número: ");
      int n4 = Teclado.leInt("Digite o quarto número: ");
      int n5 = Teclado.leInt("Digite o quinto número: ");
      // Criação das varáveis //
      int a = n1;
      int b = n2;
      int c = n3;
      int d = n4;
      int e = n5;
      // contas //
      System.out.printf("A área do triângulo é de: ", (double) ((b * c)/2));
      System.out.println("O perímetro do retângulo é de: " + 2*(b + c)); 
      System.out.println("A área do círculo é de: " + 3.1415 * (Math.pow(e,2)));
      
      
  }
}
