package stack;

public class Carro {
    
    String marca;
  
    public Carro(String marca) {
      this.marca = marca;
    }
  
    public String getMarca() {
      return marca;
    }
  
    public void setMarca(String marca) {
      this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || this.getClass() != o.getClass()) return false;
      Carro carro = (Carro) o;
      return java.util.Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
      return java.util.Objects.hash(marca);
    }

    public String toString() {
      return "Carro{" +
              "marca='" + marca + '\'' +
              '}';
    }
}
