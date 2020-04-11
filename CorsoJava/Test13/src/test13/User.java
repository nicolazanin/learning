
package test13;
//con la keyword abstract, non posso nel calling program creare User u = new User(); ma i benefici della classe user restano anche nelle sottoclassi
public abstract class User implements Parlare {
    public String nome;
    public String cognome;
    public boolean verificato = false;
    
    
    public void messaggio(){
        System.out.println("mi chiamo: " + nome + " " + cognome);
    }
    
    public final void messaggioFinal(){//con la keyword final il metodo non può essere sovrascritto nelle sottoclassi
        System.out.println("User: " + nome + cognome);
    }
    
    //un metodo astratto significa che in ogni sottoclasse deve esistere e deve avere il proprio corpo per questo motivo non posso farlo qua
    public abstract void messsaggio1(); 
    
    public enum sesso {maschio, femmina}; //enum permette di scegliere solo tra le possibilità dentro le graffe
    public sesso sesso; //bisogna nominare così
    
    
}
