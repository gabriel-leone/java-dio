package aparelho;

import aplicativos.AparelhoTelefonico;
import aplicativos.Navegador;
import aplicativos.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, Navegador, ReprodutorMusical {
  public void ligar() {
    System.out.println("Ligando...");
  }

  public void atender() {
    System.out.println("Atendendo...");
  }

  public void iniciarCorreioDeVoz() {
    System.out.println("Iniciando correio de voz...");
  }

  public void exibirPagina() {
    System.out.println("Exibindo página...");
  }

  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba...");
  }

  public void atualizarPagina() {
    System.out.println("Atualizando página...");
  }

  public void tocar() {
    System.out.println("Tocando...");
  }

  public void pausar() {
    System.out.println("Pausando...");
  }

  public void selecionarMusica() {
    System.out.println("Selecionando música...");
  }
}
