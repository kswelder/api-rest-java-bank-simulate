package banco;

/*
 * Classe de objetos Client
 */

import java.time.LocalDateTime;

class Client {
  private String nome;
  private String nascimento = "00/00/0000";
  private LocalDateTime criacao;
  private LocalDateTime atualizacao;

  Client(String nome, String data) {
    this.nome = nome;
    this.criacao = LocalDateTime.now();
    this.atualizacao = criacao;
    
    // Funcao de checagem de valor de data
    checagemDeValor(data);
  }
  public void atualizarDados(
    String novoNome,
    String novoNascimento
  ) {
    this.nome = novoNome;
    checagemDeValor(novoNascimento);
    this.atualizacao = LocalDateTime.now();
  }
  public String getNome() {
    return this.nome;
  }
  public String getNascimento() {
    return this.nascimento;
  }
  public String informacoes() {
    return "Nome: " + this.nome +
      "\nNascimento: " + this.nascimento +
      "\nCriacao: " + this.criacao +
      "\nAtualizacao: " + this.atualizacao;
  }

  // Checa se o valor da data esta em formato correto de data
  private void checagemDeValor(String valor) {
    char[] valores = valor.toCharArray();
    boolean check = false;
    for(int x = 0; x < valor.length();x++) {
      if(valores[x] == '/') {
        continue;
      }
      try {
        int checagem = Integer.parseInt(Character.toString(valores[x]));
        check = true;
      }
      catch(NumberFormatException cerr) {
        check = false;
        break;
      }
    }
    if(check == true) {
      this.nascimento = valor;
    }
  }
}
