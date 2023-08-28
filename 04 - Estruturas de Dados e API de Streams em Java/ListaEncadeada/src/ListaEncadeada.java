public class ListaEncadeada<T> {

  No<T> referenciaEntrada;

  public ListaEncadeada() {
    this.referenciaEntrada = null;
  }

  public int size() {

    int tamanhoLista = 0;
    No<T> referenciaAux = referenciaEntrada;

    while (true) {
      if (referenciaAux != null) {
        tamanhoLista++;
        if (referenciaAux.getProximoNo() != null) {
          referenciaAux = referenciaAux.getProximoNo();
        } else {
          break;
        }
      } else {
        break;
      }
    }
    return tamanhoLista;
  }

  public boolean isEmpty() {
    // if (this.referenciaEntrada == null) {
    // return true;
    // } else {
    // return false;
    // }
    return referenciaEntrada == null ? true : false;
  }

  public void add(T conteudo) {

    No<T> novoNo = new No<T>(conteudo);

    if (this.isEmpty()) {
      referenciaEntrada = novoNo;
      return;
    }

    No<T> noAuxiliar = referenciaEntrada;

    for (int i = 0; i < this.size() - 1; i++) {
      noAuxiliar = noAuxiliar.getProximoNo();
    }

    noAuxiliar.setProximoNo(novoNo);
  }

  private No<T> getNo(int index) {

    validaIndice(index);

    No<T> noAuxiliar = referenciaEntrada;
    No<T> noRetorno = null;

    for (int i = 0; i <= index; i++) {
      noRetorno = noAuxiliar;
      noAuxiliar = noAuxiliar.getProximoNo();
    }

    return noRetorno;
  }

  private void validaIndice(int index) {
    if (index >= size()) {
      throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index);
    }
  }

  public T get(int index) {
    return getNo(index).getConteudo();
  }

  public T remove(int index) {
    No<T> noAuxiliar = this.getNo(index);

    if (index == 0) {
      referenciaEntrada = noAuxiliar.getProximoNo();
      return noAuxiliar.getConteudo();
    }
    
    No<T> noAnterior = getNo(index - 1);
    noAnterior.setProximoNo(noAuxiliar.getProximoNo());
    return noAuxiliar.getConteudo();
  }

  @Override
  public String toString() {
    String strRetorno = "";

    No<T> noAuxiliar = referenciaEntrada;

    for(int i = 0; i < this.size(); i++) {
      strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
      noAuxiliar = noAuxiliar.getProximoNo();
    }

    return strRetorno;
  }

}
