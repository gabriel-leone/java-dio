import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {

    Candidato[] candidatos;
    candidatos = new Candidato[10];

    for (int i = 0; i < 10; i++) {
      Candidato temp = new Candidato();
      temp.name = gerarNome(i);
      temp.salarioPretendido = gerarSalarioPretendido();
      candidatos[i] = temp;
    }
    for (int i = 0; i < 10; i++) {
      System.out.println(candidatos[i].name);
      System.out.println(candidatos[i].salarioPretendido);
      System.out.println("-----------------------------------------------");
    }
    analisarCandidatos(candidatos);

  }

  public static String gerarNome(int i) {
    String[] nomes = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA",
        "JORGE" };
    return (nomes[i]);
  }

  public static double gerarSalarioPretendido() {
    double valor = ThreadLocalRandom.current().nextDouble(1800, 2200);
    return (valor);
  }

  public static void analisarCandidatos(Candidato[] candidatos) {
    int contador = 0;
    Candidato[] candidatosTemp;
    candidatosTemp = new Candidato[10];
    for (int i = 0; i < 10; i++) {
      if (candidatos[i].salarioPretendido < 2000) {
        System.out.println("Candidato: " + candidatos[i].name + " - LIGAR PARA O CANDIDATO");
        candidatosTemp[contador] = candidatos[i];
        contador++;
      } else if (candidatos[i].salarioPretendido == 2000) {
        System.out.println("Candidato: " + candidatos[i].name + " - LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
      } else {
        System.out.println("Candidato: " + candidatos[i].name + " - AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
      }
    }
    Candidato[] candidatosSelecionados;
    candidatosSelecionados = new Candidato[contador];
    for (int i = 0; i < contador; i++) {
      candidatosSelecionados[i] = candidatosTemp[i];
    }
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("Candidatos aprovados: ");
    if (contador > 5) {
      Candidato[] candidatosAprovados;
      candidatosAprovados = new Candidato[5];
      for (int i = 0; i < contador; i++) {
        for (int j = i + 1; j < contador - 1; j++) {
          if (candidatosSelecionados[i].salarioPretendido > candidatosSelecionados[j].salarioPretendido) {
            Candidato temp = candidatosSelecionados[i];
            candidatosSelecionados[i] = candidatosSelecionados[j];
            candidatosSelecionados[j] = temp;
          }
        }
      }
      for (int i = 0; i < 5; i++) {
        candidatosAprovados[i] = candidatosSelecionados[i];
      }
      for (int i = 0; i < 5; i++) {
        System.out.println(candidatosAprovados[i].name);
        System.out.println(candidatosAprovados[i].salarioPretendido);
        System.out.println("-----------------------------------------------");
      }
    } else {
      Candidato[] candidatosAprovados;
      candidatosAprovados = new Candidato[contador];
      for (int i = 0; i < contador; i++) {
        candidatosAprovados[i] = candidatosSelecionados[i];
      }
      for (int i = 0; i < contador; i++) {
        System.out.println(candidatosAprovados[i].name);
        System.out.println(candidatosAprovados[i].salarioPretendido);
        System.out.println("-----------------------------------------------");
      }
    }
  }
}
