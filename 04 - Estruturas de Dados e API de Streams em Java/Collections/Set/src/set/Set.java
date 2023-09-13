package set;

import java.util.*;

public class Set {
  public static void main(String[] args) {
    
    HashSet<Double> notas = new HashSet<>();
    notas.add(7d);
    notas.add(8.5);
    notas.add(9.3);
    notas.add(5d);
    notas.add(7d);
    notas.add(0d);
    notas.add(3.6);

    System.out.println(notas);

    notas.remove(3.6);

    System.out.println(notas);

    System.out.println(notas.size());

    System.out.println(notas.contains(5.0));

    System.out.println("Menor nota: " + Collections.min(notas));

    System.out.println("Maior nota: " + Collections.max(notas));

    Iterator<Double> iterator1 = notas.iterator();
    Double soma = 0.0;

    while (iterator1.hasNext()) {
      Double next = iterator1.next();
      soma += next;
    }
    System.out.println("Soma: " + soma);

    System.out.println("Média: " + soma / notas.size());

    Iterator<Double> iterator2 = notas.iterator();
    while (iterator2.hasNext()) {
      Double next = iterator2.next();
      if (next < 7) {
        iterator2.remove();
      }
    }
    System.out.println(notas);

    LinkedHashSet<Double> notas2 = new LinkedHashSet<>();
    notas2.add(7d);
    notas2.add(8.5);
    notas2.add(9.3);
    notas2.add(5d);
    notas2.add(7d);
    notas2.add(0d);
    notas2.add(3.6);
    System.out.println(notas2);
    
    TreeSet<Double> notas3 = new TreeSet<>(notas2);
    System.out.println(notas3);


  }
}
