import files.No;

public class No {
  private int dado;
  private No reNo = null;

  public No(int dado) {
    this.dado = dado;
  }

  public int getDado() {
    return dado;
  }

  public void setDado(int dado) {
    this.dado = dado;
  }

  public void setRefNo(No reNo) {
    this.reNo = reNo;
  }

  public No getRefNo() {
    return reNo;
  }

  public String toString() {
    return "No{" + "dado=" + dado + '}';
  }

  public String getObject() {
    return null;
  }
}
