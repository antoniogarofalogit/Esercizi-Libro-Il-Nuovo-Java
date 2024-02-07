package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3i;

public class Main {
    public static void main(String args[]){
        System.out.println("Data la seguente classe:\n" +
                "package com.claudiodesio.manuale.esercizi;\n" +
                "public class Esercizio3I {\n" +
                "  public final String nomeLinguaggio = \"Java 17\";\n" +
                "  public int intero;\n" +
                "  public void stampaStringa() {\n" +
                "      System.out.println(nomeLinguaggio);\n" +
                "  }\n" +
                "}\n" +
                "C’è qualche convenzione non rispettata per i nomi? Se si, quale e come modificare per risolvere? Se non si rispettano le convenzioni dei nomi, il codice non compila?");
    System.out.println("L’unica convenzione non utilizzata correttamente è quella per la costante (si ricorda che le convenzioni non influiscono sulla compilabilità del codice).\n" +
            "Il codice andrebbe corretto nel seguente modo:\n" +
            "package com.claudiodesio.manuale.esercizi;\n" +
            "public class Esercizio3ISoluzione {\n" +
            "  public final String NOME_LINGUAGGIO = \"Java 17\";\n" +
            "  public int intero;\n" +
            "  public void stampaStringa() {\n" +
            "      System.out.println(NOME_LINGUAGGIO);\n" +
            "  }\n" +
            "}");
    }
}
