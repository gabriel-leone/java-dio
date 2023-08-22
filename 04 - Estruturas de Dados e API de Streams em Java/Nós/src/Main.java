public class Main {
  public static void main(String[] args) {
    No<String> no1 = new No<>("Conteúdo nó 1");
    No<String> no2 = new No<>("Conteúdo nó 2");

    no1.setProximo(no2);

    No<String>  no3 = new No<>("Conteúdo nó 3");

    no2.setProximo(no3);

    No<String>  no4 = new No<>("Conteúdo nó 4");

    no3.setProximo(no4);

    System.out.println(no1);
    System.out.println(no1.getProximo());
    System.out.println(no1.getProximo().getProximo());
    System.out.println(no1.getProximo().getProximo().getProximo());
    System.out.println(no1.getProximo().getProximo().getProximo().getProximo());
  }
}
