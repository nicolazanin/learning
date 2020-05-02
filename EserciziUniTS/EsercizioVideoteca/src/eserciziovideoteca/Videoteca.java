package eserciziovideoteca;

import it.units.LibreriaFondamenti;

/**
 *
 * @author zanin
 */
public class Videoteca {

    public Film[] collezione = new Film[0];

    public void aggiungiFilm(Film film) {
        Film[] collezioneAggiornata = new Film[collezione.length + 1];
        for (int i = 0; i < collezione.length; i++) {
            collezioneAggiornata[i] = collezione[i];
        }
        collezioneAggiornata[collezioneAggiornata.length - 1] = film;
        this.collezione = collezioneAggiornata;
        System.out.println("Il film: " + film + " è stato aggiunto");
    }
    
    public Film ritornaFilm(int durataMinima){
        int casuale = LibreriaFondamenti.generaNumeroCasuale(collezione.length);
        if (collezione[casuale].durata >= durataMinima) {
            return collezione[casuale];
        }
        return null;
    }
    
    public int trovaFilm(String titolo){
        for (int i = 0; i < collezione.length; i++) {
            if (collezione[i].titolo.equals(titolo)) {
               return i; 
            }
        }
        return -1;
    }
    
    public void aggiungiFilmSmart (Film film){
        if (trovaFilm(film.titolo) == -1) {
            aggiungiFilm(film);
        }
        else{
            System.out.println("Il film: " + film + " è già stato aggiunto!");
        }
    }
}
