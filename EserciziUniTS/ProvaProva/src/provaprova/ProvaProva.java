
package provaprova;

import it.units.LibreriaFondamenti;

/**
 *
 * @author zanin
 */
public class ProvaProva {


    public static void main(String[] args) {
        
        LibreriaFondamenti.mostraFinestra();
        
        for (int i = 0; i < 500; i++) {
            LibreriaFondamenti.accendiPunto(LibreriaFondamenti.generaNumeroCasuale(95),LibreriaFondamenti.generaNumeroCasuale(95));
        }

        LibreriaFondamenti.aggiornaDisegno();
    }

}
