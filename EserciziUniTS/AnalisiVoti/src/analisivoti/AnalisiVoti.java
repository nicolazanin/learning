
package analisivoti;

import it.units.LibreriaFondamenti;


public class AnalisiVoti {


    public static void main(String[] args) {

        System.out.println("ANALISI VOTI PREAPPELLO FONDAMENTI DI INFORMATICA\n");
        
        
        //creazione array teoria e programmazione  da file 
        
        String preappello = LibreriaFondamenti.caricaStringaDaFile("VotiCompleti.csv");
        String righe [] = preappello.split("\r\n");
        
        int [] votiTeo = new int [righe.length];
        int [] votiPro = new int [righe.length];

        
        for (int i = 0; i < righe.length; i++) {
           String [] voti = righe[i].split(";");
            for (int j = 0; j < voti.length; j++) {
                if (j == 0) {
                    votiTeo[i] = Integer.parseInt(voti[0]); 
                }
                else{
                    votiPro[i] = Integer.parseInt(voti[1]);
                }
            }
        }

        
        //calcolo media e  promossi 
        
        int somma = 0;        
        int contatore = 0;
        for (int i = 0; i < righe.length; i++) {
            int votoTot = votiTeo[i] + votiPro[i];
            somma = somma + votoTot;
            if (votiTeo[i] > 8 && votiPro[i] > 8) {
                contatore = contatore + 1;
            }
        }
        
        System.out.println("Totale Studenti: "+ righe.length);
        double media = (double) somma/righe.length;
        System.out.format("Media voti: %.2f \n" , media);
        System.out.println("Promossi: " + contatore);
        
        
        //istogramma voti teoria
        
        System.out.println("\n\nISTOGRAMMA VOTI TEORIA\n");
        int [] controllo = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int [] contaVoto = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for (int voto : votiTeo) {
            for (int i = 0; i < controllo.length; i++) {
                if (voto == controllo[i]) {
                    contaVoto[i] = contaVoto[i] + 1; 
                }
            }
        }
        
        for (int i = 0; i < contaVoto.length; i++) {
            System.out.print("voto " + i + "\t");
            for (int j = 0; j < contaVoto[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        //derivazione standard
        
        contatore = 0;
        somma = 0;
        for (int i = 0; i < righe.length; i++) {
            if (votiPro[i] != 0) {
                int votoTot = votiTeo[i] + votiPro[i];
                somma = somma + votoTot;
                contatore++;
            }
        }
        media = (double)somma/contatore;
        
        double sommaQ = 0;
        for (int i = 0; i < righe.length; i++) {
            if (votiPro[i] != 0) {
                int votoTot = votiTeo[i] + votiPro[i];
                sommaQ += Math.pow(votoTot - media, 2);
            }
        }
        double varianza = sommaQ/contatore;
        double deviazione = Math.sqrt(varianza);
        System.out.format("\nDeviazione standard: %.2f\n\n", deviazione);

    }
    
}
