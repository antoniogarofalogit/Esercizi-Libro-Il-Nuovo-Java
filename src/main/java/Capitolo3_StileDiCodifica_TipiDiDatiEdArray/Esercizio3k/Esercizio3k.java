package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3k;

public class Esercizio3k {
    public static void main(String args[]){
        System.out.println("Data la seguente classe:\n" +
                "public class Esercizio3K {\n" +
                "    public static void main(String args[]) {\n" +
                "      char d = (char)100;\n" +
                "      float f = (float)d*1_000_000_000;\n" +
                "      System.out.println((long)f);\n" +
                "  }\n" +
                "}\n" +
                "Quale output produrrà una volta eseguita?");
        System.out.println("Il codice compila, viene eseguito senza errori e stampa:\n" +
                "99999997952\n" +
                "ovvero, un numero imprecisato. Infatti i tipi float, per causa delle limitazioni dello standard IEEE-754, superate le 9 cifre decimali usa dei numeri approssimati.");
    }
}
