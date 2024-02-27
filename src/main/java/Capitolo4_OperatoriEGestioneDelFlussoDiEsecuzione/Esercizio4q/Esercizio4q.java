package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4q;

import java.util.Scanner;

public class Esercizio4q {
    public static void main(String args[]) {
        System.out.println("Si scriva un programma che chieda all'utente di inserire il numero di giorni passati dall'ultima vacanza fatta. Una volta inserito questo numero, il programma dovrà rispondere quanti minuti sono passati dall'ultima vacanza.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita il numero di giorni passati dall'ultima vacanza");
        int giorni = scanner.nextInt();
        System.out.println("Hai digitato " + giorni + " giorni!");
        int ore = giorni*24;
        int minuti = ore*60;
        System.out.println("Quindi sono passati " + minuti + " minuti!");
    }
}
