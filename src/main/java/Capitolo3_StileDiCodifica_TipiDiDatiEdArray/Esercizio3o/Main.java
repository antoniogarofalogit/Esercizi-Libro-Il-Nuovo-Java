package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3o;

public class Main {
    public static void main(String args[]){
        System.out.println("Data la classe:\n" +
                "package parcheggio;\n" +
                "public class Auto {\n" +
                "  public String tipo;\n" +
                "  public Auto(String t) {\n" +
                "      tipo = t;\n" +
                "  }\n" +
                "}\n" +
                "Affinché la seguente classe compili:\n" +
                "package lavoratori;\n" +
                "//Inserisci il codice qui\n" +
                "public class Autista {\n" +
                "    public void guida(Auto auto) {\n" +
                "        System.out.println(\"Sto guidando l'auto \" + auto.tipo);\n" +
                "    }\n" +
                "}\n" +
                "Bisogna inserire una riga di codice. Quale (o quali, potrebbero essere valide anche più di una) tra le seguenti righe permetterebbe alla classe Autista di essere compilata?\n" +
                "1. import parcheggio.Auto;\n" +
                "2. import parcheggio.*;\n" +
                "3. import parcheggio.lavoratori.*;\n" +
                "4. import parcheggio.Auto.*;\n" +
                "5. import parcheggio.*.Auto;\n" +
                "6. import lavoratori.parcheggio.Auto;");
        System.out.println("Le risposte corrette sono la 1 e la 2, tutte le altre sono scorrette a livello sintattico.");
    }
}
