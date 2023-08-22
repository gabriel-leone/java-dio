public class Operadores {
  public static void main(String args[]) {
    String nomeCompleto = "Gabriel" + " " + "Leone";
    System.out.println(nomeCompleto);

    String concatenacao ="?";
    System.out.println(concatenacao);

    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);

    int numero = 5;
    System.out.println(numero);
    System.out.println(-numero);

    int a = 5;
    int b = 10;
    boolean resultado = a == b ? true : false;
    System.out.println(resultado);

  }
}
