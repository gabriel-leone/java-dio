import contas.Conta;
import contas.ContaCorrente;
import contas.ContaPoupança;
import estruturas.Cliente;
import estruturas.Banco;
import java.util.List;
import java.util.LinkedList;

public class Bancario {
  public static void main(String[] args) {
    Cliente gabriel = new Cliente();
    gabriel.setNome("Gabriel");

    Conta cc = new ContaCorrente(gabriel);
    Conta cp = new ContaPoupança(gabriel);

    List contas = new LinkedList<Conta>();
    contas.add(cc);
    contas.add(cp);
    Banco banco = new Banco();

    banco.setContas(contas);

    cc.depositar(1000);
    cc.sacar(100);
    cc.transferir(500, cp);

    cc.imprimirExtrato();
    cp.imprimirExtrato();

    System.out.println(banco.getContas());
  }
}
