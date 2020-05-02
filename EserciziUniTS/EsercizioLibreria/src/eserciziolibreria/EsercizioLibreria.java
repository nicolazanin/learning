package eserciziolibreria;

/**
 *
 * @author zanin
 */
public class EsercizioLibreria {

    public static void main(String[] args) {
        Libro libro1 = new Libro("Promessi sposi", "Manzoni", 607);
        System.out.println("Test toString: " + libro1);
        
        Libro libro2 = new Libro("Assassinio sull'OrientExpress", "Agatha Christie", 238);
        Libro libro3 = new Libro("Java", "autori vari", 880);
        Libreria libreria = new Libreria();
        System.out.println("\n>>>>>>> Caricamento");
        libreria.aggiungiLibro(libro1);
        libreria.aggiungiLibro(libro2);
        libreria.aggiungiLibro(libro3);
        
    }

}
