package queue;

import java.util.Queue;
import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    
    Queue<Carro> queueCarros = new LinkedList<>();

    queueCarros.add(new Carro("Ford"));
    queueCarros.add(new Carro("Chevrolet"));
    queueCarros.add(new Carro("Fiat"));

    System.out.println(queueCarros);

    System.out.println(queueCarros.add(new Carro("Peugeot")));

    System.out.println(queueCarros);

    System.out.println(queueCarros.offer(new Carro("Renault"))); // offer adiciona carro e, se não conseguir, retorna false

    System.out.println(queueCarros.peek()); // peek retorna o primeiro elemento da fila
    System.out.println(queueCarros);

    System.out.println(queueCarros.poll());
    System.out.println(queueCarros);

    System.out.println(queueCarros.isEmpty());

    System.out.println(queueCarros.size());

  }
}
