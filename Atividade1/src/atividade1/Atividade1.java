package atividade1;
import atividade1.model.*;

public class Atividade1 {

    public static void main(String[] args) {
        Livro livro = new Livro("One piece","oda","Aventura");
        Biblioteca bioteca = new Biblioteca("Raimundo",2,livro);
        
        System.out.println("Voce pode achar na " + bioteca);
    }
    
}
