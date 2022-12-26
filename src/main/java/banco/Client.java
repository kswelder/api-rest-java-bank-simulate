package banco;

import java.time.LocalDateTime;

class Client {
  private String nome;
  private String nascimento;
  private LocalDateTime criacao;
  private LocalDateTime atualizacao;

  Client(String nome, String data) {
    this.nome = nome;
    this.nascimento = data;
    this.criacao = LocalDateTime.now();
    this.atualizacao = criacao;

    checagemDeValor(data);
  }
  public String informacoes() {
    return "Nome: " + this.nome +
      "\nNascimento: " + this.nascimento +
      "\nCriacao: " + this.criacao +
      "\nAtualizacao: " + this.atualizacao;
  }
  private void checagemDeValor(String valor) {
    String skol = "sem conteudo";
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
      skol = "tudo certin";
    }
    else {
      skol = "deu rim";
    }
    System.out.println(skol);
  }
}
