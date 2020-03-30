
package test12;

import java.util.List;
import java.util.Objects;

public class User12 {

   
    private String nome;
    private String cognome;
    
     //setter nome
    public void setNome(String sn){
        nome = sn;
    }
    //setter cognome
    public void setCognome(String sc){
        cognome = sc;
    }
    //getter nome completo
    public String getNomeCompleto(){
        return "Nome completo: " + nome + " " + cognome;
    }
    //getter nome c
    public String getNomeC(){
        return  nome + " " + cognome;
    }
    
    //metodo statico
    public static void stampaNomiC (List<User12> utenti){
        
        for (User12 u : utenti) {
            System.out.println(u.getNomeCompleto());
        }
    }
    /*
    sopra c'è un metodo con public static void e sotto un metodo con public string (anche int e che dir si voglia)la differenza tra i due è che :
    in quello con void non si usa la keyword return, con void il metodo ritornaun valore se richiamato nel calling program, sopra per esempio
    stampa quello che viene indicato sopra.
    nel metodo sotto invece il metodo ritorna una stringa per stampare questa bisogna "metterla" denro un sout.
    sotto è spiegato anche come funziona l' overload.
    */
    
    //overload che ci consente di “sovraccaricare” un metodo di una classe con diverse varianti, in base ai parametri passati come riferimento.
    public String output(){
        return "se non metti ne true o false succede questo, " + nome ;
    }
    
    public String output(boolean vero){
        if(vero){
            return "compare se inserisci true tra parentesi, " + nome;
        }
        else{
            return "questo se metti false, " + nome;
        }
    }
    
    //overriding scrivi to premi ctrl + spazio
    /*
    Nella programmazione ad oggetti override è l'operazione di riscrittura di un metodo ereditato!!!!!!
    Nella programmazione ad oggetti assume notevole importanza la possibilità di creare classi a partire da classi già esistenti (ereditarietà).
    La classe nuova che eredita quella esistente può avere metodi ereditati che possono essere riscritti per le nuove necessità.
    */
    @Override//The java.lang.Object class is the root of the class hierarchy,  ho fatto iloverride da questa classe
    public String toString() {
        return "User: " + getNomeC().toUpperCase();//questo potrei usarlo per creare un codice identificativo dell' oggetto, ora stampo solo il nome
    }
    
    //tasto destro e insert code
    //hashcode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.cognome);
        return hash;
    }
    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User12 other = (User12) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        return true;
    }
    
    
    //metodo pe confrontare la string nome e cognome (che posso ottenere da imput) con le stringhe nella lista utenti
    public static int search (List<User12> utenti, String nome, String cognome){
         for (int i = 0; i < utenti.size(); i++) { 
            if(utenti.get(i).getNomeC().equals(nome + " " + cognome)){
                return i;
            }
        }
        return -1;
    }
    
    
    //metodo per cercare utente dal nome dell' oggetto utente
    public static int searchList (List<User12> utenti, User12 u){
        //return search (utenti, u.getNomeC());
        for (int i = 0; i < utenti.size(); i++) { 
            if(utenti.get(i).getNomeC().equals(u.getNomeC())){
                return i;
            }
        }
        return -1;
    }
    
    //metodo per cercare utente e non il suo index
    public static User12 findUser (List<User12> utenti, User12 u){
        for (User12 utente : utenti) {
            if(utente.equals(u))
                return utente;
        }
        return null;
    }
    
    
    public static void cambiaNome (User12 x){
        x.setNome("nome cambiato");
    }
     
}
