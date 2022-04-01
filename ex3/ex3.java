

public class ex3
{
    public static void main (String args []) {
        System.out.println("Digite seus dados abaixo");
        String nomeUser = Teclado.leString("Digite seu nome:");
        System.out.println("Seu nome é: " + nomeUser);
        double alturaUser = Teclado.leDouble("Digite a sua altura: ");
        System.out.println("Sua altura é: " + alturaUser);
        System.out.println("Processo finalizado, obrigado por insirir os dados");
    }
}
