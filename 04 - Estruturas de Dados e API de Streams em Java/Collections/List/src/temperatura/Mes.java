package temperatura;

public class Mes implements Comparable<Mes> {
  private String nome;
  private Double temperatura;

  public Mes(String nome, Double temperatura) {
    this.nome = nome;
    this.temperatura = temperatura;
  }

  public String getNome() {
    return nome;
  }

  public Double getTemperatura() {
    return temperatura;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setTemperatura(Double temperatura) {
    this.temperatura = temperatura;
  }

  @Override
  public String toString() {
    return "Mes{" +
      "nome='" + nome + '\'' +
      ", temperatura=" + temperatura +
      '}';
  }

  @Override
  public int compareTo(Mes mes) {
    return Double.compare(this.getTemperatura(), mes.getTemperatura());
  }
}
