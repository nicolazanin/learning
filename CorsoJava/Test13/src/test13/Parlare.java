
package test13;

// se voglio creare una caratteristica che le mie sottoclassi seguano obbligatoriamente creo un interfaccia
//le classi che implementano "Lavoro" dovranno avere i metodi qua presenti
/*
mi siono accorto che, se faccio implements su user non serve che che lo faccia anche nelle due sottoclassi e devo
comunque aggiungere il metodo ciao alle due sottoclassi, posso farlo solo sulle due sottoclassi e non su User 
ma se avessi bisogno in un for each loop il metodo ciao con user non potrei richiamarlo.
essendo User una classe astratta non ha bisogno di fare override del metodo ciao, le sottoclassi comunque si.

conclusione: se la interfaccia serve alle sottoclassi di user allora implementa su user e override sulle sottoclassi
             se invece serve solo ad alcune implementa direttamente nelle sottoclassi e override su quelle 
*/
public interface Parlare {
   
    void ciao();//funziona come un metodo astratto non deve avere corpo
}
