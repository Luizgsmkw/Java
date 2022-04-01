

public class Teste
{
    public static void main(String args [])
    {
        // p1 é o objeto
        // new Pessoa é
        //p1 é uma variável objeto 
        Pessoa p1 = new Pessoa("Maria", 21, "Copacabana");
        p1.setNome("Mariiiaa"); // alterar o conteúdo do atributo nome com o set
        p1.exibeDados(); // invacando os metodos criados na classe pessoa
        System.out.println(p1.fazAniversario() + p1.getNome());
        
        
        String nome = Teclado.leString("Digite seu nome: ");
        int id = Teclado.leInt("Digite sua idade: ");
        String endereco = Teclado.leString("Digite seu endereço: ");
        Pessoa p2 = new Pessoa(nome, id, endereco); // CONTEÚDO QUE tá dentro do parâmetro é das variáveis que foram preenchidas
        
        // posso utilizar as variáveis novamente, no entando só tenho que colocar o nome e não o tipo
        nome = Teclado.leString("Digite seu nome: ");
        id = Teclado.leInt("Digite sua idade: ");
        endereco = Teclado.leString("Digite seu endereço: ");
        Pessoa p3 = new Pessoa(nome, id, endereco);
        
        
        p1.exibeDados();
        p2.exibeDados();
        p3.exibeDados();
        
    }
}
