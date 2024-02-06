package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2n;

public class Esercizio2n {
    public static void main(String args[]){
        System.out.println("Data la seguente classe:\n" +
                "public class Esercizio2N {\n" +
                "    public String string;\n" +
                "    public int intero;\n" +
                "    final public String integer = \"inzializzazione\";\n" +
                "}\n" +
                "Quale delle seguenti affermazioni è vera (scegliere una sola affermazione)?\n" +
                "1. Il codice può essere compilato correttamente.\n" +
                "2. Il codice non può essere compilato correttamente perché non è possibile dichiarare una variabile con nome string.\n" +
                "3. Il codice non può essere compilato correttamente perché non è possibile dichiarare una variabile con nome intero.\n" +
                "4. Il codice non può essere compilato correttamente perché non è possibile dichiarare una variabile di tipo String chiamandola integer.\n" +
                "5. Il codice non può essere compilato correttamente perché la variabile con nome integer dichiara i modificatori in ordine inverso (dovrebbe essere prima dichiarata public e poi final).\n");
   System.out.println("La soluzione è la risposta numero 1, ovvero il codice può essere compilato senza errori. Non ci si faccia trarre in inganno dai nomi delle variabili (vedi altre possibili risposte) che potrebbero portare (volontariamente) a fare confusione. Inoltre non è un problema l’ordine in cui sono specificati i modificatori.");
    }
}
