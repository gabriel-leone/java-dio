package contas;

import estruturas.Cliente;

public abstract class Conta implements ContaGeral {

  private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;
  protected Cliente cliente;

  public Conta(int agencia, int numero, Cliente cliente) {
    this.agencia = AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }

  public Conta(Cliente cliente2) {
    this.cliente = cliente2;
  }

  public void sacar(double valor) {
    if (valor > 0 && valor <= this.saldo) {
      this.saldo -= valor;
    }
  }

  public void depositar(double valor) {
    if (valor > 0) {
      this.saldo += valor;
    }
  }

  public void transferir(double valor, ContaGeral contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getAgencia() {
    return this.agencia;
  }

  public int getNumero() {
    return this.numero;
  }

  protected void imprimirInfosComuns() {
    System.out.println("Titular: " + this.cliente.getNome());
    System.out.println("Agência: " + this.agencia);
    System.out.println("Número: " + this.numero);
    System.out.println("Saldo: " + this.saldo);
  }

}
