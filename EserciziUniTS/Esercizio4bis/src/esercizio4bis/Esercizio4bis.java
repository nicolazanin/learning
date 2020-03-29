
package esercizio4bis;

public class Esercizio4bis {


    public static void main(String[] args) {
  
        System.out.println("--------------");
        System.out.println("-----TASI-----");
        System.out.println("--------------");

        System.out.print("Digitare rendita catastale: ");  
        int renditaC = 315;
        System.out.print("digitare la categoria dell' immobile: ");
        int categoria = 1;
        
        int moltiplicatore;
        double aliquota;
        int detrazione;
       // System.out.print("digitare il numero di figli: ");
       // int nFigli = LibreriaFondamenti.leggiIntero();
        
        //double baseImponibile = (double)renditaC*1.5;
        if(categoria == 1){
            System.out.print("digitare il numero di figli: ");
            int nFigli = 0;
            moltiplicatore = 160;
            //double baseImponibile = renditaC*1.05*moltiplicatore;
            if(renditaC <= 300){
                 aliquota = 0.000;
                //double imposta = baseImponibile*aliquota;
                //System.out.println("imposta: " + imposta);
            }
            else if (renditaC <= 600){
                 aliquota = 0.0025;
                
                if(renditaC <= 400){
                    detrazione = 90 + nFigli*5;
                    //double imposta = baseImponibile*aliquota-detrazione;
                    //System.out.println("imposta: " + imposta);
                }
                else if (renditaC <= 500){
                     detrazione = 60 + nFigli*5;
                    //double imposta = baseImponibile*aliquota-detrazione;
                    //System.out.println("imposta: " + imposta);
                }
                else{
                     detrazione = 30 + nFigli*5;
                    //double imposta = baseImponibile*aliquota-detrazione;
                    //System.out.println("imposta: " + imposta);
                }
                
                
                double baseImponibile = renditaC*1.05*moltiplicatore;
                double imposta = baseImponibile*aliquota-detrazione;
                System.out.println("   " + imposta);
         /*       
                
                
            }
            else{
                 aliquota = 0.0033;
                int detrazione = 30+ nFigli*5;
                double imposta = baseImponibile*aliquota-detrazione;
                System.out.println("imposta: " + imposta);
            }
        }
        else if(categoria == 2){
             moltiplicatore = 140;
            double baseImponibile = renditaC*1.05*moltiplicatore;
             aliquota = 0.001;
            double imposta = baseImponibile*aliquota;
            System.out.println("imposta: " + imposta);

        }
        else if(categoria == 3){
             moltiplicatore = 65;
            double baseImponibile = renditaC*1.05*moltiplicatore;
             aliquota = 0.0021;
            double imposta = baseImponibile*aliquota;
            System.out.println("imposta: " + imposta);
        }
        else{
            System.out.println("errore categoria, inserire solo le categorie possibili");
        }
     */
    }
    
}
