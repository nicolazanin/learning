//il test7 sarà un test 5 migliorato
package test7;

import java.util.Scanner;


public class Test7 {

    
    public static void main(String[] args) {
        String password = "Lovesofi00";
        Scanner scanner = new Scanner(System.in);
        //definire in anticipo la stringa tentativo
        String tentativo;
        
        do //fai quello dentro le parentesi 
        {
            System.out.println("inserire la pw");
            tentativo = scanner.nextLine();
        }
        while(!tentativo.equals(password)); // fino a che si verifichi questo
                                            // se è vero quello nella parentesi rifà il loop     
                                            
        System.out.println("\npw corretta");
        scanner.close(); //potrebbe creare problemi di memoria se non lo facciamo
    }
    
} 
