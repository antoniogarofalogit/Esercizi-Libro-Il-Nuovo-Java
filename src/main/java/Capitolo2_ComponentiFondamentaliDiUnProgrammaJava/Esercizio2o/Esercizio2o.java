package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2o;

public class Esercizio2o {
    public static void main(String args[]){
        System.out.println("Data la seguente classe:\n" +
                "public class Esercizio2O {\n" +
                "    public String toString() {\n" +
                "      return \"Esercizio2O\"\n" +
                "  }\n" +
                "  public void main() {\n" +
                "  }\n" +
                "  public static void metodo() {\n" +
                "  }\n" +
                "  static public void main(String argomenti[]) {\n" +
                "  }\n" +
                "}\n" +
                "C’è un solo errore in questa classe che ne impedirà la compilazione, quale?\n");
   System.out.println("L’errore è che manca il ; accanto allo statement del metodo toString:\n" +
           "return \"Esercizio2O\"\n" +
           "che dovrebbe essere corretto così:\n" +
           "return \"Esercizio2O\";\n" +
           "Gli altri metodi sono tutti corretti.");
    }
}
