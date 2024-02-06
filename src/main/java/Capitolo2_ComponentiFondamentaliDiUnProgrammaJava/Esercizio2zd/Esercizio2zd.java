package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2zd;

public class Esercizio2zd {
    public static void main(String args[]){
        System.out.println("Consideriamo la classe Aritmetica definita\n" +
                "public class Aritmetica {\n" +
                "    public int somma(int a, int b) {\n" +
                "      return (a + b);\n" +
                "  }\n" +
                "}\n" +
                "Creare una versione che rappresenta un compromesso tra la versione leggibile e la versione sintetica di questa classe.\n");
        System.out.println("Un giusto compromesso, e questo dipende dalla nostra capacità di astrazione, la nostra pazienza, dalla nostra forma mentis, dalla nostra esperienza di programmazione ed altri fattori. Per questo esempio, potrebbe essere un compromesso accettabile la seguente implementazione:\n" +
                "public class AritmeticaCompromesso {\n" +
                "    public int somma(int addendo1, int addendo2) {\n" +
                "      return addendo1 + addendo2;\n" +
                "  }\n" +
                "}\n" +
                "Tuttavia, essendo un parere soggettivo potreste scegliere di implementare la classe in maniera diversa.");
    }
}
