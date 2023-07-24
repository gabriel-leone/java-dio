import java.util.Locale;
import java.util.Scanner;

public class LendoDados {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite um número inteiro:");
    int num1 = scanner.nextInt();
    System.out.println("Digite outro número inteiro:");
    int num2 = scanner.nextInt();
    int resultado = num1 + num2;
    System.out.println("A soma dos números é: " + resultado);
  }
}