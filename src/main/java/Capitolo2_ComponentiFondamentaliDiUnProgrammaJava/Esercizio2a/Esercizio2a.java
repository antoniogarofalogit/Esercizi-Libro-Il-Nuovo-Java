package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2a;

public class Esercizio2a {
    public static void main(String args[]){
        System.out.println("Viene fornita (copiare, salvare e compilare) la seguente classe:\n" +
                "public class NumeroIntero {\n" +
                "    public int numeroIntero;\n" +
                "    public void stampaNumero() {\n" +
                "        System.out.println(numeroIntero);\n" +
                "    }\n" +
                "}\n" +
                "Questa classe definisce il concetto di numero intero come oggetto. In essa vengono dichiarati una variabile intera ed un metodo che stamperà la variabile stessa. Scrivere, compilare ed eseguire una classe che:\n" +
                "1. istanzierà almeno due oggetti dalla classe NumeroIntero (contenente un metodo main);\n" +
                "2. cambierà il valore delle relative variabili e testerà la veridicità delle avvenute assegnazioni, sfruttando il metodo stampaNumero;\n" +
                "3. aggiungerà un costruttore alla classe NumeroIntero che inizializzi la variabile d’istanza.\n" +
                "4. a che tipologia di variabili appartiene la variabile numeroIntero definita nella classe NumeroIntero?\n" +
                "5. Se istanziamo un oggetto della classe NumeroIntero, senza assegnare un nuovo valore alla variabile numeroIntero, quanto varrà quest’ultima?");
    System.out.println("Di seguito viene listata una classe che aderisce ai requisiti richiesti:\n" +
            "public class ClasseRichiesta {\n" +
            "    public static void main (String args []) {\n" +
            "      NumeroIntero uno = new NumeroIntero();\n" +
            "      NumeroIntero due = new NumeroIntero();\n" +
            "      uno.numeroIntero = 1;\n" +
            "      due.numeroIntero = 2;\n" +
            "      uno.stampaNumero();\n" +
            "      due.stampaNumero();\n" +
            "  }\n" +
            "}\n" +
            "Inoltre un costruttore per la classe NumeroIntero potrebbe impostare l’unica variabile d’istanza numeroIntero:\n" +
            "public class NumeroIntero {\n" +
            "    public int numeroIntero;\n" +
            "    public NumeroIntero(int n) {\n" +
            "        numeroIntero = n;\n" +
            "    }\n" +
            "    public void stampaNumero() {\n" +
            "        System.out.println(numeroIntero);\n" +
            "    }\n" +
            "}\n" +
            "In tal caso, però, per istanziare oggetti dalla classe NumeroIntero, non sarà più possibile utilizzare il costruttore di default (che non sarà più inserito dal compilatore).\n Quindi la seguente istruzione produrrebbe un errore in compilazione:\n" +
            "NumeroIntero uno = new NumeroIntero();\n" +
            "Bisogna invece creare oggetti passando al costruttore direttamente il valore della variabile da impostare, per esempio:\n" +
            "NumeroIntero uno = new NumeroIntero(1);\n" +
            "Risposte alle ultime due domande:\n" +
            "4. Trattasi di una variabile d’istanza, perché dichiarata all’interno di una classe, al di fuori di metodi.\n" +
            "5. Il valore sarà zero, ovvero il valore nullo per una variabile intera. Infatti, quando si istanzia un oggetto, le variabili d’istanza vengono inizializzate ai valori nulli se non esplicitamente inizializzate ad altri valori.");
    }
}
