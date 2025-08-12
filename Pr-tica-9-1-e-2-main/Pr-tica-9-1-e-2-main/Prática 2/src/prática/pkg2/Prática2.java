package prática.pkg2;

import prática.pkg2.model.*;
import java.util.Scanner;

public class Prática2 {

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        Professor prof = new Professor("Ale","Ds");
        Universidade uni = new Universidade("fortec",prof);
        
         System.out.println("1-Adicionar livro a biblioteca");
        System.out.println("2-Remover livro da biblioteca");
        int select = scan.nextInt();
        
        
        if(select == 1){
            System.out.println("Que professor você quer adicionar?: ");
            String nomeprof = scan.next();
            System.out.println("Digite o autor");
            String disc = scan.next();
            
            Professor newprof = new Professor(nomeprof,disc);
            
            System.out.println("Esse livro foi adicionado: "+ newprof);
        }
        else{
            System.out.println("qual livro você quer remover?; ");
            String removprof = scan.next();
            
            Professor newproff = null;
            System.out.println("Esse livro foi removido");
        }
    }
    
}
