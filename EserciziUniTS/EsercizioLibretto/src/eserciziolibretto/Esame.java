package eserciziolibretto;

/**
 *
 * @author zanin
 */
public class Esame {

    public String nomeEsame;
    public int voto;
    public int cfu;
    public final int VOTO_MINIMO = 18;

    public Esame(String riga) {
        String[] dati = riga.split(";");
        nomeEsame = dati[2];
        cfu = Integer.parseInt(dati[1]);
        voto = Integer.parseInt(dati[0]);
    }

    @Override
    public String toString() {
        return " * " + nomeEsame + " - voto: " + voto + " - cfu: " + cfu;
    }

}
