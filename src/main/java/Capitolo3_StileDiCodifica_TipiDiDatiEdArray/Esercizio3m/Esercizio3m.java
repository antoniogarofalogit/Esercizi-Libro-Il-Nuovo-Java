package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3m;

public class Esercizio3m {
    public static void main(String args[]){
        System.out.println("Data la seguente classe:\n" +
                "public class Esercizio3M {\n" +
                "    public static void main(String args[]) {\n" +
                "      boolean b = true;\n" +
                "      char c = 'I';\n" +
                "      System.out.println(b);\n" +
                "      System.out.println(c+1);\n" +
                "  }\n" +
                "}\n" +
                "Tenendo presente che la lettera I, è codificata tramite il numero decimale 73, quale output produrrà una volta eseguita?");
   System.out.println("Un literal booleano verrà stampato esattamente con il suo valore literal (true in questo caso). Invece c+1 viene promosso a numero intero, e da 73 diventa 74. Per potergli far stampare il valore carattere relativo (J) bisognerebbe fare un cast su tutta l’operazione in questo modo:\n" +
           "System.out.println((char)(c+1));");
    }
}
