
package esercizio2;

import it.units.LibreriaFondamenti;


public class Esercizio2 {

 
    public static void main(String[] args) {
        System.out.print("taglia di scarpe: ");
        int scarpe = LibreriaFondamenti.leggiIntero();
        System.out.print("anno di nascita: ");
        int anno = LibreriaFondamenti.leggiIntero();
        
        int matemagia = (((scarpe*5+50)*20)+1020-anno);
        System.out.println("matemagia: " + matemagia);
        
        
        int controllo1 = matemagia/100;
        //System.out.println(controllo1);
        int controllo2 = matemagia-controllo1*100;
        //System.out.println(controllo2);
        
        if(controllo1 == scarpe && controllo2 == (2020-anno))
        {
            System.out.println("funziaaa");
        }
    }
    
}
