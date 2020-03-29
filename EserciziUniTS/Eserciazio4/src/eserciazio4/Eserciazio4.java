
package eserciazio4;

import it.units.LibreriaFondamenti;
import java.util.Locale;

public class Eserciazio4 {

    public static void main(String[] args) {
        System.out.println("--------------");
        System.out.println("-----TASI-----");
        System.out.println("--------------");

        System.out.print("Digitare rendita catastale: ");  
        int renditaC = LibreriaFondamenti.leggiIntero();
        System.out.print("digitare la categoria dell' immobile: ");
        int categoria = LibreriaFondamenti.leggiIntero();
       // System.out.print("digitare il numero di figli: ");
       // int nFigli = LibreriaFondamenti.leggiIntero();
        
        //double baseImponibile = (double)renditaC*1.5;
        if(categoria == 1){
            System.out.print("digitare il numero di figli: ");
            int nFigli = LibreriaFondamenti.leggiIntero();
            int moltiplicatore = 160;
            double baseImponibile = renditaC*1.05*moltiplicatore;
            if(renditaC <= 300){
                double aliquota = 0.000;
                double imposta = baseImponibile*aliquota;
                System.out.println("imposta: " + imposta);
            }
            else if (renditaC <= 600){
                double aliquota = 0.0025;
                
                if(renditaC <= 400){
                    int detrazione = 90 + nFigli*5;
                    double imposta = baseImponibile*aliquota-detrazione;
                    System.out.println("imposta: " + imposta);
                }
                else if (renditaC <= 500){
                    int detrazione = 60 + nFigli*5;
                    double imposta = baseImponibile*aliquota-detrazione;
                    System.out.println("imposta: " + imposta);
                }
                else{
                    int detrazione = 30 + nFigli*5;
                    double imposta = baseImponibile*aliquota-detrazione;
                    System.out.println("imposta: " + imposta);
                }
                
            }
            else{
                double aliquota = 0.0033;
                int detrazione = 30+ nFigli*5;
                double imposta = baseImponibile*aliquota-detrazione;
                System.out.println("imposta: " + imposta);
            }
        }
        else if(categoria == 2){
            int moltiplicatore = 140;
            double baseImponibile = renditaC*1.05*moltiplicatore;
            double aliquota = 0.001;
            double imposta = baseImponibile*aliquota;
            System.out.println("imposta: " + imposta);

        }
        else if(categoria == 3){
            int moltiplicatore = 65;
            double baseImponibile = renditaC*1.05*moltiplicatore;
            double aliquota = 0.0021;
            double imposta = baseImponibile*aliquota;
            System.out.println("imposta: " + imposta);
        }
        else{
            System.out.println("errore categoria, inserire solo le categorie possibili");
        }

    }
    
}
