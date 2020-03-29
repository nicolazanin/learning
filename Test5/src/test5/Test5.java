
package test5;
import java.util.Scanner;
public class Test5 {

    public static void main(String[] args) {
        
        System.out.println("inserisci la password");
        String password = "Lovesofi00";
        
          Scanner scanner = new Scanner(System.in);
          String pwd = scanner.nextLine();
       
        System.out.println(password.equals(pwd));
        
        
       if (password.equals(pwd))
        {
        System.out.println("La password è corretta");
        }
       else if ("lll".equals(pwd))
        {
         System.out.println("riprovare");
        }
       else
        {
        System.out.println("pw non corretta");
        }
   
    }
    
}
// esercizio else if elseif
// aggiornamento dal futuro, questo lo faremo meglio con il loop while 