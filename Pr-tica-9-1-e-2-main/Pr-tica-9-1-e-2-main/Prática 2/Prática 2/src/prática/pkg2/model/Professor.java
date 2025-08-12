package prática.pkg2.model;

public class Professor {
  private String nome;
  private String disc;

    public Professor(String nome, String disc) {
        this.nome = nome;
        this.disc = disc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + nome + ", disc=" + disc + '}';
    }
  
  
  
}
