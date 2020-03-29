
package esercizio4corretto;

import it.units.LibreriaFondamenti;


public class Esercizio4corretto {


    public static void main(String[] args) {
        
        System.out.println("--------------");
        System.out.println("-----TASI-----");
        System.out.println("--------------");

        System.out.print("Digitare rendita catastale: ");  
        int renditaC = LibreriaFondamenti.leggiIntero();
        System.out.print("digitare la categoria dell' immobile: ");
        int categoria = LibreriaFondamenti.leggiIntero();
        
        double aliquota = 0;
        int detrazione = 0;
        int moltiplicatore = 0;
        
        //categoria 1
        if(categoria == 1){
            System.out.print("digitare il numero di figli: ");
            int nFigli = LibreriaFondamenti.leggiIntero();
            int nFS = nFigli*5;
            moltiplicatore = 160;
            if(renditaC <= 300){
                 aliquota = 0.000;
                 detrazione = 0;
            }
            else if (renditaC <= 600){
                aliquota = 0.0025;
                if(renditaC <= 400){
                    detrazione = 90 + nFS;
                }
                else if (renditaC <= 500){
                    detrazione = 60 + nFS;
                }
                else{
                    detrazione = 30 + nFS;
                }
            }
            else{
                aliquota = 0.0033;
                detrazione = 30+ nFS;
            }
        }
        //categoria 2
        else if(categoria == 2){
            moltiplicatore = 140;
            detrazione = 0;
            aliquota = 0.001;

        //categora 3
        }
        else if(categoria == 3){
            moltiplicatore = 65;
            detrazione = 0;
            aliquota = 0.0021;
        }
        
        //categoria errata
        else{
            System.out.println("errore categoria, inserire solo le categorie possibili");
        }
        
        //calcolo imposta
        double baseImponibile = renditaC*1.05*moltiplicatore;
        double imposta = baseImponibile*aliquota-detrazione;
        System.out.println("imposta: " + imposta);
        
        
    }

}
