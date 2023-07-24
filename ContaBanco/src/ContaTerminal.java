import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    System.out.print("Digite o seu nome: ");
    String nome = sc.nextLine();
    System.out.print("Digite o seu saldo: ");
    double saldo = sc.nextDouble();
    System.out.print("Digite sua agência: ");
    String agencia = sc.next();
    System.out.print("Digite sua conta: ");
    int conta = sc.nextInt();
    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
        + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

  }
}
