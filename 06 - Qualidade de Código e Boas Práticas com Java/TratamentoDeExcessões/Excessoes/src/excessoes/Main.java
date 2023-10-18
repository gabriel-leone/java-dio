package excessoes;

import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    

    boolean keepRunning = true;
    do {
      try {
        String a = JOptionPane.showInputDialog("Numedorador:");
        String b = JOptionPane.showInputDialog("Denominador: ");

        int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
        System.out.println("Resultado: " + resultado);
        keepRunning = false;
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Entrada inválida, informe um numero inteiro" + e.getMessage());
        // e.printStackTrace();
      } catch (ArithmeticException e) {
        JOptionPane.showMessageDialog(null, "Impossível realizar divisão por zero" + e.getMessage());
        // e.printStackTrace();
      } finally {
        System.out.println("Fim");
      }
    } while (keepRunning);
  }

  public static int dividir(int a, int b) {
    int resultado = a / b;
    return resultado;
  }
}
