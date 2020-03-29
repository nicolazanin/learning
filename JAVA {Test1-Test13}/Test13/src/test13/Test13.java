
package test13;

import java.util.ArrayList;
import java.util.List;


public class Test13 {

 
    public static void main(String[] args) {
        
        Student s = new Student(); // default constructor, l'ho modificato nelle due classi ma java lo usa in automatico
        s.nome = "Nicola";     
        s.cognome = "Zanin";
        s.specialita = "programmatore";
        
        //s.messaggio(); // void restituisce un valore, non metto dentro sout
        
        //s.messsaggio1();
        
        Teacher t = new Teacher("Giuseppa","Conta");//custom constructor devo mettere obbigatoriamente due stringhe
        //teoria sui read only fields sotto classe teacher
        t.materia = "matematica";
        
        List<User> users = new ArrayList<User>();
        users.add(t);
        users.add(s);
        
        System.out.println("");
        
        for (User i : users) {
            i.messsaggio1();
            System.out.println();
        }
        /*
        questo for each loop è utile a capire il polimorfismo, perchè per ogni utenente di User stampa 
        il messaggio astratto, che ogni sottoclasse deve sovrascrivere, e  notiamo che per ogni User abbiamo
        il messaggio diverso perchè appartengono a sottoclasssi diverse
        */
        
        System.out.println("");
        
        for (User i : users) {//interfaccia
            i.ciao();
        }
        
        
        System.out.println("---ENUM---");
        s.sesso = s.sesso.maschio;//setto l' enum
        
        switch(s.sesso){ //enum switch permette di variare le casistiche dell' enum
            case maschio:
                System.out.println("buongiorno signore");
                break;
            case femmina:
                System.out.println("buongiorno signora");
                break;
        }
    }
    
}
