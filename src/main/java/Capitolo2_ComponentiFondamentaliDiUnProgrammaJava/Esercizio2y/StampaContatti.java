package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2y;

public class StampaContatti {
    public static void main(String args[]){
        System.out.println("Considerando la soluzione dell’esercizio 2.x, creare una classe Rubrica, che contenga i contatti creati nell’esercizio 2.x. Essa deve definire un costruttore senza parametri che istanzi le proprie variabili di istanza. Creare una nuova versione della classe StampaContatti, che abbia sempre lo stesso output. Tale versione non deve istanziare gli oggetti Contatto, ma prenderli dalla classe Rubrica.");
        System.out.println("Elenco Contatti");
        System.out.println();
        Rubrica rubrica = new Rubrica();
        rubrica.contatto1.stampaDettagli();
        rubrica.contatto2.stampaDettagli();
        rubrica.contatto3.stampaDettagli();
    }
}

