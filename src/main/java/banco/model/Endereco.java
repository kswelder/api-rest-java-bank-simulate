package banco;

import java.time.LocalDateTime;
/*
 * Package Objeto de Endereco para Clientes
 */

class Endereco {
  private String uf;
  private String estado;
  private String cidade;
  private String rua;
  private int numero;
  private String complemento;
  private LocalDateTime criacao;
  private LocalDateTime atualizacao;

  Endereco(
    String valorUf,
    String valorEstado,
    String valorCidade,
    String valorRua,
    int valorNumero,
    String valorComplemento
  ) {
    this.uf = valorUf;
    this.estado = valorEstado;
    this.cidade = valorCidade;
    this.rua = valorRua;
    this.numero = valorNumero;
    this.complemento = valorComplemento;
    this.criacao = LocalDateTime.now();
    this.atualizacao = LocalDateTime.now();
      }
  public void atualizarEndereco(
    String novoUf,
    String novoEstado,
    String novaCidade,
    String novaRua,
    int novoNumero,
    String novoComplemento
    ) {
    this.uf = novoUf;
    this.estado = novoEstado;
    this.cidade = novaCidade;
    this.rua = novaRua;
    this.numero = novoNumero;
    this.complemento = novoComplemento;
    this.atualizacao = LocalDateTime.now();
  }
  public String getUf() {
    return this.uf;
  }
  public String getEstado() {
    return this.estado;
  }
  public String getCidade() {
    return this.cidade;
  }
  public String getRua() {
    return this.rua;
  }
  public int getNumero() {
    return this.numero;
  }
  public String getComplemento() {
    return this.complemento;
  }
  public String getEndereco() {
    return "UF: " + this.uf +
      "\nEstado: " + this.estado +
      "\nCidade: " + this.cidade +
      "\nRua: " + this.rua +
      "\nNumero: " + Integer.toString(this.numero) +
      "\nComplemento: " + this.complemento;
  }
}
