package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4y;

import java.util.Scanner;

public class GiocoTestaOCroce {
    public static void main(String args[]) {
        System.out.println("Modificare la classe GiocoTestaOCroce creato nell'esercizio precedente, in modo tale che il programma inizialmente permetta di specificare il numero di lanci da fare. Il programma dovrà contare il numero di volte che l'utente ha indovinato il risultato del lancio e il numero di volte che non ha indovinato, e dovrà decidere se l'utente ha vinto la partita oppure no.\n");
        System.out.println(
                "Giochiamo a testa o croce, quanti lanci vuoi fare?");
        Scanner scanner = new Scanner(System.in);
        String numeroLanciString = scanner.nextLine();
        int numeroLanci = Integer.parseInt(numeroLanciString);
        int contatoreLanci = 1;
        var numeroVittorie = 0;
        var numeroSconfitte = 0;
        String messaggio = "";
        System.out.println("Hai scelto di fare "+ numeroLanci +"...iniziamo!");
        while (contatoreLanci <= numeroLanci) {
            System.out.println("Lancio numero " + contatoreLanci);
            System.out.println("Cosa scegli testa o croce?");
            String scelta = scanner.nextLine();
            if ("testa".equals(scelta)) {
                System.out.println("Ok, lancio...");
                TestaOCroce testaOCroce = new TestaOCroce();
                String risultatoLancio = testaOCroce.dammiTestaOCroce();
                contatoreLanci++;
                System.out.print("È uscito "+ risultatoLancio + "...");
                if ("testa".equalsIgnoreCase(risultatoLancio)) {
                    messaggio = "hai vinto!";
                    numeroVittorie++;
                } else {
                    messaggio = "hai perso!";
                    numeroSconfitte++;
                }
            } else if ("croce".equals(scelta)) {
                System.out.println("Ok, lancio...");
                TestaOCroce testaOCroce = new TestaOCroce();
                String risultatoLancio = testaOCroce.dammiTestaOCroce();
                contatoreLanci++;
                System.out.print("È uscito "+ risultatoLancio + "...");
                if ("croce".equalsIgnoreCase(risultatoLancio)) {
                    messaggio = "hai vinto!";
                    numeroVittorie++;
                } else {
                    messaggio = "hai perso!";
                    numeroSconfitte++;
                }
            } else {
                messaggio = "Mi dispiace, puoi scrivere solo testa o croce,"
                        + " riprova...";
            }
            System.out.println(messaggio);
        }
        messaggio = "Hai vinto " + numeroVittorie + " volte, e perso " +
                numeroSconfitte + " volte, quindi...";
        if (numeroVittorie > numeroSconfitte) {
            messaggio += "hai vinto la partita! Complimenti!";
        } else if (numeroVittorie < numeroSconfitte) {
            messaggio += "hai perso la partita! Ah ah!";
        } else {
            messaggio += "hai pareggiato la partita! Riprova!";
        }
        System.out.println(messaggio);
    }
}
