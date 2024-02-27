package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4f;

public class Esercizio4f {
    public static void main(String args[]){
        System.out.println("È buona norma aggiungere la clausola default ad un costrutto switch. Sapreste spiegare perché?");
        System.out.println("Questo perché non sappiamo a priori come si evolverà il nostro programma, e quindi, anche se nel momento in cui si scrive il programma potrebbe \nnon essere necessario la clausola default, modificando il programma potrebbe nascere una nuova condizione non prevista, creando un baco nella nostra applicazione. \nInfatti il nuovo caso non sarà contemplato e il flusso di esecuzione non entrerà in nessuna clausola del costrutto switch. \nAnche usare il costrutto default solo per stampare una frase \"Caso non previsto\" potrebbe essere una buona abitudine.");
    }
}
