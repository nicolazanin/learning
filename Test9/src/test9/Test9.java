
package test9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test9 {

    public static void main(String[] args) {
        List<Integer> votiN  =  new ArrayList<Integer>(); //creazione nuova lista
        
        votiN.add(23);
        votiN.add(21);
        //voti.clear(); rimuove tutto dalla lista
        votiN.add(0, 18); // aggiunge all' index 0, e scala di uno
        votiN.add(30);
        
        System.out.print("index voto 21: #");
        System.out.println(votiN.indexOf(21));
        
        if (votiN.contains(30))
        {
            System.out.println("trenta");
        }
        
        System.out.println(votiN.isEmpty()); //chiediamo se è vuota o meno
        
        List<Integer> votiF  =  Arrays.asList(20,21,19); 
        //System.out.println(Arrays.toString(votiF)) l'idea è questa ma da errore perchè votiF è una lista 
        System.out.println(Arrays.toString(votiF.toArray())); // convertito votiF in un array
        
        System.out.println("---------------------------------");

        System.out.println("size votiF: " + votiF.size());
        
        
        for(int i = 0; i < votiF.size(); i++ ) //nb funziona senza minore uguale perchè parte da 0 
        {
            votiF.set(i, votiF.get(i)*2); //.get prende il valore con index i, poi viene moltiplicato per due
            System.out.println(votiF.get(i)); //poi stampo ogni voto
        }
        System.out.println(Arrays.toString(votiF.toArray()));
        
        System.out.println("---------------------------------");
        
        for(int voto : votiF) //metodo velocissimo per stampare una lista, for each loop
        {
            System.out.println(voto);
        }
        
        System.out.println("---------------------------------");
        
        List<List<Integer>> tuttiVoti = new ArrayList<List<Integer>>(); //quando bisigna creare una lista in 2d 
        tuttiVoti.add(Arrays.asList(5, 3, 6, 9)); //tostino da ricordare
        tuttiVoti.add(Arrays.asList(1, 32, 16, 1));//ricordare che quello è un array e lo vogliamo aggiungere come list
        tuttiVoti.add(Arrays.asList(18, 8, 30, 2));
        
        for (List<Integer> votobis : tuttiVoti)// la classe è List<Integer> non solo int come prima
        {
            for(int voto2 : votobis)//senza questo stampava array
            {
            System.out.print(voto2 + " ");
            }
            System.out.println(" ");
        }
        
        System.out.println("---------------------------------");
        
        //convertire la lista in un array
        List<Integer> votiG  =  Arrays.asList(20,21,19);
        int[] votiG2 = new int[votiG.size()]; //impostato un array con la stessa grandezza della lista
        
        for(int i = 0; i < votiG.size(); i++)
        {
           votiG2[i] = votiG.get(i);
        }
        
        System.out.println(Arrays.toString(votiG2));//vediamo che stampa un array come volevamo
        
        System.out.println("---------------------------------");
        
        Collections.sort(votiG); //ordina crescente
        for(int votog : votiG)//senza questo stampava array
            {
            System.out.println(votog + " "); //risultato contrario è reverse
            }
        //nb che Collections.sort(votiG); è una funzione void
        
        System.out.println("---------------------------------");
        
        
    }
    
}
