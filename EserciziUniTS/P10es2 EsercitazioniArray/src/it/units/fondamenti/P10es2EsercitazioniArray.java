package it.units.fondamenti;

import it.units.LibreriaFondamenti;

/**
 *
 * @author giorgio
 */
public class P10es2EsercitazioniArray {

  public static void main(String[] args) {
    //*********************************
    //**** PARTE 1 - VOTI SEMPLICI **** 
    //*********************************
    System.out.println("*********************************");
    System.out.println("**** PARTE 1 - VOTI SEMPLICI ****");
    System.out.println("*********************************");
    //leggo il file CSV in una stringa
    String fileVotiSemplici = LibreriaFondamenti.caricaStringaDaFile("VotiSemplici.csv");

    //creo un array: un voto per riga
    String[] righeVotiSemplici = fileVotiSemplici.split("\r\n");
    //Controllo che ci siano tutti i voti
    System.out.println("Voti letti (ne aspetto 121): " + righeVotiSemplici.length);

    //Creo il contenitore di voti. Una riga per ogni studente.
    int[] votiSemplici = new int[righeVotiSemplici.length];
    //ora devo caricarci dentro i voti, convertendo la STRINGA in un numero
    for (int i = 0; i < righeVotiSemplici.length; i++) {
      votiSemplici[i] = Integer.parseInt(righeVotiSemplici[i]);
      /*Se questa riga qui sopra genera un errore: 
        vuol dire che Java si aspetta un modo diverso per andare a capo.
        Nel file sto usando il sistema WINDOWS (due caratteri: CR + LF); magari il 
        Sistema Operativo su cui sono ne aspetta uno solo --> rimane il carattere LF all'interno della stringa.
      
        Soluzione: correggere la parte sopra e usare come sequenza di caratteri per lo split \r\n
       */
    }

    //calcolo la media dei voti ed il numero di persone promosse
    //salvo la somma in un double, così forzo l'operazione corretta
    double somma = 0;
    int promossi = 0;
    for (int voto : votiSemplici) {
      somma += voto;
      if (voto >= 18) {
        promossi++;
      }
    }

    double media = somma / votiSemplici.length;
    System.out.format("Media: %.2f\n", media);
    System.out.println("Promossi: " + promossi);

    //*********************************
    //**** PARTE 2 - VOTI COMPLETI **** 
    //*********************************
    System.out.println("");
    System.out.println("*********************************");
    System.out.println("**** PARTE 2 - VOTI COMPLETI ****");
    System.out.println("*********************************");

    //leggo il file CSV in una stringa
    String fileVoti = LibreriaFondamenti.caricaStringaDaFile("VotiCompleti.csv");

    //creo un array: un voto per riga
    String[] righeVoti = fileVoti.split("\r\n");
    //Controllo che ci siano tutti i voti
    System.out.println("Voti letti (ne aspetto 121): " + righeVoti.length);

    //creo il contenitore di voti. Una Riga per ogni studente, due colonne
    // (una per teoria e una per programmazione)
    int[][] voti = new int[righeVoti.length][2];

    //itero su tutte le righe e carico i dati nell'array bidimensionale
    for (int i = 0; i < righeVoti.length; i++) {
      String riga = righeVoti[i];
      //devo spezzare la riga: uso di nuovo lo split
      String[] dati = riga.split(";");
      voti[i][0] = Integer.parseInt(dati[0]);
      voti[i][1] = Integer.parseInt(dati[1]);
    }

    //azzero i valori per fare i conti
    somma = 0;
    promossi = 0;
    for (int i = 0; i < voti.length; i++) {
      //il voto è la somma di teoria e programmazione
      int voto = voti[i][0] + voti[i][1];
      somma += voto;
      //sono promosso se ho passato teoria E programmazione
      if (voti[i][0] >= 9 && voti[i][1] >= 9) {
        promossi++;
      }
    }
    media = somma / voti.length;
    System.out.format("Media: %.2f\n", media);
    System.out.println("Promossi: " + promossi);

    //preparo l'istogramma
    // uso un array di 16 elementi
    // uso la posizione i-esima per scrivere quante persone hanno ricevuto il voto i
    int[] istogramma = new int[16];
    for (int i = 0; i < voti.length; i++) {
      int voto = voti[i][0];
      istogramma[voto]++;
    }
    //disegno l'istogramma
    System.out.println("");
    System.out.println("Istogramma voti teoria");
    for (int i = 0; i < istogramma.length; i++) {
      //uso la tabulazione, altrimenti si allinea male con il voto a due cifre (10, 11, ecc)
      System.out.print(i + ":\t");
      for (int j = 0; j < istogramma[i]; j++) {
        System.out.print("*");
      }
      //fine riga, vado a capo
      System.out.println("");
    }

    //Calcolo la deviazione standard - ma devo rifare tutto, voglio solo chi ha votoTeoria != 0
    somma = 0;
    int votiDiversiZero = 0;
    for (int i = 0; i < voti.length; i++) {
      if (voti[i][1] != 0) {
        //il voto è la somma di teoria e programmazione
        int voto = voti[i][0] + voti[i][1];
        somma += voto;
        votiDiversiZero++;
      }
    }
    media = somma / votiDiversiZero;

    double sommaQ = 0;
    for (int i = 0; i < voti.length; i++) {
      if (voti[i][1] != 0) {
        int voto = voti[i][0] + voti[i][1];
        sommaQ += Math.pow(voto - media, 2);
      }
    }
    double varianza = sommaQ / votiDiversiZero;
    System.out.format("\n\nDeviazione standard: %.2f\n", Math.sqrt(varianza));

  }

}
