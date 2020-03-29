package test6;
import java.util.Scanner;
public class Test6 {

    public static void main(String[] args) {
        
        System.out.println("digita la tua età");
        Scanner scanner = new Scanner(System.in);
        int età = scanner.nextInt();
        
        System.out.println("maschio o femmina?");
        Scanner scanner2 = new Scanner(System.in);
        String sesso = scanner2.nextLine();
        
        System.out.println("\netà: " + età + "\n" + "sesso: " + sesso);
        
        if (età >= 18 && sesso.equals("maschio"))
        {
            System.out.println("\nbenvenuto nel portale maschi adulti, nome?");
            
            Scanner scanner3 = new Scanner(System.in);
            String nomeM = scanner3.nextLine();
            
            switch (nomeM) //esercizio con switch
            {
                case "Nicola":
                    System.out.println("\nportale risevato ai piani al re supremo di tutto");
                    System.out.println("\nbenvenuto re supremo!");
                    break; //per finire il programma
                    
                case "Mario" :
                case "Francesco":
                    System.out.println("\nportale risevato ai piani alti");
                    
                    if(nomeM.equals("Mario"))
                    {
                       System.out.println("\nbenvenuto capo");
                    }    
                    else
                    {
                        System.out.println("\nbenvenuto vice");
                    }
                    break;
                    
                case "Federico":
                    System.out.println("\nciao Federico");
                    break;
                    
                default:
                    System.out.println("\nnome sbagliato");
                    break;
                    
            }
        }
        
        else if (età >= 18 && !sesso.equals("maschio")) //ho usato la not per esercizio
        {
            System.out.println("\nbenvenuta nel portale femmine adulte, nome?");
            
            Scanner scanner4 = new Scanner(System.in);
            String nomeF = scanner4.nextLine();
            
            boolean ciao = false;
            if (nomeF.equals("Giorgia")) ciao = true; //1 line if statement
            System.out.println(ciao);
        }
        
        else
        {
            System.out.println("\naccesso negato");
        }
        
    }
    
}
/*
    operatori logici e di comparazione

comparazione
== uguale a
!= non uguale a, diverso
>,< maggiore minore di
>=,<= maggiore uguale ecc

logici
&& porta and, tutte e due devono essere vere
|| porta or, almeno una deve essere vera 
! porta not, negazione 
*/ 