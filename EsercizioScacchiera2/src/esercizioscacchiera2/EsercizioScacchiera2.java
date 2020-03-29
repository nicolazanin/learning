
package esercizioscacchiera2;

import it.units.LibreriaFondamenti;

public class EsercizioScacchiera2 {

    public static void main(String[] args) {
        
        
        System.out.print("numero di celle: ");
        int n = LibreriaFondamenti.leggiIntero();
        
        System.out.print("numero dimensione: ");
        int uu = LibreriaFondamenti.leggiIntero();
        
        
        int j = 0;
        do{
            for (int u = 0; u < uu; u++) {
             
            
             if(j % 2 != 0){   
                 for (int e = 0; e < uu; e++) {
                   System.out.print(" ");  
                 }
                
            }
             
            for(int i = 0; i < n; i++){ 
                
                for (int k = 0; k < uu; k++) {
                   System.out.print("#"); 
                }
                for (int p = 0; p < uu; p++) {
                    System.out.print(" ");
                }
                //System.out.print(" ");
            }
            
            System.out.println();
            //FINE
            }
            
           j++;
            
        }while(j < n);
     
    }
    
}

