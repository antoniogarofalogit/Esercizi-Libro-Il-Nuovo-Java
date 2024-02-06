package Capitolo1_IntroduzioneAJava.Esercizio1o;

public class Esercizio1o {
    public static void main(String args[]){
        System.out.println("Provare a far stampare un numero al programma HelloWorld al posto della stringa Hello World!.");
        System.out.println("Il listato potrebbe essere simile al seguente:\n" +
                "public class HelloWorld {\n" +
                "    public static void main(String args[]) {\n" +
                "      System.out.println(\"8\");\n" +
                "  }\n" +
                "}\n" +
                "Ma abbiamo stampato il numero come stringa, infatti l’abbiamo rinchiuso tra due virgolette. Potremmo scrivere anche direttamente:\n" +
                "public class HelloWorld {\n" +
                "    public static void main(String args[]) {\n" +
                "      System.out.println(8);\n" +
                "  }\n" +
                "}\n" +
                "Questa volta stiamo stampando un tipo di dato diverso (non ci sono virgolette).");
    }
}
