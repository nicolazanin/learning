
package eserciziolibreria;

/**
 *
 * @author zanin
 */
public class Scaffale {
    public static final int NUMERO_MAX_LIBRI  = 10;
    public Libro[] collezione = new Libro [NUMERO_MAX_LIBRI];
    
    public int getPesoLibri(){
        int peso = 0;
        for (Libro libro : collezione) {
            if (libro != null) {
                peso = peso + libro.getPeso();
            }
        }
        return peso;
    }
    
    public int aggiungiLibro (Libro book){
        for (int i = 0; i < collezione.length; i++) {
            if (collezione[i] == null) {
                collezione[i] = book;
                return i;
            }
        }
        return -1;
    }
    
    
}
