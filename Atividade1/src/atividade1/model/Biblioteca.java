package atividade1.model;

public class Biblioteca {
    private String nome;
    private int numestante;
    private Livro livro;

    public Biblioteca(String nome, int numestante, Livro livro) {
        this.nome = nome;
        this.numestante = numestante;
        this.livro = livro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumestante() {
        return numestante;
    }

    public void setNumestante(int numestante) {
        this.numestante = numestante;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nome=" + nome + ", numestante=" + numestante + ", livro=" + livro + '}';
    }
    
    
}
