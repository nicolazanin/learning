
package eserciziolibreria;

/**
 *
 * @author zanin
 */
public class Libreria {
    public Scaffale[] scaffali = new Scaffale [2];
    
    public Libreria (){
        for (int i = 0; i < scaffali.length; i++) {
            Scaffale s = new Scaffale();
            scaffali[i] = s;
        }
    }
    
    public int scaffaleLeggero (){
        
        int[] pesi = new int[scaffali.length];
        for (int i = 0; i < scaffali.length ; i++) {
            pesi[i] = scaffali[i].getPesoLibri();
        }
        int indice = 0;
        int minore = pesi[0];
        for (int i = 1; i < pesi.length; i++) {
            if (pesi[i] < minore) {
                pesi[i] = minore;
                indice = i;
            }
        }
        
        return indice;
    }
   
    public void aggiungiLibro (Libro book){
        int indice = this.scaffaleLeggero();
        int index = scaffali[indice].aggiungiLibro(book);
        System.out.println("caricato: " + book + ", scaffale: " + indice + ", posizione: " + (index + 1));
    }
    
}
