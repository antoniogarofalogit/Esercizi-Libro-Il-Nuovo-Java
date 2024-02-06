package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2u;

public class Esercizio2u {
    public static void main(String args[]){
        System.out.println("Data la seguente classe:\n" +
                "public class Esercizio2u {\n" +
                "    int c = 3;\n" +
                "    public static void main(String args[]) {\n" +
                "        int a = 1;\n" +
                "        int b = 2, c, d = 4;\n" +
                "        System.out.println(a+b+c+d);\n" +
                "    }\n" +
                "}\n" +
                "Una volta eseguito, cosa stamperà questo programma?\n" +
                "1. Questo programma non compila.\n" +
                "2. Stamperà \"10\".\n" +
                "3. Stamperà: \"7\".\n" +
                "4. Stamperà: \"0\".\n");
        System.out.println("La risposta corretta è la 1. Infatti la variabile locale c non è stata inizializzata e provocherà quest’errore:\n" +
                "Esercizio2U.java:6: error: variable c might not have been initialized\n" +
                "        System.out.println(a+b+c+d);\n" +
                "                               ^\n" +
                "1 error\n" +
                "Come asserito in questo capitolo, la variabile d’istanza omonima non c’entra nulla con la variabile locale. In qualsiasi caso, una volta inizializzata a 3:\n" +
                "public class Esercizio2u_OK {\n" +
                "  int c = 3;\n" +
                "  public static void main(String args[]) {\n" +
                "      int a = 1;\n" +
                "      int b = 2, c = 3, d = 4;\n" +
                "      System.out.println(a+b+c+d);\n" +
                "  }\n" +
                "}\n" +
                "stamperà:\n" +
                "10");
    }
}
