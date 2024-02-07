package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3n;

public class Esercizio3n {
    public static void main(String args[]){
        System.out.println("Data la seguente classe:\n" +
                "public class Esercizio3N {\n" +
                "    public static void main(String args[]) {\n" +
                "      String s = \"Jav\";\n" +
                "      char c = \"a\";\n" +
                "      System.out.println(s+c+1);\n" +
                "  }\n" +
                "}\n" +
                "quale output produrrà una volta eseguita?");
        System.out.println("Avremo un errore in compilazione perché il valore assegnato al carattere c, è una stringa (si notino le virgolette al posto degli apici).");
    }
}
