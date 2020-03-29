
package test13;


public class Teacher extends User  { //implemento l'intefaccia 
    
    public Teacher(String n, String c){
        //se i campi (fields) del mio oggetto fossero privati(nome e cognome)e non creassi un setter questo sarebbe l'unico modo per settarli
        //se creassi un getter i miei fields sarebbero read only  e settabili solo con un constructor
        nome = n;
        cognome = c;
        System.out.println("nuovo professore creato");
    }

    public String materia;

    @Override
    public void messsaggio1() {
        System.out.println("hello imma teacher ");
        super.messaggio();
    }

    @Override
    public void ciao() { //da interfaccia
        System.out.println("ciao sono un docente ti saluto dall' interfaccia");
    }
    
}
