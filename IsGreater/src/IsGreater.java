import java.util.Scanner;
public class IsGreater {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro numero: ");
    int num1 = sc.nextInt();
    System.out.println("Digite o segundo numero: ");
    int num2 = sc.nextInt();
    int diff = 0;
    try {
      diff = contar(num1, num2);
    }
    catch (Exception e) {
      System.out.println("O segundo par\u00E2metro deve ser maior que o primeiro");
    }
    for (int i = 1; i <= diff; i++) {
      System.out.println("Imprimindo o número " + i);
    }
  }

  static int contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
    if (parametro2 <= parametro1) {
      throw new ParametrosInvalidosException();
    }
    int diff = parametro2 - parametro1;
    return diff;
  }
}
