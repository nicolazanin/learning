package piramidicompleto;

import it.units.LibreriaFondamenti;

public class Piramidicompleto {

    public static void main(String[] args) {
        
        System.out.println("============");
        System.out.println("--PIRAMIDI--");
        System.out.println("============");
        
        int base;
        int direzione;

        do {
            System.out.print("Digitare il numero di asterischi di base: ");
            base = LibreriaFondamenti.leggiIntero();
            if(base % 2 == 0){
                System.out.println("ERRORE, il numero deve essere dispari");
            }
        } while ((base) % 2 == 0);

        do {
            System.out.print("Digitare la direzione (0: piramide capovolta, 1: piramide, 2: prisma): ");
            direzione = LibreriaFondamenti.leggiIntero();
        } while (direzione != 1 && direzione != 2 && direzione != 0);
        System.out.println();
        
        int righe = (base - 1) / 2;

        if (direzione == 0) {
            for (int i = 0; i <= righe; i++) {
                int cor = i * 2;
                for (int j = 0; j <= cor; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (base - cor); j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

        if (direzione == 1) {
            for (int i = righe; i >= 0; i--) {
                int cor = i * 2;
                for (int j = 0; j <= cor; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (base - cor); j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

        if (direzione == 2) {
            for (int i = righe; i >= 1; i--) {
                int cor = i * 2;
                for (int j = 0; j <= cor; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (base - cor); j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 0; i <= righe; i++) {
                int cor = i * 2;
                for (int j = 0; j <= cor; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (base - cor); j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }

}
