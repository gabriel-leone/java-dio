package map;

import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
  public static void main(String[] args) {

    HashMap<String, Double> carros = new HashMap<>() {
      {
        put("gol", 14.4);
        put("uno", 16.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.8);
      }
    };

    System.out.println(carros);

    carros.put("gol", 15.6);

    System.out.println(carros);

    System.out.println(carros.containsKey("tucson"));

    System.out.println(carros.containsValue(15.6));

    System.out.println(carros.get("mobi"));

    Set<String> modelos = carros.keySet();
    System.out.println(modelos);

    Collection<Double> consumo = carros.values();
    System.out.println(consumo);

    System.out.println("Mais economico: " + Collections.max(consumo));

    Double consumoMaisEficiente = Collections.max(carros.values());

    Set<HashMap.Entry<String, Double>> entries = carros.entrySet();
    String modeloMaisEficiente = "";

    for (HashMap.Entry<String, Double> entry : entries) {

      if (entry.getValue().equals(consumoMaisEficiente)) {
        modeloMaisEficiente = entry.getKey();
        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
      }
    }

    Double consumoMenosEficiente = Collections.min(carros.values());

    // Set<HashMap.Entry<String, Double>> entries2 = carros.entrySet();
    String modeloMenosEficiente = "";

    for (HashMap.Entry<String, Double> entry : carros.entrySet()) {
      if (entry.getValue().equals(consumoMenosEficiente)) {
        modeloMenosEficiente = entry.getKey();
        System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
      }
    }

    Iterator<Double> iterator = carros.values().iterator();
    Double soma = 0.0;
    while (iterator.hasNext()) {
      soma += iterator.next();
    }
    System.out.println("Soma: " + soma);

    System.out.println("Média: " + soma / carros.size());

    LinkedHashMap<String, Double> carros2 = new LinkedHashMap<>() {
      {
        put("gol", 14.4);
        put("uno", 16.6);
        put("mobi", 16.1);
        put("hb20", 14.5);
        put("kwid", 15.8);
      }
    };
    System.out.println(carros2);

    TreeMap<String, Double> carros3 = new TreeMap<>(carros2);
    System.out.println(carros3);

    carros3.put("tucson", 10.0);
    System.out.println(carros3);

    carros.clear();

    System.out.println(carros.isEmpty());



  }
}
