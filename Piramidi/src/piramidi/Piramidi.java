
package piramidi;

// @author zanin

public class Piramidi {


    public static void main(String[] args) {
        
        int base = 9;
        int righe = (base-1)/2;
        
        //piramide in giù
        for (int i = 0; i <= righe; i++) {
            int cor = i*2;
            for (int j = 0; j <= cor; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (base-cor) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println(" ");
        
        //piramide in su
        for (int i = righe; i >= 0; i--) {
            int cor = i*2;
            for (int j = 0; j <= cor; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (base-cor) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("");
        
        //prisma
         for (int i = righe; i >= 1; i--) {
            int cor = i*2;
            for (int j = 0; j <= cor; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (base-cor) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
         for (int i = 0; i <= righe; i++) {
            int cor = i*2;
            for (int j = 0; j <= cor; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (base-cor) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println(" ");
       
    }
    
}
