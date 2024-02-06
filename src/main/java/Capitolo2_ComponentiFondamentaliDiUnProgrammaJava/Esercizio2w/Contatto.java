package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2w;

public class Contatto {
    public String nome;

    public String indirizzo;

    public String numeroDiTelefono;

    public Contatto (String nom, String num){
        nome = nom;
        numeroDiTelefono = num;
    }

    public Contatto (String nom, String ind, String num){
        nome = nom;
        indirizzo = ind;
        numeroDiTelefono = num;
    }
    /* Notare che abbiamo deciso di definire due costruttori, uno che prende in input i valori delle tre variabili, a l’altro che fa a meno dell’indirizzo. Non abbiamo introdotto altri costruttori visto che reputiamo inutile che un contatto sia creato senza specificare almeno un nome e il numero di telefono. */
}
