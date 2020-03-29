
package esercizio1;

import it.units.LibreriaFondamenti;

public class Esercizio1 {
 
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("Calcolo anno bisestile");
        System.out.println("----------------------");
        System.out.print("digita anno: ");
        int anno = LibreriaFondamenti.leggiIntero();
        if(anno % 4 == 0 && !(anno % 100 == 0))
        {
            System.out.println("anno bisestile"); 
        }
        else if (anno % 400 == 0)
        {
            System.out.println("anno bisestile"); 
        }
        else
        {
            System.out.println("non bisestile");
        }
        
    }
    
}
