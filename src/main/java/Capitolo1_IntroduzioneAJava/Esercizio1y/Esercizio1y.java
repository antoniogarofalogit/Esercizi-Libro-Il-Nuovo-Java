package Capitolo1_IntroduzioneAJava.Esercizio1y;

public class Esercizio1y {
    public static void main(String args[]){
        System.out.println("Creare una classe chiamata StampaClasseRigaVuota che stampi il seguente output:\n" +
                "public class RigaVuota {\n" +
                "    public static void main(String args[]) {\n" +
                "          System.out.println();\n" +
                "      }\n" +
                "  }\n");
        System.out.println("Il listato dovrebbe essere simile al seguente:\n" +
                "public class StampaClasseRigaVuota {\n" +
                "    public static void main(String args[]) {\n" +
                "      System.out.println(\"public class RigaVuota {\");\n" +
                "      System.out.println(\"    public static void main(String args[]) {\");\n" +
                "      System.out.println(\"        System.out.println();\");\n" +
                "      System.out.println(\"    }\");\n" +
                "      System.out.println(\"}\");\n" +
                "  }\n" +
                "}\n" +
                "Notare che non abbiamo fatto stampare nulla al metodo System.out.println, perché altrimenti avremmo avuto problemi con le virgolette. Infatti, se avessimo scritto:\n" +
                "        System.out.println(\"        System.out.println(\"\");\");\n" +
                "avremmo ottenuto il seguente errore:\n" +
                "StampaClasseRigaVuota.java:5: error: ')' expected\n" +
                "        System.out.println(\"        System.out.println(\"\");\");\n" +
                "                                                        ^\n" +
                "1 error\n" +
                "Questo perché il compilatore non può capire che la seconda virgoletta che incontra deve essere considerata una virgoletta da stampare e non una virgoletta che chiude una stringa. La seconda virgoletta quindi, viene considerata la virgoletta di chiusura della stringa:\n" +
                "        System.out.println(\"        System.out.println(\"\");\");\n" +
                "Quindi la successiva virgoletta non viene accettata, perché il compilatore si aspetta che venga chiusa la parentesi del metodo println.");
    }
}
