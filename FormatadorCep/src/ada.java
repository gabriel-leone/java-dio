import java.util.Scanner;

public class ada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] nomes = new String[10];
    String a = "";
    String b = "";
    String c = "";

    for (int i = 0; i < 10; i++) {
      nomes[i] = sc.nextLine();
      if (i == 2) {
        a = nomes[i];
      }
      else if (i == 6) {
        b = nomes[i];
      }
      else if (i == 8) {
        c = nomes[i];
      }
    }
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }
}
