

public class desafio1
{
   public static void main (String args []) {
       System.out.println("Bem-vindo ao formulário de matrícula da faculdade ADA");
       System.out.println("Preencha os dados solicitados a baixo");
       
       //Dados de entrada
       String nome = Teclado.leString("Digite seu nome: ");
       String sobrenome = Teclado.leString("Digite seu sobrenome: ");
       String dataNascimento = Teclado.leString("Digite sua data de nascimento: ");
       String cpf = Teclado.leString("Digite seu CPF: ");
       int conclusaoEnsinoMedio = Teclado.leInt("Digite o ano em que você concluio o ensino médio: ");
       String curso = Teclado.leString("Digite o curso que deseja se candidatar: ");
       double notaEnemNatureza = Teclado.leDouble("Digite sua nota do Enem em Ciências da Natureza e suas Tecnologias: ");
       double notaEnemHumanas = Teclado.leDouble("Digite sua nota do Enem em Ciências Humanas e suas Tecnologias: ");
       double notaEnemLinguagens = Teclado.leDouble("Digite sua nota do Enem em Linguagens, Códigos e suas Tecnologias: ");
       double notaEnemMatematica = Teclado.leDouble("Digite sua nota do Enem em Matemática e suas Tecnologias: ");
       double notaEnemRedacao = Teclado.leDouble("Digite sua nota do Enem em Redação: ");
       double media = (notaEnemNatureza + notaEnemHumanas + notaEnemLinguagens + notaEnemMatematica + notaEnemRedacao)/5;
       
       
       
       
       //Dados de saída
       System.out.println("Cadrasto realizado com sucesso!");
       System.out.println("Nome: " + nome + " " + sobrenome);
       System.out.println("Data de Nascimento: " + dataNascimento);
       System.out.println("CPF: " + cpf);
       System.out.println("Ano de conclusão do Ensino Médio: " + conclusaoEnsinoMedio);
       System.out.println("Curso da candidatura: " + curso);
       System.out.print("Média tirada no Enem: " + media); 
       
       
       
       
       
       
       
   }
}
