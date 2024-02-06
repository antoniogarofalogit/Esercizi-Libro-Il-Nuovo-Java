package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2j;

public class Test {
    public static void main(String args[]){
        System.out.println("Aggiungere alle classi Quadrato e Rettangolo create negli esercizi precedenti, un metodo chiamato stampaDettagli, che stampa i dettagli della figura geometrica in questione, compresi perimetro e area. Creare anche una nuova versione delle classi TestQuadrato e TestRettangolo che richiamino direttamente i metodi stampaDettagli sugli oggetti istanziati.");
        Quadrato quadrato = new Quadrato(5);
        quadrato.stampaDettagli();
        Rettangolo rettangolo1 = new Rettangolo(5,6);
        Rettangolo rettangolo2 = new Rettangolo(8,9);
        rettangolo1.stampaDettagli();
        rettangolo2.stampaDettagli();
    }
}
