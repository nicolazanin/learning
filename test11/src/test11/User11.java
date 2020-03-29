
package test11;


class User11 {
    
    private String nome;
    private String cognome;
    
    //setter nome
    public void setNome(String sn){
        nome = sn;
    }
    //setter cognome
    public void setCognome(String sn){
        cognome = sn;
    }
    
    //getter nome
    public String getNnome(){
        return nome;
    }
    //getter cognome
    public String getCognome(){
        return cognome;
    }
    
    //getter nome completo
    public String getNomeCompleto(){
        return "Nome completo: " + nome + " " + cognome;
    }
    
    
}
