package Capitolo1_IntroduzioneAJava.Esercizio1f;

public class Esercizio1f {
    public static void main(String args[]){
        System.out.println("Eliminare il modificatore static del metodo main dalla classe HelloWorld. Utilizzando la prompt dei comandi, compilare ed eseguire il programma, e interpretare il messaggio di errore dell’esecuzione.");
        System.out.println("Il listato dovrebbe essere simile al seguente:\n" +
                "public class HelloWorld {\n" +
                "    public void main(String args[]) {\n" +
                "      System.out.println(\"Hello World!\");\n" +
                "  }\n" +
                "}\n" +
                "Il file compila tranquillamente, ma al momento del lancio ci avvertirà che abbiamo definito un metodo main che non è un valido per poter far partire l’applicazione, proprio perché non è stato dichiarato static. A seconda dell’errore, del vostro sistema operativo (o della virtual machine installata), i messaggi del compilatore potrebbero essere in italiano o in inglese. Se il messaggio è in italiano dovrebbe essere il seguente:\n" +
                "Errore: il metodo principale non è static nella classe HelloWorld. \n" +
                "  Definire il metodo principale come:\n" +
                "   public static void main(String[] args)");
    }
}
