package Capitolo1_IntroduzioneAJava.Esercizio1k;

public class Esercizio1k {
    public static void main(String args[]){
        System.out.println("Aggiungere all’interno del metodo main, un blocco di parentesi graffe.");
        System.out.println("Il file viene compilato ed eseguito come se la coppia di parentesi non esistesse. Infatti, è possibile utilizzare coppie di parentesi graffe all’interno dei nostri metodi, magari che circondano altre istruzioni. Per esempio potremmo anche scrivere:\n" +
                "public class HelloWorld {\n" +
                "    public static void main(String args[]) {\n" +
                "      {\n" +
                "          System.out.println(\"Hello World!\");\n" +
                "      }\n" +
                "  }\n" +
                "}\n" +
                "In questo caso, le parentesi sono indubbiamente superflue, ma esistono rari casi in cui la parentesi possono essere utilizzate per isolare dei pezzi di codice, dal resto.\n Per ora dobbiamo solo sapere che le parentesi graffe, se usate in coppia, possono essere utilizzate all’interno dei nostri file sorgente.");
    }
}
