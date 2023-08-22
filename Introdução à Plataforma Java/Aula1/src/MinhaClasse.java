public class MinhaClasse {
  public static void main(String[] args) {
    String primeiroNome = "Gabriel";
    String ultimoNome = "Leone";

    String nomeCompleto = nomeCompleto(primeiroNome, ultimoNome);
    System.out.println(nomeCompleto);
  }

  public static String nomeCompleto(String primeiroNome, String ultimoNome) {
    // return primeiroNome + " " + ultimoNome;
    return "Resultado do Método: " + primeiroNome.concat(" ").concat(ultimoNome);
  }
}
