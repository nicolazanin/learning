
package test12;

import it.units.LibreriaFondamenti;
import java.util.ArrayList;
import java.util.List;

public class Test12 {

    public static void main(String[] args) {
        
        User12 nz = new User12();
        nz.setNome("Nicola");
        nz.setCognome("Zanin");
        
        User12 gf = new User12();
        gf.setNome("Giorgia");
        gf.setCognome("Franzoi");
        
        List<User12> utenti = new ArrayList<User12>();
        utenti.add(gf); // index 0
        utenti.add(nz);
        
        User12.stampaNomiC(utenti); 
        
        System.out.println();
        
        //overload
        System.out.println(nz.output());
        System.out.println(nz.output(true));
        System.out.println(nz.output(false));
        
        
        
        System.out.println();
        
        
        
        //cerca nella lista 
        
        String nome = "Nico";
        String cognome = "Zanin";
        System.out.print("il tuo utente ha index: ");
        System.out.println(User12.search(utenti, nome, cognome));//cercare utente metodo inserendo nome e cognome 
        
        
        System.out.println();
        
        System.out.println(nz);//chiamo l' override
        //se non ci fosse questo metodo e mettessi nz.toString() stamperebbe un codice strano difficile da comprendere 
        //con l'override evito questo probleme, potrei usare questo override per un codice personalizzato
        
        System.out.println();
        
        User12 nz1 = new User12();
        nz1.setNome(nome);
        nz1.setCognome(cognome);
        utenti.add(nz1);
        
        System.out.print("i due utenti hanno nome uguale? ");
        System.out.println(nz.equals(nz1));
        System.out.print("i due utenti hanno hashcode uguale? ");
        System.out.println(nz.hashCode() == nz1.hashCode());
        //se non avessi creato un override equals and hashcode quando li comparo mi direbbe che non sono uguali 
        //un hashcode è quando un testo viene conertito in un codice per questo lo comparo con ==
        
        System.out.println("");
        
        System.out.print("il tuo utente ha index: ");
        System.out.println(User12.searchList(utenti, gf));//cercare index utente con il nome dell' oggetto
        
        
        System.out.println("");
        
        User12 cerca = new User12();
        cerca.setNome("Luigi");
        cerca.setCognome("Rossi");
        utenti.add(cerca);
        User12 trovato = User12.findUser(utenti, cerca);
        trovato.setNome("Mario");
        System.out.println(trovato);
        //il metodo findUser trova l'utente, non l'index 
        //in questo caso è stato creato un nuovo utente cerca poi rinominato trovato e imposto uguale a cerca
        //poi modificato il nome e vediamo quando lo si stampa cambia il nome
        
        
        User12.cambiaNome(nz1);
        System.out.println(nz1);
        
    }
    
}
