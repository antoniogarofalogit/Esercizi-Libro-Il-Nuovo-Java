package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2t;

public class Esercizio2t {
    public static void main(String args[]){
        System.out.println("Date le seguenti classi:\n" +
                "public class Corso {\n" +
                "    public String nome;\n" +
                "    public Corso() {\n" +
                "    }\n" +
                "    public Corso(String n) {\n" +
                "        nome = n;\n" +
                "    }\n" +
                "}\n" +
                "public class Esercizio2t {\n" +
                "    public static void main(String args[]) {\n" +
                "        Corso corso1 = new Corso();\n" +
                "        corso1.nome = \"Java\";\n" +
                "        Corso corso2 = new Corso(\"Java\");\n" +
                "        System.out.println(corso1.nome);\n" +
                "        System.out.println(corso2.nome);\n" +
                "    }\n" +
                "}\n" +
                "Una volta eseguito, cosa stamperà questo programma?\n" +
                "1. Questo programma non può essere eseguito.\n" +
                "2. Questo programma non compila.\n" +
                "3. Stamperà:\n" +
                "Java\n" +
                "Java\n" +
                "4. Stamperà:\n" +
                "Java\n");
        System.out.println("La risposta corretta è la 3.");
    }
}
