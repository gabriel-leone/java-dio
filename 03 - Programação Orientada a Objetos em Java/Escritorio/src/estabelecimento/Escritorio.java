package estabelecimento;

import equipamentos.impressora.Impressora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.Multifuncional;


public class Escritorio {
  public static void main(String[] args) {
    Impressora impressora = new Laserjet();
    impressora.imprimir();
    impressora = new Deskjet();
    impressora.imprimir();
    impressora = new Multifuncional();
    impressora.imprimir();
    System.out.println();

    Multifuncional multifuncional = new Multifuncional();
    multifuncional.imprimir();
    multifuncional.digitalizar();
    multifuncional.copiar();
  }
}
