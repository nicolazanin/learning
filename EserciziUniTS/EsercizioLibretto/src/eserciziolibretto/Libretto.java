package eserciziolibretto;

import it.units.LibreriaFondamenti;

/**
 *
 * @author zanin
 */
public class Libretto {

    public String nome;
    public int anno;
    public Esame[] esami;
    private boolean raccomandato = false;

    public Libretto(String imput) {
        String[] dati = imput.split("\n");
        System.out.print("nome? ");
        String nome = LibreriaFondamenti.leggiStringa();
        int anno;
        do {
            System.out.print("anno di immatricolazione? ");
            anno = LibreriaFondamenti.leggiIntero();
        } while (!(anno >= 1950 && anno <= 2010));
        this.nome = nome;
        this.anno = anno;
        if (LibreriaFondamenti.generaNumeroCasuale(10) > 5) {
            raccomandato = true;
        }
        this.esami = new Esame[dati.length];
        for (int i = 0; i < dati.length; i++) {
            Esame esame = new Esame(dati[i]);
            if (raccomandato && esame.voto < 18) {
                esame.voto = 18;
            }
            esami[i] = esame;
        }
    }

    @Override
    public String toString() {
        String testo = ("Libretto di: " + nome + " - Anno immatricolazione: " + anno);
        for (Esame esame : esami) {
            String esito = "BOCCIATO";
            if (esame.voto >= esame.VOTO_MINIMO) {
                esito = "PROMOSSO";
            }
            testo = testo + ("\n" + esame.toString() + " - esito: " + esito);
        }
        return testo;
    }

    public double calcolaMedia() {
        int sommaEsami = 0;
        int sommaCfu = 0;
        int contatore = 0;
        for (Esame esame : esami) {
            if (esame.voto >= esame.VOTO_MINIMO) {
                contatore++;
                sommaEsami = sommaEsami + esame.voto * esame.cfu;
                sommaCfu = sommaCfu + esame.cfu;
            }
        }
        if (contatore == 0) {
            return 0;
        }
        double media = sommaEsami / sommaCfu;
        return media;
    }

}
