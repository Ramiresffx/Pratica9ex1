package prática.pkg2.model;


public class Universidade {
 private String nome;
 private Professor prof;

    public Universidade(String nome, Professor prof) {
        this.nome = nome;
        this.prof = prof;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    @Override
    public String toString() {
        return "Universidade{" + "nome=" + nome + ", prof=" + prof + '}';
    }
 
 
}
