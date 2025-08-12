package programadependencia.model;

public class Departamento {
 private String nome;
 private Funcionario func;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nome=" + nome + ", func=" + func + '}';
    }
 
}
