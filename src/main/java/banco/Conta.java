package banco;

import java.time.LocalDateTime;

/*
 * Objeto classe de criacao de conta
 */
class Conta{
  private Endereco endereco;
  private Client cliente;
  private String titular;
  private double saldo;
  //private String conta;
  private LocalDateTime criacao;
  private LocalDateTime atualizacao;

  Conta(
      Endereco novoEndereco,
      Client novoClient,
      double novoSaldo
    ) {
    this.endereco = novoEndereco;
    this.cliente = novoClient;
    this.titular = novoClient.getNome();
    this.saldo = novoSaldo;
    this.criacao = LocalDateTime.now();
    this.atualizacao = LocalDateTime.now();
  }
  public boolean sacar(double valor) {
    if(valor > 0 && valor <= this.saldo) {
      this.saldo -= valor;
      return true;
    }
    else {
      return false;
    }
  }
  public boolean depositar(double valor) {
    if(valor > 0) {
      this.saldo += valor;
      return true;
    }
    else {
      return false;
    }
  }
  public boolean transferir(double valor, Conta outraConta) {
    if(this.sacar(valor) == true) {
      outraConta.depositar(valor);
      return true;
    }
    else {
      return false;
    }
  }
  public void atualizarDados(
    Endereco novoEndereco,
    Client novoClient
  ) {
    this.titular = novoClient.getNome();
    this.cliente = novoClient;
    this.endereco = novoEndereco;
    this.atualizacao = LocalDateTime.now();
  }
  public String informacoes() {
    String infoClient = this.cliente.informacoes();
    String infoEndereco = this.endereco.getEndereco();
    return "Cliente: \n" + infoClient +
      "|====================================|\n"+
      "Endereco: \n" + infoEndereco +
      "|====================================|\n"+
      "Saldo: R$" + this.saldo +
      "\nCriacao da conta: " + this.criacao +
      "\nUltima atualizacao: " + this.atualizacao;
  }
}
