package Capitolo1_IntroduzioneAJava.Esercizioza;

public class Esercizio1aa {
    public static void main(String args[]){
        System.out.println("Creare la classe SommaTreInteri come descritto nel paragrafo 1.5.3.");
        System.out.println("\n" +
                "import java.util.Scanner;\n" +
                "public class SommaTreInteri {\n" +
                "  public static void main(String args[]) {\n" +
                "      System.out.println(\"Ciao, so sommare tre numeri interi.\");\n" +
                "      System.out.println(\"Scrivi il primo valore e premi invio\");\n" +
                "      Scanner keyboardScanner = new Scanner(System.in);\n" +
                "      int operatore1 = keyboardScanner.nextInt();\n" +
                "      System.out.println(\"Scrivi il secondo valore e premi invio\");\n" +
                "      int operatore2 = keyboardScanner.nextInt();\n" +
                "      System.out.println(\"Scrivi il terzo valore e premi invio\");\n" +
                "      int operatore3 = keyboardScanner.nextInt();\n" +
                "      int risultato = operatore1 + operatore2 + operatore3;\n" +
                "      System.out.println(\"Il risultato è:\");\n" +
                "      System.out.println(risultato);\n" +
                "  }\n" +
                "}");
    }
}
