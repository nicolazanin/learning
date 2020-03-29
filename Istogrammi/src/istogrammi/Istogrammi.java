
package istogrammi;

import it.units.LibreriaFondamenti;

public class Istogrammi {

    public static void main(String[] args) {
        
        System.out.println("----------------");
        System.out.println("---ISTOGRAMMI---");
        System.out.println("----------------\n");
        
     
        int[] controllo = {0,1,2,3,4,5,6,7,8,9};
        int[] contatore = {0,0,0,0,0,0,0,0,0,0};
        
        int b;
       
        do{
            System.out.print("Quanti numeri devo generare? ");
            b = LibreriaFondamenti.leggiIntero();
        }while(!(b >= 0 && b <= 250));   
        
        System.out.println();

        int[] random = new int[b];
        for (int i = 0; i < random.length; i++) {
           random [i] = LibreriaFondamenti.generaNumeroCasuale(10); 
        }
        
        
        for (int ran : random) {
            for (int l = 0; l < controllo.length; l++) {
                if (controllo[l] == ran){
                    contatore[l] = contatore[l] + 1;
                }
            }
        }
        
        
        for (int i = 0; i < contatore.length; i++) {
            System.out.print("numero " + i + ": ");
            for (int j = 0; j < contatore[i]; j++) {
                System.out.print("°");
            }
            System.out.println();
        }
        
    }
    
}
