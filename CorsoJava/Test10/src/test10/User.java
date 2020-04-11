
package test10;


class User {
    public String nome;
    public String cognome;
    
    //creo un metodo
    /*
    public void nomecompleto(int volte){ //loop per stampare piu volte da tastiera
        for(int i = 0; i < volte; i++){
        System.out.println(nome +" "+ cognome);
        }
    }
    */
    public String nomecompleto(){ // se il metodo fosse void non ritorna un valore come fa adesso ma finisce il metodo
        return "nome: " + nome +" "+ cognome; // meglio così perche possiamo gestire la striga e stamparla quando vogliamo
    }
    
    
    private String soprannome; //lo possiamo fare privato, verrà accesso da getter e setter
    
    //getter
    public String getSoprannome(){
        return soprannome;
    }
    //setter
    public void setSoprannome(String sn){
        soprannome = sn;
    }
    
    public String getNomeSoprannome(){
        return nome + soprannome.toUpperCase();
    }
    
    /*
    commentiamo quamto sta accadendo nei nostri getter e setter possiamo crearne altri e
    modificarli a nostro piacimento e poi in base allaìe esigenze usare uno pittosto che 
    un altro, per esempio un numero di telefono potremmo doverlo usare con tutte le cifre
    attaccate ma leggerlo con della spaziatura, creando metodi diversi si può fare e usare
    quello che ci serve
    */
}
