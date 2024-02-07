package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3j;

public class StampaClasseRigaVuota {
    public static void main(String args[]){
        System.out.println("Considerando l’esercizio 1.y, creare una classe chiamata StampaClasseRigaVuota che stampi il seguente ouput:\n" +
                "public class RigaVuota {\n" +
                "    public static void main(String args[]) {\n" +
                "          System.out.println(\"\");\n" +
                "      }\n" +
                "  }");
        System.out.println("Il problema sorge per la stampa delle virgolette definite all’interno del metodo println. La soluzione consiste nell’utilizzare i caratteri di escape:\n" +
                "public class StampaClasseRigaVuota {\n" +
                "    public static void main(String args[]) {\n" +
                "      System.out.println(\"public class RigaVuota {\");\n" +
                "      System.out.println(\"    public static void main(String args[]) {\");\n" +
                "      System.out.println(\"        System.out.println(\\\"\\\");\");\n" +
                "      System.out.println(\"    }\");\n" +
                "      System.out.println(\"}\");\n" +
                "  }\n" +
                "}");
    }
}
