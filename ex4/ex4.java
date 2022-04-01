

public class ex4
{
    public static void main (String args []) {
        System.out.println("Insira seu endereço abaixo");
        //Dados de entrada//
        String estadoUser = Teclado.leString("Digite o nome do seu estado: ");
        String cidadeUser = Teclado.leString("Digite o nome da sua cidade: ");
        String bairroUser = Teclado.leString("Digite o nome do seu bairro: ");
        String ruaUser = Teclado.leString("Digite o nome da sua rua: ");
        int numeroUser = Teclado.leInt("Digite o número da sua residência: ");
        String cepUser = Teclado.leString("Digite o seu CEP: ");
        
        //Dados de saída// 
        System.out.println("Seu endereço é: ");
        System.out.println(cidadeUser + " - " + estadoUser);
        System.out.println(bairroUser + " / " + ruaUser +  " / " + "n°: " + numeroUser);
        System.out.println("CEP: " + cepUser);
        
        
    }
}
