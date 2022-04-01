

public class ex7
{
 public static void main(String args []) {
     // notas //
     double notaTrabalho = Teclado.leDouble("Digite sua nota do trabalho: ");
     double notaProva = Teclado.leDouble("Digite sua nota da prova: ");
     double notaTeste = Teclado.leDouble("Digite sua nota do teste: ");
     double somaNotas = notaTrabalho + notaProva + notaTeste;
     // mostrar as notas //
     System.out.println("Trabalho = 10% da sua nota: " + notaTrabalho);
     System.out.println("Prova = 60% da sua nota: " + notaProva);
     System.out.println("Teste = 30% da sua nota: " + notaTeste);
     System.out.printf("Total = 100% da sua nota: " + somaNotas); 
     
 }
}
