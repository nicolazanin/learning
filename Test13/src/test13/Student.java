
package test13;

//inheritance una sottoclasse che possiede le qualità della classe più le sue, metti extends

//un metodo virtuale possiede la capacità di essere sovrascritto (overridden) in una inheritig class
/*negli altri linguaggi di programmazione dovremmo usare la keyword virtual, in java questo è fatto implicitamente per quasi tutti i metodi
i metodi che non sono virtuali sono, quelli statici(non sono polimorfi) e qurlli privati (possono stare solo in quella classe)
nel test dodici classe User12 ho fatto override di un metodo proveniente dalla callse radice, qui override dalla classe user che ho creato.
*/ 
public final class Student extends User { //extends, //final class classe di cui non si può creare una sottoclasse
    
    public Student(){ //default constructor, non c'è niente dentro le parentesi
        System.out.println("nuovo studente creato");// ho modificato il default constructor in modo tale da dire questo quando si crea un nuovo profilo studente
    }//è simile ad invocare un metodo ma non c'è void o return quindi non restituiscono un valore
    
    public boolean verificato = true;
    public String specialita;
    
    @Override //dobbiamo fare override del metodo che è su user
    public void messaggio(){ //il metodo mantiene il nome 
        System.out.println("mi chiamo: " + nome + " " + cognome + "." + " Specialità: " + specialita + ".");
    }
    
  
    @Override
    public void messsaggio1() {
        System.out.println("hello imma student ");
        //nel caso sopra abbiamo fatto l'override e abbiamo modificato il metodo, ma sevogliamo una versione user del metodo?
        super.messaggio(); //uso la keyword super in modo tale da richiamare il metodo presente nella classe user
    }

    @Override
    public void ciao() { //da interfaccia
        System.out.println("hello, sono uno studente ti saluto dall' interfaccia"); //To change body of generated methods, choose Tools | Templates.
    }
}
