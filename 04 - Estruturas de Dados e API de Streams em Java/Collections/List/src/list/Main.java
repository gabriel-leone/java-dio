package list;

import java.util.*;

public class Main {
  public static void main(String[] args) {

    ArrayList<Gato> meusGatos = new ArrayList<>() {
      {
        add(new Gato("Jon", "preto", 18));
        add(new Gato("Simba", "tigrado", 6));
        add(new Gato("Carlos", "amarelo", 12));
      }
    };

    System.out.println(meusGatos);

    // Collections.shuffle(meusGatos);
    // System.out.println(meusGatos);

    Collections.sort(meusGatos);
    System.out.println(meusGatos);

    Collections.sort(meusGatos, new ComparatorIdade());
    System.out.println(meusGatos);

    Collections.sort(meusGatos, new ComparatorCor());
    System.out.println(meusGatos);

    meusGatos.sort(new ComparatorNomeCorIdade());
    System.out.println(meusGatos);


  }
}
