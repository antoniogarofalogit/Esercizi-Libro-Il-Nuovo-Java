package Capitolo1_IntroduzioneAJava.Esercizio1r;

public class Esercizio1r {
    public static void main(String args[]){
        System.out.println("Compilare ed eseguire il seguente programma:\n" +
                "public class HelloWorld {\n" +
                "    public static void main(String args[]) {\n" +
                "      System.out.println(\"\");\n" +
                "  }\n" +
                "}\n" +
                "cosa viene stampato?\n");
        System.out.println("Il programma non stampa niente perché all’istruzione di stampa non viene passato nulla da stampare.\n Si può notare però che il cursore è sceso alla riga successiva, per effetto del fatto che l’istruzione System.out.println va sempre a capo dopo aver stampato (ma anche dopo non aver stampato).\n Infatti println, sta per \"print line\" (in italiano \"stampa riga\").");
    }
}
