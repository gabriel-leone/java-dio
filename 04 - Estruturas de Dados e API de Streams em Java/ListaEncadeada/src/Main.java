public class Main {
  
  public static void main(String[] args) {
    ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

    minhaListaEncadeada.add("Gabriel");
    minhaListaEncadeada.add("Joao");
    minhaListaEncadeada.add("Maria");
    minhaListaEncadeada.add("Jose");

    System.out.println(minhaListaEncadeada);

    System.out.println(minhaListaEncadeada.get(0));
    System.out.println(minhaListaEncadeada.get(1));
    System.out.println(minhaListaEncadeada.get(2));
    System.out.println(minhaListaEncadeada.get(3));

    System.out.println(minhaListaEncadeada.remove(1));

    System.out.println(minhaListaEncadeada);
  }


}
