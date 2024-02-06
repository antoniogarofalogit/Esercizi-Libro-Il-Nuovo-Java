package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2za;

public class TestLibro {
    public static void main(String args[]){
        System.out.println("Creare una classe Libro, che definisce le variabili che si ritiene opportuno, un costruttore che ci permetta di inizializzarle, ed un metodo stampaDettagli, sul modello del metodo definito nella classe Contatto dell’esercizio 2.y. \n Creare anche una classe TestLibro che testa il funzionamento della classe Libro, che istanzia due libri e chiami il metodo stampaDettagli per ognuno di loro. Controllare se la stampa ottenuta è quella desiderata.");
        System.out.println("Nonostante il codice sia abbastanza leggibile ed interpretabile, facciamo prima qualche osservazione sulla classe Libro, per non avere dubbi su quello che abbiamo scritto.\n" +
                "Questa classe definisce tre variabili chiamate titolo, autore e editore. Tali variabili sono definite usando il modificatore public, che come vedremo ci permetterà di utilizzarle anche in altre classi. Le variabili sono dichiarate di tipo String, ovvero possiamo assegnare a queste variabili delle stringhe, ovvero sequenze di caratteri comprese tra virgolette (abbiamo già visto diverse stringhe nei programmi fatti nel capitolo 1).\n" +
                "Queste rappresentano per noi le caratteristiche essenziali per astrarre una classe Libro. Potevamo dichiarare anche la variabile sottotitolo, numeroPagine, prezzo e così via, ma quando si decide di creare una classe, si deve astrarla con le caratteristiche necessarie alla situazione. Siccome la nostra necessità è solo quella di fare un esempio, non abbiamo ritenuto utile aggiungere altre caratteristiche.\n" +
                "Come si può notare, le variabili della classe non hanno dei valori, perché non stiamo definendo un particolare libro.");
        Libro nuovoJava = new Libro("Il nuovo Java", "Claudio De Sio Cesari",
                "Hoepli");
        nuovoJava.stampaDettagli();

        Libro giornoDellaCivetta = new Libro("Il giorno della civetta",
                "Leonardo Sciascia", "Adelphi");
        giornoDellaCivetta.stampaDettagli();
    }
}
