
package test8;

import java.util.Arrays;
import java.util.Scanner;


public class Test8 {

    public static void main(String[] args) {
        System.out.println("Digitare il numero di elemnti insieme");
        Scanner sdim = new Scanner(System.in);
        int ndim = sdim.nextInt();
        
        int[] dim = new int[ndim];
        System.out.println("numero di elementi: " + ndim);
        
        
        for (int i = 0; i < ndim; i++ ) // qua abbiamo dato la lunghezza da input se abbiamo l'array gia metti al posto di ndim dim.length 
        {
            System.out.println("digitare il valore dell' elemento");
           Scanner sval = new Scanner(System.in);
           int x = sval.nextInt();
           dim [i] = x;
        }
        
        System.out.println(" ");
        System.out.println("L'insieme è:" + Arrays.toString(dim));
        
        for (int i = 0; i < ndim; i++ )
        {
            if ( dim[i] == 19)
            {
                System.out.println("\nvalore 19, ha index:" + i);
            }
                
        }
        System.out.println(" ");
        
        Arrays.sort(dim); //quando abbiamo array molto grani allora usiamo .parallelSort
        System.out.println("L'insieme in ordine crescente è:" + Arrays.toString(dim));
        
        
        int[] dim2 = {0, 0, 0};
        //System.out.println(dim2.length + "-----"); viene 3
        
        if(Arrays.equals(dim, dim2)) //se uguala a dim2 allora lo modifica con tutti 1
        {
            System.out.println("[insieme banale 0,0,0]");
            
            Arrays.fill(dim, 1);
            
            System.out.println("\nL'insieme banale aggiornato a:" + Arrays.toString(dim));
        }
        
        //creo adesso un 2d array
        
        int[][] dued = //a quanto pare non si possono mettere numeri
        {
            {1, 2, 3},
            {4, 5, 6,},
            {7, 8, 9},
            {10}
        };
        System.out.println(" ");
        System.out.println("==================================");
        System.out.println("\"prova array2d\"\nElemento che si trova a index 1,1");
        System.out.println(dued[1][1]);
        System.out.println(Arrays.deepToString(dued));
        System.out.println("==================================");
        System.out.println(" ");
        
        //creare un algoritmo che legga tutti i valori di dued
        System.out.println("numero di insiemi");
        System.out.println(dued.length);
        System.out.println(" ");
        
        for(int riga = 0; riga < dued.length; riga++ )
        {
            for(int colonna = 0; colonna < dued[riga].length; colonna++ )
            {
                System.out.print(dued[riga][colonna]);
            }
            System.out.println(" ");
        }
        
    }
}  