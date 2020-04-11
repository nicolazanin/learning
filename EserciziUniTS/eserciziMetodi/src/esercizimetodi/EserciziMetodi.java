package esercizimetodi;
/**
 *
 * @author zanin
 */
public class EserciziMetodi {

    public static void main(String[] args) {

        //metodo che trova il massimo
        int[] numeri = {-20, -1, -10, -100, -20};
        System.out.println(massimo(numeri));

        //metodo che inverte l'ordine
        double[] virgola = {1.0, 2.0, -1.25};
        double[] invertito = invertito(virgola);

        //metodo testo
        String saluto = "ciao";
        lettere(saluto);

        //numeri pari
        boolean pari = trovaNumeriPari(numeri);
        System.out.println(pari);

        //dislivelli
        int[] quote = {10, 100, 90, 100, 10};
        System.out.println(dislivello(quote));

        //trova 1
        int numeroCon = 223412;
        int numeroSenza = 234557;
        System.out.println(uno(numeroCon));
        System.out.println(uno(numeroSenza));

        //bonus
        //metodo che ordina (decrescente)
        int[] numeri1 = {-20, 1, 10, -2147483648, -20};
        int[] ordinato = ordinato(numeri1);

        System.out.println("");
    }

    //metodo trova massimo
    public static int massimo(int[] valore) {
        int controllo = valore[0];
        for (int i = 0; i < valore.length; i++) {
            if (valore[i] > controllo) {
                controllo = valore[i];
            }
        }
        return controllo;
    }

    //metodo inverti ordine
    public static double[] invertito(double[] valore) {
        double[] valoreInvertito = new double[valore.length];
        for (int i = 0; i < valore.length; i++) {
            valoreInvertito[i] = valore[valore.length - 1 - i];
        }
        return valoreInvertito;
    }

    //metodo testo 
    public static void lettere(String frase) {
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
        }
    }
 
    //metodo trova numeri pari
    public static boolean trovaNumeriPari(int[] numeri) {
        for (int numero : numeri) {
            if (numero % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    //metodo calcola dislivelli
    public static int dislivello(int[] altitudini) {
        int dislivelloTot = 0;
        for (int i = 1; i < altitudini.length; i++) {
            if (altitudini[i] > altitudini[i - 1]) {
                int sottrazione = altitudini[i] - altitudini[i - 1];
                dislivelloTot = dislivelloTot + sottrazione;
            }
        }
        return dislivelloTot;
    }

    //metodo trova 1
    public static boolean uno(int numero) {
        String numeroStringa = Integer.toString(numero);
        boolean bool = false;
        for (int i = 0; i < numeroStringa.length(); i++) {
            char lettera = numeroStringa.charAt(i);
            char uno = '1';
            if (lettera == uno) {
                bool = true;
            }
        }
        return bool;
    }

    //bonus
    //metodo ordine decrescente
    public static int[] ordinato(int[] valore1) { //metodo che ordina una array 
        int valore[] = valore1;
        int[] ordine = new int[valore.length];
        int j = 0;
        do {
            int controllo = valore[0];
            for (int i = 0; i < valore.length; i++) {
                if (valore[i] > controllo) {
                    controllo = valore[i];
                }
                ordine[j] = controllo;
            }
            for (int k = 0; k < valore.length; k++) {
                if (valore[k] == controllo) {
                    double inf = Double.POSITIVE_INFINITY; //setta il valore a meno infinito 
                    valore[k] = (int) -inf;
                    break;
                }
            }
            j++;
        } while (j < valore.length);
        return ordine;//il metodo funziona solo con numeri maggiori di -2147483648
    }
}
