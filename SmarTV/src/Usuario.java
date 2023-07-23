public class Usuario {
  public static void main(String args[]) {
    SmarTV smarTV = new SmarTV();
    System.out.println("Turned ON? " + smarTV.turnedOn);
    System.out.println("Channel: " + smarTV.channel);
    System.out.println("Volume: " + smarTV.volume);

    smarTV.turnOn();
    smarTV.channelUp();
    smarTV.volumeUp();

    System.out.println("Turned ON? " + smarTV.turnedOn);
    System.out.println("Channel: " + smarTV.channel);
    System.out.println("Volume: " + smarTV.volume);

    smarTV.goToChannel(5);
    System.out.println("Channel: " + smarTV.channel);
  }
}
