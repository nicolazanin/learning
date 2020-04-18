
package itegrali;

import it.units.LibreriaFondamenti;

/**
 *
 * @author zanin
 */
public class Itegrali {


    public static void main(String[] args) {
        
        String coordinateImput = LibreriaFondamenti.caricaStringaDaFile("coordinate.txt");
        String righe [] = coordinateImput.split("\n");
        
        int from;
        int to;
        System.out.println(calcoloIntegrale(righe, 0, 20));
        
    }
   
    public static double calcoloIntegrale (String righe[], int from, int to){
        int coordinate [][] = new int [2][righe.length];
        
        for (int i = 0; i < righe.length; i++) {
            String xy [] = righe[i].split(";");
            for (int j = 0; j < xy.length; j++) {
                if (j == 0) {
                    coordinate[0][i] = Integer.parseInt(xy[0]); //valori di x
                }
                else{
                    coordinate[1][i] = Integer.parseInt(xy[1]); //valori di y
                }
            }
        }
        
        double area = 0;
        int max = 0;
        int min = 0;

        for (int i = 1; i < righe.length; i++) {
           
            int b1 = coordinate[1][i];
            int b2 = coordinate[1][i-1];
            int h = coordinate[0][i]-coordinate[0][i-1];
            
            if (coordinate[0][i-1] >= from && coordinate[0][i] <= to) {
                area = area + (b1 + b2) *(double) h / 2;
                        
            }
            
        }
        
        return area;
    }
    
}
