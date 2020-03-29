
package cercaarray;

import it.units.LibreriaFondamenti;

/**
 *
 * @author zanin
 */
public class CercaArray {


    public static void main(String[] args) {
        System.out.println("-----------------");
        System.out.println("---CERCA_ARRAY---");
        System.out.println("-----------------\n");
        
        int b;
        do{
            System.out.print("Quanti numeri devo generare? ");
             b = LibreriaFondamenti.leggiIntero();
        }while(!(b > 0 && b < 99));
        
        int[] random = new int[b];
        for (int i = 0; i < random.length; i++) {
           random [i] = LibreriaFondamenti.generaNumeroCasuale(99); 
        }
        
        for (int i : random) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.print("che numero devo cercare? ");
        int c = LibreriaFondamenti.leggiIntero();
        
        
        int s = 0;
        for (int i : random) {
            if (i == c) {
                 s = 1;
                System.out.println("Trovato!");
                break;
            }
        }
        if ( s == 0) {
            System.out.println("Non c'è :(");
        }
        
    }
    
}
