package series;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {

    HashSet<Serie> minhasSeries = new HashSet<>() {{
      add(new Serie("Got", "Fantasia", 60));
      add(new Serie("Dark", "Drama", 60));
      add(new Serie("That '70s Show", "Comédia", 25));
    }};

    for (Serie serie : minhasSeries) {
      System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }

    System.out.println("---------------------------------");

    LinkedHashSet<Serie> minhasSeries1 = new LinkedHashSet<>() {{
      add(new Serie("Got", "Fantasia", 60));
      add(new Serie("Dark", "Drama", 60));
      add(new Serie("That '70s Show", "Comédia", 25));
    }};

    for (Serie serie : minhasSeries1) {
      System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }

    System.out.println("---------------------------------");

    TreeSet<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
    
    for (Serie serie : minhasSeries2) {
      System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }

    System.out.println("---------------------------------");

    TreeSet<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());

    minhasSeries3.addAll(minhasSeries);
    

    for (Serie serie : minhasSeries3) {
      System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
    }





  }
}
