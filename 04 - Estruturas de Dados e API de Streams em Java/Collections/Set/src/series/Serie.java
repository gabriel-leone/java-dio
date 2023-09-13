package series;

import java.util.Objects;

public class Serie implements Comparable<Serie> {
  private String nome;
  private String genero;
  private Integer tempoEpisodio;

  public Serie(String nome, String genero, Integer tempoEpisodio) {
    this.nome = nome;
    this.genero = genero;
    this.tempoEpisodio = tempoEpisodio;
  }

  public String getNome() {
    return nome;
  }

  public String getGenero() {
    return genero;
  }

  public Integer getTempoEpisodio() {
    return tempoEpisodio;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public void setTempoEpisodio(Integer tempoEpisodio) {
    this.tempoEpisodio = tempoEpisodio;
  }

  @Override
  public String toString() {
    return "{" +
      "nome='" + nome + '\'' +
      ", genero='" + genero + '\'' +
      ", tempoEpisodio=" + tempoEpisodio +
      '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;

    Serie serie = (Serie) obj;
    return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, genero, tempoEpisodio);
  }

  @Override
  public int compareTo(Serie serie) {
    int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
    if (tempoEpisodio != 0) return tempoEpisodio;
    return this.getGenero().compareToIgnoreCase(serie.getGenero());
  }
}
