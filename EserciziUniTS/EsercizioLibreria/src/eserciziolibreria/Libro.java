
package eserciziolibreria;

/**
 *
 * @author zanin
 */
public class Libro {
    public String titolo;
    public String autore;
    public int numeroPagine;
    public static final int PESO_PAGINA = 10;
    
    public Libro(String titolo, String autore, int numeroPagine){
        this.autore = autore;
        this.numeroPagine = numeroPagine;
        this.titolo = titolo;
    }
    
    public int getPeso(){
        int peso = numeroPagine*PESO_PAGINA;
        return peso;
    }
    
    public String toString (){
        return titolo + " - " + autore + "( pagine: " + numeroPagine + " )";
    }
}
