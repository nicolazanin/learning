
package test4;

import java.util.Scanner;
  
public class Test4 {

    public static void main(String[] args) {
        System.out.println("|Calcolatore area Triangolo|\n");
        
            System.out.println("digita la base");  
            Scanner base = new Scanner(System.in);
            double b = base.nextDouble();
        
            System.out.println("\ndigita l'altezza");
            Scanner altezza = new Scanner(System.in);
            double h =altezza.nextDouble();
            
            int d = 2; //semplicemente per esercizio creare una primitiva
        
                double c = (double) ((b*h)/d); // ho messo double tra parentesi perchè voglio il risultato con la virgola.
        
        System.out.println("\nl'area è: " +  c);
        
    }
     
}
// calcolatore area triangolo