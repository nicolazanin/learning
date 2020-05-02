

package eserciziovideoteca;

/**
 *
 * @author zanin
 */
public class EsercizioVideoteca {


    public static void main(String[] args) {
        Film mi = new Film(155, "Mission Impossible");
        Film b = new Film(120, "Mr. Bean");
        Film bb = new Film(120, "Mr. Bean");
        Film b2 = new Film(120, "Mr. Bean II");
        mi.salvaFilm();
        
        Videoteca v = new Videoteca();
        v.aggiungiFilm(mi);
        v.aggiungiFilm(b);
        v.aggiungiFilmSmart(bb);
        v.aggiungiFilmSmart(b2);
        System.out.println("");
    }
    
}
