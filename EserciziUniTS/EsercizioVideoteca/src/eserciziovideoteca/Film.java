
package eserciziovideoteca;

import it.units.LibreriaFondamenti;

/**
 *
 * @author zanin
 */
public class Film {
    public String titolo;
    public int durata;
    
    public Film(int durata, String titolo){
        if (durata < 10) {
            this.durata = 10;
        }
        else{
            this.durata = durata;
        }
        this.titolo = titolo;
    }
    
    @Override
    public String toString(){
        return titolo + " - durata: " + durata;
    }
    
    public void salvaFilm(){
        String nomeFile = titolo + ".txt";
        String contenutoFile = toString();
        System.out.println(toString());
        LibreriaFondamenti.scriviStringaSuFile(nomeFile, contenutoFile);
    }
}
