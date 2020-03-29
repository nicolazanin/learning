
package test2;

import java.util.Scanner;

public class Test2 {

    
    public static void main(String[] args) {
        
        System.out.println("Benvenuto in Test2\n");
        
        Scanner snome = new Scanner(System.in);
        
        System.out.println("digita il tuo nome qua sotto");
        
        String nome = snome.nextLine();
       
        System.out.println("\nil tuo nome è: " + nome);
   
    }
}

//semplice esercizio dove uso lo scanner per prendere input da tastiera bisogna ricordarsi di importarla all' inizio
// credo di aver usatodei parametri tipo la string nome