package Capitolo1_IntroduzioneAJava.Esercizio1i;

public class Esercizio1i {
    public static void main(String args[]){
        System.out.println("Eliminare il simbolo di ; dalla classe HelloWorld. Utilizzando la prompt dei comandi compilare il programma e interpretare il messaggio di errore.");
        System.out.println("Il listato dovrebbe essere simile al seguente:\n" +
                "public class HelloWorld {\n" +
                "    public static void main(String args[]) {\n" +
                "      System.out.println(\"Hello World!\")\n" +
                "  }\n" +
                "}\n" +
                "Il messaggio di errore del compilatore in inglese è il seguente:\n" +
                "error: ';' expected\n" +
                "        System.out.println(\"Hello World!\")\n" +
                "                                          ^\n" +
                "1 error\n" +
                "Dove il compilatore ci avverte che manca un punto e virgola.");
    }
}
