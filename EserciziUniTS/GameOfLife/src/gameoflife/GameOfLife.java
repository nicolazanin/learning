package gameoflife;

import it.units.LibreriaFondamenti;

/**
 *
 * @author zanin
 */
public class GameOfLife {

    public static void main(String[] args) {
        System.out.println("LIFE GAME");
        System.out.println("0 - linea\n1 - lampo\n2 - blocco\n3 - glider\n4 - rospo\n5 - barca\n6 - acorn\n7 - Gosper glider gun");
        int numero;
        do {
            System.out.print("digita un numero: ");
            numero = LibreriaFondamenti.leggiIntero();
        } while (!(numero < 8));

        int d = LibreriaFondamenti.DIMENSIONE_FINESTRA;

        LibreriaFondamenti.mostraFinestra();

        if (numero == 0) {
            LibreriaFondamenti.accendiPunto(50, 50);
            LibreriaFondamenti.accendiPunto(51, 50);
            LibreriaFondamenti.accendiPunto(49, 50);
            LibreriaFondamenti.accendiPunto(48, 50);
            LibreriaFondamenti.accendiPunto(52, 50);
        }
        if (numero == 1) {
            LibreriaFondamenti.accendiPunto(50, 50);
            LibreriaFondamenti.accendiPunto(51, 50);
            LibreriaFondamenti.accendiPunto(49, 50);
        }
        if (numero == 2) {
            LibreriaFondamenti.accendiPunto(50, 50);
            LibreriaFondamenti.accendiPunto(51, 50);
            LibreriaFondamenti.accendiPunto(50, 51);
            LibreriaFondamenti.accendiPunto(51, 51);
        }
        if (numero == 3) {
            LibreriaFondamenti.accendiPunto(50, 50);
            LibreriaFondamenti.accendiPunto(51, 50);
            LibreriaFondamenti.accendiPunto(52, 50);
            LibreriaFondamenti.accendiPunto(50, 51);
            LibreriaFondamenti.accendiPunto(51, 52);
        }
        if (numero == 4) {
            LibreriaFondamenti.accendiPunto(50, 50);
            LibreriaFondamenti.accendiPunto(51, 50);
            LibreriaFondamenti.accendiPunto(52, 50);
            LibreriaFondamenti.accendiPunto(50, 51);
            LibreriaFondamenti.accendiPunto(51, 51);
            LibreriaFondamenti.accendiPunto(49, 51);
        }
        if (numero == 5) {
            LibreriaFondamenti.accendiPunto(50, 50);
            LibreriaFondamenti.accendiPunto(51, 50);
            LibreriaFondamenti.accendiPunto(50, 51);
            LibreriaFondamenti.accendiPunto(52, 51);
            LibreriaFondamenti.accendiPunto(51, 52);
        }
        if (numero == 6) {
            LibreriaFondamenti.accendiPunto(50, 50);
            LibreriaFondamenti.accendiPunto(51, 50);
            LibreriaFondamenti.accendiPunto(51, 48);
            LibreriaFondamenti.accendiPunto(53, 49);
            LibreriaFondamenti.accendiPunto(54, 50);
            LibreriaFondamenti.accendiPunto(55, 50);
            LibreriaFondamenti.accendiPunto(56, 50);
        }
        if (numero == 7) {
            LibreriaFondamenti.accendiPunto(19, 20);
            LibreriaFondamenti.accendiPunto(20, 20);
            LibreriaFondamenti.accendiPunto(19, 21);
            LibreriaFondamenti.accendiPunto(20, 21);
            LibreriaFondamenti.accendiPunto(29, 21);
            LibreriaFondamenti.accendiPunto(29, 20);
            LibreriaFondamenti.accendiPunto(29, 22);
            LibreriaFondamenti.accendiPunto(30, 23);
            LibreriaFondamenti.accendiPunto(30, 19);
            LibreriaFondamenti.accendiPunto(31, 24);
            LibreriaFondamenti.accendiPunto(31, 18);
            LibreriaFondamenti.accendiPunto(32, 24);
            LibreriaFondamenti.accendiPunto(32, 18);
            LibreriaFondamenti.accendiPunto(33, 21);
            LibreriaFondamenti.accendiPunto(34, 23);
            LibreriaFondamenti.accendiPunto(34, 19);
            LibreriaFondamenti.accendiPunto(35, 21);
            LibreriaFondamenti.accendiPunto(35, 20);
            LibreriaFondamenti.accendiPunto(35, 22);
            LibreriaFondamenti.accendiPunto(36, 21);
            LibreriaFondamenti.accendiPunto(39, 20);
            LibreriaFondamenti.accendiPunto(39, 19);
            LibreriaFondamenti.accendiPunto(39, 18);
            LibreriaFondamenti.accendiPunto(40, 20);
            LibreriaFondamenti.accendiPunto(40, 19);
            LibreriaFondamenti.accendiPunto(40, 18);
            LibreriaFondamenti.accendiPunto(41, 17);
            LibreriaFondamenti.accendiPunto(41, 21);
            LibreriaFondamenti.accendiPunto(43, 17);
            LibreriaFondamenti.accendiPunto(43, 21);
            LibreriaFondamenti.accendiPunto(43, 16);
            LibreriaFondamenti.accendiPunto(43, 22);
            LibreriaFondamenti.accendiPunto(53, 18);
            LibreriaFondamenti.accendiPunto(54, 18);
            LibreriaFondamenti.accendiPunto(54, 19);
            LibreriaFondamenti.accendiPunto(53, 19);
        }

        LibreriaFondamenti.aggiornaDisegno();
        LibreriaFondamenti.dormi(3000);

        do {
            boolean nero;
            for (int i = 5; i < d - 5; i++) { //riga
                for (int j = 5; j < d - 5; j++) { //colonna
                    nero = LibreriaFondamenti.puntoAcceso(j, i);
                    int contaNero;

                    if (nero) { //condizione se cella viva 
                        contaNero = -1; //perchè parto escludendo la cella presa in considerazione 

                        for (int k = i - 1; k <= i + 1; k++) {//
                            for (int l = j - 1; l <= j + 1; l++) {
                                if (LibreriaFondamenti.puntoAcceso(l, k)) {
                                    contaNero++;
                                }
                            }
                        }//
                        if (contaNero != 2 && contaNero != 3) {
                            LibreriaFondamenti.spegniPunto(j, i);
                        }
                    } else { //condizione se cella morta
                        contaNero = 0; //parto da zero perchè la cella che prendo in considerazione è bianca 

                        for (int k = i - 1; k <= i + 1; k++) {//
                            for (int l = j - 1; l <= j + 1; l++) {
                                if (LibreriaFondamenti.puntoAcceso(l, k)) {
                                    contaNero++;
                                }
                            }
                        }//
                        if (contaNero == 3) {
                            LibreriaFondamenti.accendiPunto(j, i);
                        }
                    }

                }

            }

            LibreriaFondamenti.dormi(50);
            LibreriaFondamenti.aggiornaDisegno();

        } while (true);
    }

}
