package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3x;

public class Contatto {
    public String nome;

    public String indirizzo;

    public String numeroDiTelefono;

    public Contatto(String nom, String num){
        nome = nom;
        numeroDiTelefono = num;
    }

    public Contatto(String nom, String ind, String num){
        nome = nom;
        indirizzo = ind;
        numeroDiTelefono = num;
    }
    public void stampaDettagli() {
        System.out.println(nome);
        System.out.println(indirizzo);
        System.out.println(numeroDiTelefono);
        System.out.println();
    }
}
