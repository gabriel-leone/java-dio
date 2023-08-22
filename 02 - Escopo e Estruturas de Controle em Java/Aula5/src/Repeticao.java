import java.util.Scanner;

public class Repeticao {
  // public static void main(String[] args) {
  //   for (int i = 1; i <= 20; i++)
  //   {
  //     System.out.println("Contando carneirinhos... " + i);
  //   }
  // }

  public static void main(String[] args) {
    String nomes [] = new String[4];
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 4; i++)
    {
      nomes[i] = scanner.nextLine();
    }
    for (String nome : nomes)
    {
      System.out.println("Nome = " + nome);
    }

  }
}
