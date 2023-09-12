package listaduplamenteencadeada;
public class Main {
  public static void main(String[] args) {
    ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

    minhaListaEncadeada.add("Rafael");
    minhaListaEncadeada.add("Carlos");
    minhaListaEncadeada.add("Joao");
    minhaListaEncadeada.add("Maria");
    minhaListaEncadeada.add("Jose");
    minhaListaEncadeada.add("Antonio");

    System.out.println(minhaListaEncadeada);

    minhaListaEncadeada.remove(3);

    System.out.println(minhaListaEncadeada);

    minhaListaEncadeada.add(3, "Larissa");

    System.out.println(minhaListaEncadeada);
    System.out.println(minhaListaEncadeada.get(3));
  }
}
