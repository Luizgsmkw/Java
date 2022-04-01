

public class DescontoLanche
{   // atributos
    // o codigo de estudante serve para o aluno da universidade ganhar desconto no lanche
    private String nomeLanche;
    private String codigoLanche;
    private double valorLanche;
    private String codigoEstudante;
    // construtor
    public DescontoLanche (String no, String cl, double va, String ce) {
        nomeLanche = no;
        codigoLanche = cl;
        valorLanche = va;
        codigoEstudante = ce;
    }
    
    // get
    
    public String getNomeLanche() {
        return nomeLanche;
    }
    
    public String getCodigoLanche() {
        return codigoLanche;
    }
    
    public double getValorLanche() {
        return valorLanche; 
    }
    
    public String getCodigoEstudante() {
        return codigoEstudante;
    }
    
    // set
    
    public void setNomeLanche(String novoNomeLanche) {
        nomeLanche = novoNomeLanche;
    }
    
    public void setCodigoLanche(String novoCodigoLanche) {
        codigoLanche = novoCodigoLanche;
    }
    
    public void setValorLanche(double novoValorLanche) {
        valorLanche = novoValorLanche;
    }
    
    public void setCodigoEstudante(String novoCodigoEstudante) {
        codigoEstudante = novoCodigoEstudante;
    }
    
    // metodo para exibir os dados
    public void exibeDados() {
        System.out.println("--Dados da Lanche--");
        System.out.println("Nome lanche: " + nomeLanche);
        System.out.println("C[odigo do lanche: " + codigoLanche);
        System.out.println("Valor do lanche: " + valorLanche);
        System.out.println("Codigo do estudante: " + codigoEstudante);
    }
    // metodo para dar o desconto de 10% para os alunos 
    public void descontoEstudante() {
       valorLanche = valorLanche - (valorLanche * 0.10);
    }
    
    
    
}
