package ricercaeordinamento;

import it.units.LibreriaFondamenti;

/**
 *
 * @author zanin
 */
public class RicercaEOrdinamento {

    public static int ricercaEsaustiva(String parola, String[] dizionario) {
        for (int i = 0; i < dizionario.length; i++) {
            if (dizionario[i].equals(parola)) {
                return i;
            }
        }
        return -1;
    }

    public static int ricercaSalti(String parola, String[] dizionario) {
        for (int i = 0; i < dizionario.length; i += 2) {
            if (dizionario[i].equals(parola)) {
                return i;
            } else if (dizionario[i].compareTo(parola) > 0) {
                if (dizionario[i - 1].equals(parola)) {
                    return i - 1;
                } else {
                    return -1;
                }
            }
        }
        return -1;
    }
    /*
    salti di due se la parola che cerchiamo è diversa da in cui ci troviamo allora ci sono 2 possibilità
        -la parola che cerchiamo è la parola prima di quella 
        -la parola non c'è
    */
    

    public static int ricercaDivideConquer(String parola, String[] dizionario) {
        int from = 0;
        int end = dizionario.length - 1;
        while (from <= end) {
            int mid = (from + end) / 2;
            if (dizionario[mid].equals(parola)) {
                return mid;
            } else if (dizionario[mid].compareTo(parola) > 0) {
                end = mid - 1;
            } else {
                from = mid + 1;
            }
        }
        return -1;
    }
    /*
    la ricerca dividi e conquista parte da metà del dizionario: 
    - se la parola che consideriamo si trova a metà finisce
    - se non è così controlla su quale metà sia, metà.compareTo(Parola) ritorna un intero
      maggiore se metà è dopo di Parola o minore semetà è prima di Parola
        - se maggiore significa che si trova nella metà precedente (considero da metà)
            -allora imposto la fine del dizionario da analizzare con la metà-1 (meno perchè ho gia analizzata)
        - se minore significa che si trova nella metà successiva 
            -allora imposto l' inizio del dizionario da analizzare con la metà+1
    */

    public static void selectionSortNumeri(int[] valori) {
        for (int i = 0; i < valori.length - 1; i++) {
            int indiceInversione = i;
            for (int j = i + 1; j < valori.length; j++) {
                if (valori[j] < valori[indiceInversione]) {
                    indiceInversione = j;
                }
            }
            int valMinore = valori[indiceInversione];
            valori[indiceInversione] = valori[i];
            valori[i] = valMinore;
        }
    }

    public static void bubbleSortNumeri(int[] valori) {
        boolean continua = true;
        while (continua) {
            continua = false;
            for (int i = 0; i < valori.length - 1; i++) {
                if (valori[i + 1] < valori[i]) {
                    int valMinore = valori[i + 1];
                    valori[i + 1] = valori[i];
                    valori[i] = valMinore;
                    continua = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        //RICERCA STRINGHE
        String file = LibreriaFondamenti.caricaStringaDaFile("words.italian.txt");
        String[] dizionario = file.split("\n");
        int indice = ricercaDivideConquer("fondamenti", dizionario);
        System.out.println("la parola fondamenti, indice: " + indice + "\n");
        
        int indice2 = ricercaSalti("informatica", dizionario);
        System.out.println("la parola informatica, indice: " + indice2 + "\n");
        
        int indice3 = ricercaEsaustiva("ciao", dizionario);
        System.out.println("la parola ciao, indice: " + indice3 + "\n");
        
        // ORDINAMENTO NUMERI
        System.out.println("SELECTION SORT"); 
        int[] valori = {5, 1, 12, -5, 16, 2, 12, 14};
        selectionSortNumeri(valori);
        for (int valore : valori) {
            System.out.print(valore + ", ");
        }
        System.out.println();
        
        System.out.println("BUBBLE SORT");
        int[] altriValori = {5, 1, 12, -5, 16, 2, 12, 14};
        bubbleSortNumeri(altriValori);
        for (int valore : altriValori) {
            System.out.print(valore + ", ");
        }
        System.out.println("\n");
        
        // ORDINAMENTO STRINGHE
        System.out.println("BUBBLE SORT");
        String file2 = LibreriaFondamenti.caricaStringaDaFile("words.italian.random.small.txt");
        String[] dizionaroRandomPiccolo = file2.split("\n");
        bubbleSortStringhe(dizionaroRandomPiccolo);
        for (String stringa : dizionaroRandomPiccolo) {
            System.out.print(stringa + ", ");
        }
        System.out.println();
        
        System.out.println("SELECTION SORT");
        String file3 = LibreriaFondamenti.caricaStringaDaFile("words.italian.random.small.txt");
        String[] dizionaroRandomPiccolo2 = file2.split("\n");
        selectionSortStringhe(dizionaroRandomPiccolo2);
        for (String stringa : dizionaroRandomPiccolo2) {
            System.out.print(stringa + ", ");
        }
        System.out.println();
    }
    
    public static void bubbleSortStringhe(String[] parola) {
        boolean continua = true;
        while (continua) {
            continua = false;
            for (int i = 0; i < parola.length - 1; i++) {
                if (parola[i + 1].compareTo(parola[i]) < 0) {
                    String valMinore = parola[i + 1];
                    parola[i + 1] = parola[i];
                    parola[i] = valMinore;
                    continua = true;
                }
            }
        }
    }

    public static void selectionSortStringhe(String[] parola) {
        for (int i = 0; i < parola.length - 1; i++) {
            int indiceInversione = i;
            for (int j = i + 1; j < parola.length; j++) {
                if (parola[j].compareTo(parola[indiceInversione]) < 0 ) {
                    indiceInversione = j;
                }
            }
            String valMinore = parola[indiceInversione];
            parola[indiceInversione] = parola[i];
            parola[i] = valMinore;
        }
    }    

}
