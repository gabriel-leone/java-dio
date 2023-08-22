package contas;

public interface ContaGeral {
  void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, ContaGeral contaDestino);
	
	void imprimirExtrato();
}
