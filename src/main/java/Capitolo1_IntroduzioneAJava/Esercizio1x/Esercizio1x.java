package Capitolo1_IntroduzioneAJava.Esercizio1x;

public class Esercizio1x {
    public static void main(String args[]){
        System.out.println("Scrivere un programma definito dalla classe StampaContatti che stampi l’elenco di contatti di una rubrica. Ogni contatto dovrà essere stampato su tre righe: nella prima ci sarà il nome del contatto, nella seconda l’indirizzo, e nella terza il numero di telefono. Ogni contatto deve essere separato dal successivo da una riga vuota.");
        System.out.println("Il listato potrebbe essere simile al seguente:\n" +
                "public class StampaContatti {\n" +
                "    public static void main(String args[]) {\n" +
                "      System.out.println(\"Elenco Contatti\");\n" +
                "      System.out.println();\n" +
                "      System.out.println(\"Claudio De Sio Cesari\");\n" +
                "      System.out.println(\"Via Java 15\");\n" +
                "      System.out.println(\"151515151515\");\n" +
                "      System.out.println();\n" +
                "      System.out.println(\"Stevie Wonder\");\n" +
                "      System.out.println(\"Via Musica 10\");\n" +
                "      System.out.println(\"1010101010\");\n" +
                "      System.out.println();\n" +
                "      System.out.println(\"Gennaro Capuozzo\");\n" +
                "      System.out.println(\"Piazza Quattro Giornate 1\");\n" +
                "      System.out.println(\"1111111111\");\n" +
                "  }\n" +
                "}\n" +
                "Notare che per stampare le righe vuote, abbiamo usato il metodo System.out.println senza passare nessun parametro.\n La soluzione sarebbe stata valida anche se avessimo usato una stringa vuota in questo modo: System.out.println(\"\").");
    }
}
