

public class ex2
{
    public static void main (String args []) {
        System.out.println("Digite seus dados");
        String nomeUser = Teclado.leString("Digite seu nome: ");
        int idadeUser = Teclado.leInt("Digite sua ideade: ");
        System.out.println("Seu nome é: " + nomeUser);
        System.out.println("Sua idade é: " + idadeUser);
        
    }
}
