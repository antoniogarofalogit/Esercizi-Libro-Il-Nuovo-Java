package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2k;

public class TestQuadrilateri {
    public static void main(String args[]) {
        System.out.println("Partendo dalla soluzione dell’esercizio precedente, creare un ulteriore metodo nelle classi Quadrato e Rettangolo, chiamato dammiDettagli, che restituisce la stessa stringa che veniva stampata nel metodo stampaDettagli.\n Dopo averlo creato, fare in modo che il metodo stampaDettagli, sfrutti il metodo dammiDettagli in modo tale da non duplicare il codice. \n Creare una classe chiamata TestQuadrilateri che stampa i dettagli di un quadrato e di un rettangolo.");
        Quadrato quadrato = new Quadrato(5);
        quadrato.stampaDettagli();
        Rettangolo rettangolo = new Rettangolo(5,6);
        rettangolo.stampaDettagli();
    }
}
