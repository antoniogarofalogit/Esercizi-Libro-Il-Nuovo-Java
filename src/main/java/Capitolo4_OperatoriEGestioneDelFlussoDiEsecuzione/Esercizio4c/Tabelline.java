package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4c;

public class Tabelline {
    public static void main(String args[]){
        System.out.println("Scrivere una semplice classe che stampi a video la tavola pitagorica.\n" +
                "Suggerimento 1: non sono necessari array.\n" +
                "Suggerimento 2: il metodo System.out.println stampa l'argomento che gli viene passato e poi sposta il cursore alla riga successiva; infatti println sta per \"print line\". Esiste anche il metodo System.out.print che invece stampa solamente il parametro passatogli.\n" +
                "Suggerimento 3: sfruttare un doppio ciclo innestato.");
        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= 10; ++j) {
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
        System.out.println("Con questo doppio ciclo innestato ed utilizzando il carattere di escape di tabulazione (\\t), riusciamo a stampare la tavola pitagorica con poche righe di codice.");
    }
}
