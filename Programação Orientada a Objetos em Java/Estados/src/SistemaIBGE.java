public class SistemaIBGE {
  public static void main(String[] args) {
    for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
      System.out.println(estado.getNome() + " (" + estado.getSigla() + ")");
    }
    EstadoBrasileiro estado = EstadoBrasileiro.SAO_PAULO;
    System.out.println(estado.getNome() + " (" + estado.getSigla() + ")");
    System.out.println(estado.getNomeMaiusculo());
  }
}
