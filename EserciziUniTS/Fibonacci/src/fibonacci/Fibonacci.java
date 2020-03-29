
package fibonacci;

import it.units.LibreriaFondamenti;

public class Fibonacci {

    public static void main(String[] args) {
        
        System.out.println("=============");
        System.out.println("=|FIBONACCI|=");
        System.out.println("=============");
        
        int a = 0;
        int b = 1;
        int c = 0;
        int controllo = 0;
        
        System.out.print("Digita un indice della sequenza di fibonacci: ");
        int d = LibreriaFondamenti.leggiIntero();
        
        long start1 = System.nanoTime();
        for (int i = 0; i < d; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        long finish1 = System.nanoTime();
        System.out.println("tempo calcolo numero: " + (finish1 - start1) + "ns");
        
        System.out.format("Il numero #%d della sequenza di fibonacci è: %d ",d ,c);
        
        long start2 = System.nanoTime();
        for (int j = (c-1); j > 1; j--) {
            if((c % j) == 0){
                controllo = 1;
                System.out.println("(numero non primo)");
                break;
            }
        }
        
        if (controllo == 0){
            System.out.println("(numero primo)");
        }
        long finish2 = System.nanoTime();
        System.out.println("tempo di verifca numero primo : " + (finish2 - start2) + "ns");
    } 
}
