package prática.pkg2;

import prática.pkg2.model.*;
import java.util.Scanner;

public class Prática2 {

    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        Professor prof = new Professor("Ale","Ds");
        Universidade uni = new Universidade("fortec",prof);
        
         System.out.println("1-Adicionar o professor a universidade");
        System.out.println("2-Remover  o professor a universidade");
        int select = scan.nextInt();
        
        
        if(select == 1){
            System.out.println("Que professor você quer adicionar?: ");
            String nomeprof = scan.next();
            System.out.println("Digite a disciplina dele");
            String disc = scan.next();
            
            Professor newprof = new Professor(nomeprof,disc);
            
            System.out.println("Esse professor foi adicionado: "+ newprof);
        }
        else{
            System.out.println("qual professor você quer remover?; ");
            String removprof = scan.next();
            
            Professor newproff = null;
            System.out.println("Esse professor foi removido");
        }
    }
    
}
