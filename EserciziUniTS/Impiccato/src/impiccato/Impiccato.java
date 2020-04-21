package impiccato;

import it.units.LibreriaFondamenti;

/**
 *
 * @author zanin
 */
public class Impiccato {

    public static void main(String[] args) {
        String[] parole = new String[10];
        int[] errori = new int[10];
        int x = 0;
        String parola;
        do {
            parola = LibreriaFondamenti.leggiStringa().toUpperCase();
            if (!parola.equals("FINE")) {
                char[] corretto = new char[parola.length()];
                for (int i = 0; i < corretto.length; i++) {
                    corretto[i] = parola.charAt(i);
                }

                String[] impiccato = new String[parola.length()];
                for (int i = 0; i < impiccato.length; i++) {
                    impiccato[i] = "_";
                }

                boolean fine = false;
                int contaErrori = 0;
                do {

                    for (int i = 0; i < impiccato.length; i++) {
                        System.out.print(impiccato[i] + " ");
                    }

                    System.out.print("   digita la lettera: ");
                    String letteraT = LibreriaFondamenti.leggiStringa().toUpperCase();
                    char lettera = letteraT.charAt(0);

                    boolean uguale = false;

                    for (int i = 0; i < impiccato.length; i++) {
                        if (lettera == corretto[i] && !(lettera == impiccato[i].charAt(0))) {
                            uguale = true;
                            break;
                        }
                    }

                    if (uguale) {
                        System.out.println("giusto!!! \n");
                        for (int i = 0; i < impiccato.length; i++) {
                            if (lettera == corretto[i]) {
                                impiccato[i] = letteraT;
                            }
                        }
                    } else {
                        System.out.print("sbagliato! ");
                        contaErrori++;
                        System.out.println("errori: " + contaErrori + "\n");
                    }

                    fine = true;
                    for (String under : impiccato) {
                        if (under.equals("_")) {
                            fine = false;
                        }
                    }
                } while (!fine && (contaErrori < 10));

                System.out.println("la parola è: " + parola);
                parole[x] = parola;
                errori[x] = contaErrori;
                x++;
            }
        } while (x <= 10 && !parola.equals("FINE"));

        for (int i = 0; i < errori.length; i++) {
            System.out.println("\n" + parole[i] + " errori: " + errori[i]);
        }

    }

}
