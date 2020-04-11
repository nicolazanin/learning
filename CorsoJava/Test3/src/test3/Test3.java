/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

import java.util.Arrays;

/**
 *
 * @author zanin
 */
public class Test3 {



    public static void main(String[] args) {
        
       boolean bool = true; //solo vero o falso
       byte b = 'C'; //praticamente contiene il valore in binario della lettera C nella tabella ascii
       char c = 'Z'; // valore in binario di Z nella unicode
       short s = 389; // boh numeri strani se hai bisogno cerca 
       int i = 6546546; //fino ad un to numero
       long l = 87987987897987L; // metti la L se il numero è più grande del limite di int
       // questi erano tutti gli intigers forse interi in italiano
       float f = 23.6f; //32 bit
       double d = 23.6; //guess what 64 bit
       // numeri con virgola
       
       
        //proprietà dei numeri infinito e NaN
        System.out.println(Double.POSITIVE_INFINITY); //proprietà infinito
        System.out.println(Math.sqrt(-1)); //NaN not a number
        boolean bool1 = (Double.isNaN(Math.sqrt(-1))); // chiedo se è NaN e mi dice true c'è anche per finito infinito
        System.out.print(bool1 + "\n");
        System.out.println(Math.pow(99999, 999999)); //
        
        int r = 5;
        r++;      // aggiunge 1
        System.out.println(r);
        r--;      // toglie 1
        System.out.println(r);
        r += 100; // aggiunge 100, posso mettere anche /,-,*
        System.out.println(r);
        
        int x = 23;
        int y = 24;
        System.out.println(Integer.max(x, y)); //max 24 ovv
        System.out.println(Integer.compare(x, y)); // -1 se  x è più grande di y, 1 viceversa,0 se sonouguali
        
        String soldi = "1000";
        Integer S = Integer.valueOf(soldi); //se lavoro con oggetti,contengo il valore della stringa in S
        System.out.println(S);
        int SS = Integer.parseInt(soldi); //se lavoro con primitive,"                                 " SS
        System.out.println(SS);
        // ho fatto tutto con integers ma lo posso fare anche con double  
        
        String frase = "pro gram";
        String frase1 = "pro gram pro molto molto ";
        
        System.out.println(frase.charAt(0));
        System.out.println(frase.charAt(1));
        System.out.println(frase.charAt(2));
        System.out.println(frase.charAt(3)); 
        System.out.println(frase.charAt(4));
        System.out.println(frase.charAt(5));
        System.out.println(frase.charAt(6));
        System.out.println(frase.charAt(7));
        // .charAt prende il valore che noi contrassegnamo con un numero
        
        System.out.println(String.format("sono un %s, lo sapevi?", frase)); //praticamente mette al posto del %s la tua stringa
        System.out.println(frase.length()); //lunghezza della stringa in lettere
        
        System.out.println(frase.contains("pro")); //chiediamo al compilatore se contiene una certa parola
        System.out.println(frase.indexOf("pro")); //chiediamo dove si trova o a che index si trova la parola pro
        System.out.println(frase1.indexOf("pro", 3)); // chiedo l'index di pro dopo il terzo index, esclude il primo
        System.out.println(frase1.indexOf("pro", frase.indexOf("pro")+1 )); // trovo index di pro escludendo il primo
        System.out.println(frase1.lastIndexOf("pro")); //chiedo l'index dell' ultimo pro
        
        String frase2 = frase1.toUpperCase(); // metodo per scrivere tutto in caps
        
        System.out.println(frase2);
        System.out.println(frase2.toLowerCase()); //metodo inverso
        //System.out.println(frase1.strip()); dovrebbe togliere gli spazi all' inizio e alla fine but...
        System.out.println(frase2.substring(0,4)); // prendo gli index inizio e fine e stampo quello, inizio incluso fine escluso
        System.out.println(frase.equals("pro gram")); //posso confrontare la frase conquello scritto tra parentesi mi darà vero o falso
        System.out.println(frase.equals("program ")); //tipo verificare se la pw è giusta o no
        
        
       Classet3 nuovafrase = new Classet3();
       nuovafrase.frase1Classet3 = "prova prova ";
       nuovafrase.frase2Classet3 = "sa sa";
       System.out.println(nuovafrase.fraseClasset3());
       //ho creato una nuova classe pubblica facendo tastto destro su test3
       //sull' altra classe unisce le due frasi usando return
       
       int z = 10;
       int zz = 10;
       System.out.println(z == zz);//comparare ma si usa praticamente solo con i numeri ep18
       
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
       
       //test 5,6 per if else switch porte logiche ecc
       
       //while loop "brutale", ripete il codice dentro le graffe finchè wè minore di 4
       int w = 0;
       
       while (w < 4) //se quello dentro la parentesi è vero lo rifà
       {
           System.out.println(w);
           w++;
           //stampa w e lo maggiora di uno
       }
        
       //test7 do while loop
       
       System.out.println(" ");
       //for loop 
       for(int ww = 0; ww < 4; ww++) //le tre fasi del loop: inizializzazione, confronto, e modifica
       {
         System.out.println(ww);
         if (ww == 0)
         {
           System.out.println("start");
         }
       }
       
       
       //esercizio mezzapiramide rovescia
       
       for(int k = 5; k >= 0; k--)
       {
           for(int kk = k; kk >= 0; kk-- )
           {
              System.out.print("*" + " "); 
           }
         System.out.println();  
       }
       
       //con while
       
        int j = 5;
        
        while(j >= 0)
        {
            int jj = j;
            
            while (jj >= 0)
            {
                System.out.print("* ");
                jj--;
            }
            
            System.out.println();
            j--;
        }
        
       
       // da internet piramide 
      
       int rows = 5, k = 0;
       
        for(int ii = 1; ii <= rows; ++ii, k = 0) {
            for(int space = 1; space <= rows - ii; ++space) 
            {
                System.out.print("  ");
            }

            while(k != 2 * ii - 1) //se questa condizione è falsa non stampa ii
            {
                System.out.print("*" + " ");
                ++k;
            }

            System.out.println();
        }
        
        // da internet piramide rovesciata
        
        int rows2 = 5;

        for(int ii = rows2; ii >= 1; --ii) {
            for(int space = 1; space <= rows2 - ii; ++space) {
                System.out.print("  ");
            }

            for(int j2=ii; j2 <= 2 * ii - 1; ++j2) {
                System.out.print("* ");
            }

            for(int j2 = 0; j2 < ii - 1; ++j2) {
                System.out.print("* ");
            }

            System.out.println();
        }
        
        /* quando definisco una variabile per esempio int
         per esempio
        {
        int pizza = 5;---pizza è definita da qua 
          {
             int kebab = 9;--kebab da qua        
             codice ecc    
          }--kebab fino a qua
       
        }---pizza fino a qua, quindi qua posso dfinire nuovamente kebab
        */
        
        
        // la parola break solitamente usata in un ifstatement ovvero se si verifica la condizione dell'if si "ferma
        
        int j1 = 5;
        
        while(j1 >= 0)
        {
            int jj = j1;
            
            while (jj >= 0)
            {
                System.out.print("* ");
                jj--;
                if (jj == 2)
                {
                    break; 
                }
            }
            
            System.out.println();
            j1--;
        }
        
        // continue skippa il caso k1=2
        
        for(int k1 = 5; k1 >= 0; k1--)
       {
           for(int kk = k1; kk >= 0; kk-- )
           {
               if (kk == 2)
               {
                   continue;
               }
              System.out.print(kk + " "); 
           }
         System.out.println();  
       }
        
        System.out.println(" ");
        
        
        // lezione sugli arrays!
        /* 
           quando bisogna creare tante variabili e bisogna tenerne traccia di tutte si creano gli arrays 
           int [] così si indica l' array
        
           int [] grades = new int[10] così diciamo che ha 10 elementi(parte da 0, per chiamarli si fa
           grades[9] prende il decimo elemento
           grades.length ci dice quanti elementi possiede il nostro array
        */
       
        int[] mediaanno = new int[5];
        mediaanno[1] = 8;
        
        System.out.println(mediaanno[1]); //primo modo si definisce e poi si danno i valori
        
        
        int[] mediac = {7, 9, 8, 10, 3};
        
        System.out.println(mediac[1]); //secondo si danno i valori subito
        
        System.out.println(Arrays.toString(mediac)); 
        
        // esistono anche degli arrays of arrays tipo sottinsioemi
        // così si stampano con deepTo...
        int[][] mediamate = {{7, 9}, {8, 10, 3}};
        System.out.println(Arrays.deepToString(mediamate));
        
        //Test8 Arrays
        //Test9 List 
    }
}
  