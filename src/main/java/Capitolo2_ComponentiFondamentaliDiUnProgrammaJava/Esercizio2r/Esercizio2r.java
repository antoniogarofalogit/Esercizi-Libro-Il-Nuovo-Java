package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2r;

public class Esercizio2r {
    public static void main(String args[]){
        System.out.println("Data la seguente classe:\n" +
                "public class Esercizio2R {\n" +
                "    public int var1;\n" +
                "    public int var2;\n" +
                "    System.out.println(\"Esercizio 2.r\");\n" +
                "    public Esercizio2R() {\n" +
                "        \n" +
                "    }\n" +
                "    public Esercizio2R(int a , int b) {\n" +
                "        var1 = b;\n" +
                "        var2 = a;\n" +
                "    }\n" +
                "    public static void main(String args[]) {\n" +
                "        Esercizio2R esercizio2R = new Esercizio2R (4,7);\n" +
                "        System.out.println(esercizio2R.var1);\n" +
                "        System.out.println(esercizio2R.var2);\n" +
                "    }\n" +
                "}\n" +
                "Una volta eseguito, cosa stamperà questo programma?\n" +
                "1. Questo programma non può essere eseguito.\n" +
                "2. Questo programma non compila.\n" +
                "3. Stamperà 74.\n" +
                "4. Stamperà 47.\n");
        System.out.println("Il programma non compilerà per via dello statement:\n" +
                "System.out.println(\"Esercizio 2.r\");\n" +
                "che non appartiene a nessun blocco di codice di metodo. Ma abbiamo visto che all’interno di una classe sono definiti solo variabili e metodi, non statement. Eliminando quello statement, il programma compilerà e stamperà al runtime:\n" +
                "7\n" +
                "4");
    }
}
