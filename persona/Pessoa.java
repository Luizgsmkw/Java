

public class Pessoa //classe
{
   //atributos
    private String Nome;
    private int Idade; 
    private String Endereco; 
    
    public Pessoa(String n, int i, String in) //construtor 
    {
        Nome = n;
        Idade = i;
        Endereco = in;
    }
    //metódo de acesso ao atributo (set = adiciona um novo conteúdo na variável)
    public void setNome(String novoNome) {
        Nome = novoNome;
        
    }
    
    public void setIdade(int novaIdade) {
        Idade = novaIdade;
    }
    
    public void setEndereco(String novoEndereco) {
        Endereco = novoEndereco; 
    }
    // metódo de acesso ao atributo (get = dá acesso ao conteúdo de um atributo(já que o atributo é sempre privado)
    // o get depois de escrever a visibilidade (public) precisa colocar o tipo de retorno e esse retorno vai ser sempre o tipo de atributo que  que vc quer que retorne 
    public String getNome() {
        return Nome; 
    }
    
    public int getIdade() {
        return Idade;
    }
    
    public String getEndereco() {
        return Endereco; 
    }
    
    public void exibeDados() {
        System.out.println("--Dados da Pessoa--");
        System.out.println("Nome: " + Nome);
        System.out.println("Idade: " + Idade);
        System.out.println("Endereço: " + Endereco);
    }
    
    public String fazAniversario() {
        Idade = Idade + 1;
        String pr = "Parabens";
        return pr;
    }
}
