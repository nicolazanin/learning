
package esercizioscacchiera;

import it.units.LibreriaFondamenti;

public class EsercizioScacchiera {

    public static void main(String[] args) {
        
        System.out.println("---------");
        System.out.println(" scacchi ");
        System.out.println("---------\n");
        System.out.print("digita il numero di celle: ");
        int n = LibreriaFondamenti.leggiIntero();
        System.out.print("digita la dimensione: ");
        int uu = LibreriaFondamenti.leggiIntero();
        
        System.out.println(" ");
        
        
        int j = 0;
        do{
            //inizio
            for (int u = 0; u < uu; u++) {

                if(j % 2 != 0){
                    for (int o = 0; o < uu; o++) {
                        System.out.print("0");
                   }
                }
            
                for(int i = 0; i < n; i++){ 
                    for (int p = 0; p < uu; p++) {
                        System.out.print("1");
                    }
                    for (int k = 0; k < uu; k++) {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
            //fine
            j++;
            
        }while(j < n);
    }
}
