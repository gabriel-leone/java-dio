public class Terminal {
  public static void main(String args[]) {
    String nome = args[0];
    String sobrenome = args[1];
    int idade = Integer.valueOf(args[2]);
    System.out.println("Olá, meu nome é " + nome + " " + sobrenome + " e tenho " + idade + " anos.");
  }
}
