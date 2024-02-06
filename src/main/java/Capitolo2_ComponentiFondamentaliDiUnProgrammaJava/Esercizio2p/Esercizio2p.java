package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2p;

public class Esercizio2p {
    public static void main(String args[]){
        System.out.println("Data la seguente classe:\n" +
                "public class Esercizio2P {\n" +
                "  public String stringa;\n" +
                "  public static void main(String argz[]) {\n" +
                "      public int intero = 0;\n" +
                "  }\n" +
                "}\n" +
                "C’è un solo errore in questa classe che ne impedirà la compilazione, quale?\n");
        System.out.println("L’errore è che non si può dichiarare public una variabile locale all’interno di un metodo. Infatti public definisce la visibilità al di fuori della classe di una variabile d’istanza, non al di fuori di un metodo.\n" +
                "Abbiamo definito argz il parametro del main, in luogo dello standard args. Ciò è legale perché si tratta solo del nome di un parametro.");
    }
}
