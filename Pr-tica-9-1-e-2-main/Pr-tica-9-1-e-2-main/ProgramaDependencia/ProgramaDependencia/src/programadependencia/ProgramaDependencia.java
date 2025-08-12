package programadependencia;
import programadependencia.model.*;
import java.util.Scanner;

public class ProgramaDependencia {

    public static void main(String[] args) {

       
        Scanner scan = new Scanner(System.in);
        Funcionario func = new Funcionario(87,"Markplier",1987);       
        Livro book = new Livro("HunterXHunter","Togashi");
        Biblioteca biblio = new Biblioteca(book,func);
        
        System.out.println("1-Adicionar livro a biblioteca");
        System.out.println("2-Remover livro da biblioteca");
        int select = scan.nextInt();
        
        
        if(select == 1){
            System.out.println("Qual livro você quer adicionar?: ");
            String nomelivro = scan.next();
            System.out.println("Digite o autor");
            String autor = scan.next();
            
            Livro novoLivro = new Livro(nomelivro,autor);
            
            System.out.println("Esse livro foi adicionado: "+ novoLivro);
        }
        else{
            System.out.println("qual livro você quer remover?; ");
            String removlivro = scan.next();
            
            Livro novoLivro = null;
            System.out.println("Esse livro foi removido");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
