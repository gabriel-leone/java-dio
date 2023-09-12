package temperatura;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {

    ArrayList<Mes> temperaturas = new ArrayList<>() {
      {
        add(new Mes("Janeiro", 30.0));
        add(new Mes("Fevereiro", 28.0));
        add(new Mes("Março", 25.0));
        add(new Mes("Abril", 22.0));
        add(new Mes("Maio", 20.0));
        add(new Mes("Junho", 18.0));
      }
    };
    
    Double temperaturaMedia = 0.0;

    Iterator<Mes> iterator1 = temperaturas.iterator();
    while (iterator1.hasNext()) {
      Mes next = iterator1.next();
      temperaturaMedia += next.getTemperatura();
    }

    temperaturaMedia = temperaturaMedia/temperaturas.size();

    System.out.println("Temperatura média: " + temperaturaMedia);

    System.out.println("Meses com temperatura acima da média:");

    Iterator<Mes> iterator2 = temperaturas.iterator();
    while (iterator2.hasNext()) {
      Mes next = iterator2.next();
      if (next.getTemperatura() > temperaturaMedia) {
        System.out.println(next.getNome());
      }
    }
  }
}