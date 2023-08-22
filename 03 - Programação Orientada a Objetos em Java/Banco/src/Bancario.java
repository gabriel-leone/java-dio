import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupança;
import estruturas.Cliente;

public class Bancario {
  public static void main(String[] args) {
    Cliente gabriel = new Cliente();
    gabriel.setNome("Gabriel");

    Conta cc = new ContaCorrente(gabriel);
    Conta cp = new ContaPoupança(gabriel);

    cc.depositar(1000);
    cc.sacar(100);
    cc.transferir(500, cp);

    cc.imprimirExtrato();
    cp.imprimirExtrato();
  }
}
