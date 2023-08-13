public class Argumentos {
  public void Run() {
    dadosPessoais("LDA", 19, "Portuguesa");
  }

  public void dadosPessoais(String nome, int idade, String nacionalidade) {
    System.out.printf("Nome: %s\n", nome);
    System.out.printf("Idade: %d\n", idade);
    System.out.printf("Nacionalidade: %s", nacionalidade);
  }
}

/*
  Nome: LDA
  Idade: 19
  Nacionalidade: Portuguesa
*/
