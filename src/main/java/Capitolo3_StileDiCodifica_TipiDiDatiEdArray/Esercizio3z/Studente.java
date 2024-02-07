package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3z;

public class Studente {
    public String nome;
    public String cognome;
    public String classe;
    public Studente(String n, String c, String cl){
        nome = n;
        cognome = c;
        classe = cl;
    }
    public String toString(){
        return "Studente: " + nome + " " + cognome + " Classe: " + classe;
    }
}
