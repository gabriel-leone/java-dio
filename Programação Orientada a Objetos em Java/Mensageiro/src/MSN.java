public class MSN extends ServicoMensagemInstantanea {
  public void receberMensagem() {
    System.out.println("MSN: Recebendo mensagem");
  }

  public void enviarMensagem(String mensagem) {
    System.out.println("MSN: " + mensagem);
  }
}
