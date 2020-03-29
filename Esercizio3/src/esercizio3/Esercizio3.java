
package esercizio3;

import it.units.LibreriaFondamenti;


public class Esercizio3 {


    public static void main(String[] args) {
        System.out.print("digita il numero in base 16: ");
        String n16 = LibreriaFondamenti.leggiStringa();
        
        //A=10 B=11 C=12 D=13 E=14 F=15
        char primoCarattere = n16.charAt(0);
        char secondoCarattere = n16.charAt(1);
        int valChar0 = primoCarattere;
        int valChar1 = secondoCarattere;

        //System.out.println(valChar0);
        //System.out.println(valChar1);
 
        if(valChar0 >= 65){
            int car1 = valChar0-55;

            if(valChar1 >= 65){
                int n10 = (car1*16)+valChar1-55;
                System.out.println(n10);
            }
            else{
                int n10 = (car1*16)+valChar1-48;
                System.out.println(n10);
            }
        }
        else{
            int car1 = valChar0-48;

            if(valChar1 >= 65){
                int n10 = (car1*16)+valChar1-55;
                System.out.println(n10);
            }
            else{
                int n10 = (car1*16)+valChar1-48;
                System.out.println(n10);
            }
        }

    }
    
}
