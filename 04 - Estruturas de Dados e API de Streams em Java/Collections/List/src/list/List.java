package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class List {
    public static void main(String[] args) {
        
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas.toString());

        System.out.println(notas.indexOf(5.0));

        notas.add(4, 8.0);

        System.out.println(notas);

        notas.set(4, 8.5);

        System.out.println(notas);

        System.out.println(notas.contains(5.0));

        for (Double nota : notas) {
            System.out.println(nota);
        }
        System.out.println();

        System.out.println(notas.get(7));
        
        System.out.println("Menor nota: " + Collections.min(notas));

        System.out.println("Maior nota: " + Collections.max(notas));

        Double soma = 0.0;

        // for (Double nota : notas) {
        //     soma += nota;
        // }
        // System.out.println("Soma: " + soma);

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);

        System.out.println("Média: " + soma / notas.size());

        System.out.println(notas);

        notas.remove(0);
        System.out.println(notas);

        notas.remove(0.0);
        System.out.println(notas);

        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            Double next = iterator2.next();
            if (next < 7) {
                iterator2.remove();
            }
        }
        System.out.println(notas);

        notas.clear();

        System.out.println(notas.isEmpty());
    }
}
