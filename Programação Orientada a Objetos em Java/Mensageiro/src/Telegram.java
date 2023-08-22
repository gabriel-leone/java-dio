public class Telegram extends ServicoMensagemInstantanea {
  public void receberMensagem() {
    System.out.println("Telegram: Recebendo mensagem");
  }

  public void enviarMensagem(String mensagem) {
    System.out.println("Telegram: " + mensagem);
  }
}
