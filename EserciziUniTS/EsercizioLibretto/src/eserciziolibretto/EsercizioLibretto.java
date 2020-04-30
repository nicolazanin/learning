package eserciziolibretto;

import it.units.LibreriaFondamenti;

/**
 *
 * @author zanin
 */
public class EsercizioLibretto {

    public static void main(String[] args) {
        System.out.println("*****************");
        System.out.println("* ESAMI DA FILE *");
        System.out.println("*****************");
        String contenutoFile = LibreriaFondamenti.caricaStringaDaFile("voti.txt");
        Libretto l = new Libretto(contenutoFile);
        System.out.println(l);
        double media = l.calcolaMedia();
        System.out.format("Voto medio degli esami passati: %.2f\n ", media);
    }
}
