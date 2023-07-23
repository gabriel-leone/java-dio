public class SmarTV {
  boolean turnedOn = false;
  int volume = 0;
  int channel = 1;

  public void turnOn() {
    turnedOn = true;
  }

  public void turnOff() {
    turnedOn = false;
  }

  public void volumeUp() {
    volume++;
  }

  public void volumeDown() {
    volume--;
  }

  public void channelUp() {
    channel++;
  }

  public void channelDown() {
    channel--;
  }

  public void goToChannel(int newChannel) {
    channel = newChannel;
  }

}
