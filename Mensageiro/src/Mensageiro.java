import java.util.Locale;
import java.util.Scanner;

public class Mensageiro {
  public static void main(String[] args) {
    System.out.println("Digite a mensagem a ser enviada: ");
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    String mensagem = scanner.nextLine();
    ServicoMensagemInstantanea service = null;

    System.out.println("Digite o serviço de mensagem a ser utilizado: ");
    String inputServico = scanner.nextLine();

    if (inputServico .equals("msn")) {
      service = new MSN();
    } else if (inputServico .equals("fbc")) {
      service = new Facebook();
    } else if (inputServico .equals("tlg")) {
      service = new Telegram();
    }

    service.enviarMensagem(mensagem);
    service.receberMensagem();
  }
}
