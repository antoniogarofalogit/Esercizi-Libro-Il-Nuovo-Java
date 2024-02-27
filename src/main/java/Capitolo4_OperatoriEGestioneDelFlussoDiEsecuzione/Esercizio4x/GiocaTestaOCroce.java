package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4x;

import java.util.Scanner;

public class GiocaTestaOCroce {
    public static void main(String args[]) {
        System.out.println("Utilizzando la classe TestaOCroce definita nella soluzione dell'esercizio 4.l, creare una classe chiamata GiocoTestaOCroce, che simuli il lancio di una moneta, e che permetta all'utente di indovinare se uscirà \"Testa\" o \"Croce\". Il programma dovrà stampare un messaggio finale che stabilisca che se l'utente ha vinto (ovvero ha indovinato) oppure no.\n");
        System.out.println("Cosa scegli testa o croce?");
        Scanner scanner = new Scanner(System.in);
        String scelta = scanner.nextLine();
        if ("testa".equals(scelta)) {
            System.out.println("Ok, lancio...");
            TestaOCroce testaOCroce = new TestaOCroce();
            String risultatoLancio = testaOCroce.dammiTestaOCroce();
            System.out.print("È uscito " +  risultatoLancio + "...");
            System.out.println("testa".equalsIgnoreCase(risultatoLancio) ?
                    "hai vinto!" : "hai perso!");
        } else if ("croce".equals(scelta)) {
            System.out.println("Ok, lancio...");
            TestaOCroce testaOCroce = new TestaOCroce();
            String risultatoLancio = testaOCroce.dammiTestaOCroce();
            System.out.print("È uscito " +  risultatoLancio + "...");
            System.out.println("croce".equalsIgnoreCase(risultatoLancio) ?
                    "hai vinto!" : "hai perso!");
        } else {
            System.out.println(
                    "Mi dispiace, puoi scrivere solo testa o croce, riprova...");
            System.out.println("Programmata terminato... ciao!");
        }
    }
}
