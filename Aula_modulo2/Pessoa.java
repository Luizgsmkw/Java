

public class Pessoa
{
 private String nome;
 private int idade;
 private char sexo;
 
 public Pessoa (String n, int id, char sx) {
     nome = n;
     idade = id;
     sexo = sx; 
 }
 // o método get tem a função de retornar um atributo (que normalmente é privado)
 public String getNome() {
     return nome; //o tipo-de-retorno é de acordo com o valor do atributo, no caso nome é uma String, então o tipo-de-retorno colocamos String.
 }
 // getIdade retorna o valor do atributo idade.
 public int getIdade() {
     return idade; 
 }
 
 public char getSexo() {
     return sexo;
 }
 
 public void setNome(String novoNome){
     nome = novoNome;
 }
 
 public void setIdade(int novaIdade){
     idade = novaIdade;
 }
 
 public void setSexo(char novoSexo){
     sexo = novoSexo;
 }
}
