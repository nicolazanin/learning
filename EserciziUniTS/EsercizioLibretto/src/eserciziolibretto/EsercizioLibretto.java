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
        Libretto l = preparaLibretto(contenutoFile);
        stampaLibretto(l);
        double media = calcolaMedia(l);
        System.out.format("Voto medio degli esami passati: %.2f\n ", media);
        
    }
    public static Libretto preparaLibretto(String imput) {

        String dati[] = imput.split("\n");
        Libretto libretto = new Libretto();
        System.out.print("nome? ");
        String nome = LibreriaFondamenti.leggiStringa();
        int anno;
        do{
            System.out.print("anno di immatricolazione? ");
            anno = LibreriaFondamenti.leggiIntero();
        }while(!(anno >= 1950 && anno <= 2010));
        
        libretto.nome = nome;
        libretto.anno = anno;
        libretto.esami = new Esame[dati.length];
        for (int i = 0; i < dati.length; i++) {
            Esame esame = decodificaEsame(dati[i]);
            libretto.esami[i] = esame;
        }
        return libretto;
    }

    public static Esame decodificaEsame(String riga) {
        String[] dati = riga.split(";");
        Esame esame = new Esame();
        esame.nomeEsame = dati[2];
        esame.cfu = Integer.parseInt(dati[1]);
        esame.voto = Integer.parseInt(dati[0]);
        return esame;
    }
    
    public static void stampaLibretto(Libretto libretto){
        System.out.println("Libretto di: " + libretto.nome + " - Anno immatricolazione: " + libretto.anno );
        for (Esame esame : libretto.esami ) {
            String esito = "BOCCIATO";
            if (esame.voto >= esame.VOTO_MINIMO) {
                esito = "PROMOSSO";
            }
            System.out.println(" * " + esame.nomeEsame + " - voto: " + esame.voto + " - cfu: " + esame.cfu + " - esito: " + esito);
        }
    }
    
    public static double calcolaMedia(Libretto libretto){
        if (libretto == null) {
            return -1;
        }
        int sommaEsami = 0;
        int sommaCfu = 0;
        int contatore = 0;
        Esame[] esami = libretto.esami;
        for (Esame esame : esami) {
            if (esame.voto >= esame.VOTO_MINIMO) {
               contatore++;
               sommaEsami = sommaEsami + esame.voto * esame.cfu;
               sommaCfu = sommaCfu + esame.cfu;
            }
        }
        if (contatore == 0) {
            return -1;
        }
        double media = sommaEsami/sommaCfu;
        return media;
    }
}
