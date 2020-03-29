
package test10;

import java.util.ArrayList;
import java.util.List;

public class Test10 {
     //i fields sono le caratteristiche dei nostri oggetti e vengono creati qua
    //public è il livello dove l'accesso è aperto, questo per un public field
    //per un private field accedere ad esso è diverso esistono getter e setter
    // getter per prendere l'info e setter per settarla
    // il private quindi ci permette di avere piu' controllo al nostro field
    
    public static void main(String[] args) {
     //programmare ad oggetti significa creare una classe e dalla classe abbiamo gli oggetti
     //creare un oggetto significa creare un custom type, una variabile personalizzata
     //la classe è come la struttura dei nostri oggetti
     
     //creare una nuova classe cliccare test10 la cartella new class
     User nz = new User();
     nz.nome = "Nicola";
     nz.cognome = "Zanin";
     //nz.soprannome = "zaaan"; da errore perchè è privata le robe sopra vanno bene se pubbliche
     
     //nz.nomecompleto(); //stampa il nome completo, lo invochiamo
     
     String messaggio = nz.nomecompleto(); //gestiamo la stringa
     System.out.println(messaggio);
     
     
     //encapsulation, useremo i getter e setter per poter interagire con la variabile nella classe
     // creiamo il metodo getter e setter sulla classe user
     
     nz.setSoprannome("Zanna");//così si usa setter
     System.out.println("soprannome: " + nz.getSoprannome());//cosi si richiama il getter
     System.out.println("nome soprannome: " + nz.getNomeSoprannome());
     
     
     //liste in un custom type
     List<User> utenti = new ArrayList<User>();
    }
    
}
