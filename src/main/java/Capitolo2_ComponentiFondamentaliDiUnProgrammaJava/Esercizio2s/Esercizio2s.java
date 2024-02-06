package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2s;

public class Esercizio2s {
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
                "public class Esercizio2s {\n" +
                "    public static void main(String args[]) {\n" +
                "        Corso corso1 = new Corso();\n" +
                "        corso1.nome = \"Java\";\n" +
                "        Corso corso2 = new Corso(\"Java\");\n" +
                "        System.out.println(corso1.nome);\n" +
                "        System.out.println(corso2.nome);\n" +
                "    }\n" +
                "}\n" +
                "Quale sequenza di istruzioni tra le seguenti serve per eseguire il programma?\n" +
                "1. javac Corso.java, javac Esercizio2S.java, java Corso.\n" +
                "2. javac Corso.java, javac Esercizio2S.java, java Corso.class.\n" +
                "3. javac Corso.java, javac Esercizio2S.java, java Esercizio2S.\n" +
                "4. javac Corso.java, javac Esercizio2S.java, java Esercizio2S Corso.\n");
        System.out.println("La risposta corretta è la 3. Sarebbe possibile anche compilare solo la classe Esercizio2S, visto che utilizzando la classe Corso, essa obbligherà il compilatore a compilare anche quest’ultima. Quindi possiamo anche eseguire questa sequenza:\n" +
                "javac Esercizio2S.java\n" +
                "java Esercizio2S");
    }
}
