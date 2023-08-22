package usuario;

import aplicativos.ReprodutorMusical;
import aplicativos.Navegador;
import aplicativos.AparelhoTelefonico;
import aparelho.IPhone;

public class Usuario {
  public static void main(String[] args) {
    
  ReprodutorMusical reprodutor = new IPhone();
  reprodutor.tocar();
  reprodutor.pausar();
  reprodutor.selecionarMusica();

  Navegador navegador = new IPhone();
  navegador.exibirPagina();
  navegador.adicionarNovaAba();
  navegador.atualizarPagina();

  AparelhoTelefonico telefone = new IPhone();
  telefone.ligar();
  telefone.atender();
  telefone.iniciarCorreioDeVoz();

  }
}
