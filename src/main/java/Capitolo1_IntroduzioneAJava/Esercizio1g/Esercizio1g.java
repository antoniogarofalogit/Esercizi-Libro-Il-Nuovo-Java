package Capitolo1_IntroduzioneAJava.Esercizio1g;

public class Esercizio1g {
    public static void main(String args[]){
        System.out.println("Il listato dovrebbe essere simile al seguente:\n" +
                "public class HelloWorld\n" +
                "    public static void main(String args[]) {\n" +
                "      System.out.println(\"Hello World!\");\n" +
                "  }\n" +
                "}\n" +
                "Il messaggio di errore del compilatore (questa volta in inglese, ma di facile comprensione) è il seguente:\n" +
                "error: '{' expected\n" +
                "public class HelloWorld \n" +
                "                       ^\n" +
                "1 error");
    }
}
