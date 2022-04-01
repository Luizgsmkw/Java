

public class ex5
{
  public static void main(String args []) {
      // Dados de entrada //
      int n1 = Teclado.leInt("Digite o primeiro número: ");
      int n2 = Teclado.leInt("Digite o segundo número: ");
      int n3 = Teclado.leInt("Digite o terceiro número: ");
      int n4 = Teclado.leInt("Digite o quarto número: ");
      int n5 = Teclado.leInt("Digite o quinto número: ");
      
      //contas//
      int soma = n1 + n2 + n3 + n4 + n5;
      int somaProduto = n1*n2*n3*n4*n5;
      System.out.println("A soma dos números é igual a: " + soma);
      System.out.printf("O produto é igual a: " + somaProduto);
      
     
 }
}
