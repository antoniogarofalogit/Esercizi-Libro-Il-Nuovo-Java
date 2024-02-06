package Capitolo1_IntroduzioneAJava.Esercizio1w;

public class Esercizio1w {
    public static void main(String args[]){
        System.out.println("Scrivere un programma definito dalla classe Frecce che stampi il seguente output:\n" +
                "<----<<<\n" +
                ">>>----> \n");
        System.out.println("Il listato dovrebbe essere simile al seguente:\n" +
                "public class Frecce {\n" +
                "    public static void main(String args[]) {\n" +
                "      System.out.println(\"<----<<<\");\n" +
                "      System.out.println(\"\");\n" +
                "      System.out.println(\">>>---->\");\n" +
                "  }\n" +
                "}\n" +
                "Per stampare una riga vuota, la soluzione naturale è stata quella di usare l’istruzione System.out.println(\"\")ln una stringa vuota \"\".\n In realtà è possibile anche utilizzare in alternativa l’istruzione System.out.println(), senza passare nessun parametro al metodo.");
    }
}
