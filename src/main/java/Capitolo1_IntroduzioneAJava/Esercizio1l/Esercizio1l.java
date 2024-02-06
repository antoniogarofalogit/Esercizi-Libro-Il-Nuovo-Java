package Capitolo1_IntroduzioneAJava.Esercizio1l;

public class Esercizio1l {
    public static void main(String args[]){
        System.out.println("Raddoppiare il simbolo di ; nel programma HelloWorld compilare ed eseguire.");
        System.out.println("Il listato dovrebbe essere simile al seguente:\n" +
                "public class HelloWorld {\n" +
                "    public static void main(String args[]) {\n" +
                "      System.out.println(\"Hello World!\");;\n" +
                "  }\n" +
                "}\n" +
                "Il file però viene compilato ed eseguito senza errori. Infatti il simbolo ; superfluo, viene considerato dal compilatore come una terminazione (legale) di uno statement vuoto.\n Potremmo scriverlo anche al rigo successivo per rendere l’idea un po’ più chiaramente:\n" +
                "public class HelloWorld {\n" +
                "    public static void main(String args[]) {\n" +
                "      System.out.println(\"Hello World!\");\n" +
                "      ;\n" +
                "  }");
    }
}
