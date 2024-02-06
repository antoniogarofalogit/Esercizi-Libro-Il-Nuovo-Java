package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2zb;

public class CalcolaPerimetroQuadrato {
    public static void main(String args[]){
        System.out.println("Creare una classe CalcolaPerimetroQuadrato, che calcola il perimetro di un quadrato che abbia come lunghezza del lato il valore 17, e ne stampi il risultato. Usare questa volta solo una classe con metodo main, che dichiari delle variabili in maniera leggibile.\n" +
                "È possibile anche settare il valore del lato tramite un oggetto Scanner come fatto negli esempi del capitolo 1.\n");
        int lunghezzaLatoQuadrato = 17;
        int numeroLati = 4;
        int perimetroQuadrato = lunghezzaLatoQuadrato * numeroLati;
        System.out.println("Il perimetro del quadrato è:");
        System.out.println(perimetroQuadrato);
        System.out.println("L’output sarà:\n" +
                "Il perimetro del quadrato è:\n" +
                "  68 \n" +
                "Questa classe calcola il perimetro di un quadrato facendo uso di tre variabili di tipo int. \n In particolare, possiamo notare come alla variabile perimetroQuadrato venga assegnato il valore calcolato dalla moltiplicazione del valore della variabile lunghezzaLatoQuadrato e il valore della variabile numeroLati. Notare che le variabili hanno aggiunto leggibilità al codice.");
    }
}
