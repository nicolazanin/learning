
package test11;

import java.util.ArrayList;
import java.util.List;


public class Test11 {

  
    public static void main(String[] args) {
  
    String[] nome = {"Nicola", "Giorgia"};
    String[] cognome = {"Zanin", "Franzoi"};
   
    List <User11> utenti = new ArrayList<User11>();
    
    for (int i = 0; i < nome.length; i++) {
        User11 u = new User11();
        u.setNome(nome [i]);
        u.setCognome(cognome [i]);
        utenti.add(u);
    }
    
    Test11 test = new Test11();
    
    for (int i = 0; i < nome.length; i++) {
        test.stampaUtente(utenti.get(i));    
    }
    
    //all' interno del metodo main ho tutto l'algoritmo per aggiungere utenti
  }
    public void stampaUtente(User11 u){
        System.out.println(u.getNomeCompleto()); // questo è un metodo non statico, si nota perchè c'è il momeIstanza.nomeMetodo
                                                 // un metodo statico si distingue da nomeClasse.nome metodo
       //qua c'è  un altro metodo che stampa
    }
}


/*
    un metodo non statico è associato all' istanza di una classe(oggetto), l'insieme di variabili a cui possono accedere 
    è relativo all' istanza stessa, ovvero possono accedere e modificare le variabili dell' istanza e modificarne lo stato

    un metodo statico invece è associato alla classe, quindi non potranno interagire con le variabili di istanza
    ma solamente con quelle statiche

    vedrò tutto questo nel Test12
*/