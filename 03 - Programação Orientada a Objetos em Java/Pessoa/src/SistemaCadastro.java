public class SistemaCadastro {
  public static void main(String[] args) {
    Pessoa marcos = new Pessoa("Marcos", "123.456.789-10");

    marcos.setEndereco("Rua 1, 123");

    System.out.println(marcos.getNome() + ", CPF: " + marcos.getCpf() + ", residente em " + marcos.getEndereco() + ".");
  }
}
