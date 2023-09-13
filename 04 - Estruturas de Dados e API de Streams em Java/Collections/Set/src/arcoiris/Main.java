package arcoiris;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;


public class Main {
  public static void main(String[] args) {
    
    HashSet<String> cores = new HashSet<>();

    cores.add("Vermelho");
    cores.add("Laranja");
    cores.add("Amarelo");
    cores.add("Verde");
    cores.add("Azul");
    cores.add("Anil");
    cores.add("Violeta");

    System.out.println("Cores: ");

    for (String cor : cores) {
      System.out.println(cor);
    }
    System.out.println("---------------------------------");

    System.out.println("Quantidade de cores: " + cores.size());
    System.out.println("---------------------------------");
    System.out.println("Cores em ordem alfabética: ");

    TreeSet<String> coresOrdenadas = new TreeSet<>(cores);

    for (String cor : coresOrdenadas) {
      System.out.println(cor);
    }
    System.out.println("---------------------------------");
    System.out.println("Cores em ordem alfabética inversa: ");

    TreeSet<String> coresOrdenadasInverso = (TreeSet<String>) coresOrdenadas.descendingSet();

    for (String cor : coresOrdenadasInverso) {
      System.out.println(cor);
    }
    System.out.println("---------------------------------");

    System.out.println("Cores que começam com a letra V: ");

    for (String cor : cores) {
      if (cor.startsWith("V")) {
        System.out.println(cor);
      }
    }
    System.out.println("---------------------------------");

    System.out.println("Removendo cores que não começam com a letra V: ");

    Iterator<String> iterator = cores.iterator();
    while (iterator.hasNext()) {
      String next = iterator.next();
      if (!next.startsWith("V")) {
        iterator.remove();
      }
    }

    for (String cor : cores) {
      System.out.println(cor);
    }
    System.out.println("---------------------------------");

    System.out.println("Removendo todas as cores: ");

    cores.clear();

    System.out.println("Quantidade de cores: " + cores.size());

  }
}
