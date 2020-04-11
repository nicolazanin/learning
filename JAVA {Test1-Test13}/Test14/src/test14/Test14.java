
package test14;

/**
 *
 * @author zanin
 */
public class Test14 {
    
    int a;
    int b;
    
    public void setNumeri(int a, int b){
        a = a;      //sono entrambi rossi java fa confusione e non capisce a che variabile riferirsi
        this.a = a; //netbeans con i colori ci fa capire come funziona la keyword this
        this.b = b; //con this. ci riferiamo alla variabile che abbiamo definito prima, non dentro al metodo
                    //si potrebbe risolvere chiamandole in modo diverso, inoltre this funziona solo con i metodi NON statici
    }

    public static void main(String[] args) {
        
        Test14 t = new Test14();
        t.setNumeri(2, 3);
        System.out.println(t.a);
        System.out.println(t.b);
        
        //keyword finally try e catch
        try { //prova il codice 
            int a = 5/0;
        } catch (Exception e) { //se accade l'exeption la stampa(incluso)
            System.out.println(e);
        } finally {
            System.out.println("SCRIVE SEMPRE QUESTA FRASE"); 
            //può essere usato per chiudere un codice ed evitare nonostante un errore
        }
            
        // contaIndietro(5);
        contaIndietro(6);
    }
    
    //recursive method
    public static void contaIndietro(int n){
        if (n == 0) {
            System.out.println("FINE!");
        }else{
            System.out.println(n);
            n--;
            contaIndietro(n); 
            //riscrivo il metodo dentro il metodo è come se lo rifacesse ma con il numero aggiornato
        }
    }
    
}
