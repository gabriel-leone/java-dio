public class Facebook extends ServicoMensagemInstantanea {
  public void receberMensagem() {
    System.out.println("Facebook: Recebendo mensagem");
  }

  public void enviarMensagem(String mensagem) {
    System.out.println("Facebook: " + mensagem);
  }
}
