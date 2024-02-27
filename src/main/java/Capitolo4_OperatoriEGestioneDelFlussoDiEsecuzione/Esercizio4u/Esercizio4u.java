package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4u;

import java.util.Scanner;

public class Esercizio4u {
    public static void main(String args[]) {
        System.out.println("Dichiarare una classe che utilizza la classe Scanner, che permette all'utente di interagire con la classe CalcolatriceSemplificata: l'utente deve poter scrivere il primo operando, selezionare da una lista l'operazione da eseguire e specificare il secondo operando. Il programma deve restituire il giusto risultato.\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita il primo operando e premi invio:");
        double primoOperando = Double.parseDouble(scanner.nextLine());
        System.out.println(
                "Ora scegli l'operazione da eseguire e premi invio:");
        stampaTabellaOperazioni();
        String operazione = scanner.nextLine();
        System.out.println("Ora scegli il secondo operando e premi invio:");
        double secondoOperando = Double.parseDouble(scanner.nextLine());
        double risultato =
                eseguiOperazione(primoOperando, secondoOperando, operazione);
        System.out.println("Risultato = " + risultato);
    }

    private static double eseguiOperazione(double primoOperando,
                                           double secondoOperando, String operazione) {
        CalcolatriceSemplificata calcolatriceSemplificata =
                new CalcolatriceSemplificata();
        switch (operazione) {
            case "+":
                return calcolatriceSemplificata.somma(
                        primoOperando, secondoOperando);
            case "-":
                return calcolatriceSemplificata.sottrai(
                        primoOperando, secondoOperando);
            case "x":
                return calcolatriceSemplificata.moltiplica(
                        primoOperando, secondoOperando);
            case "d":
                return calcolatriceSemplificata.dividi(
                        primoOperando, secondoOperando);
            case "r":
                return calcolatriceSemplificata.restituisciResto(
                        primoOperando, secondoOperando);
            case "u":
                return calcolatriceSemplificata.massimo(
                        primoOperando, secondoOperando);
            case "m":
                return calcolatriceSemplificata.minimo(
                        primoOperando, secondoOperando);
            default:
                System.out.println("Operazione specificata " + operazione +
                        " non valida");
                System.exit(1);
                return Double.NaN;
        }
    }

    private static void stampaTabellaOperazioni() {
        System.out.println("'+' : somma");
        System.out.println("'-' : sottrai");
        System.out.println("'x' : moltiplica");
        System.out.println("'d' : dividi");
        System.out.println("'r' : restituisci resto della divisione");
        System.out.println("'u' : massimo");
        System.out.println("'m' : minimo");
    }
}
