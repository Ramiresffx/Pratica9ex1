package programadependencia.model;

public class Biblioteca {
    private Livro book;
    private Funcionario func;

    public Biblioteca(Livro book, Funcionario func) {
        this.book = book;
        this.func = func;
    }

    public Livro getBook() {
        return book;
    }

    public void setBook(Livro book) {
        this.book = book;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "book=" + book + ", func=" + func + '}';
    }
}
    