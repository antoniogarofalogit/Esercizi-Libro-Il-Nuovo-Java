package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4zg;

public class Esercizio4zg {
    public static void main(String[] args) {
        System.out.println("Che comando dobbiamo lanciare se vogliamo copiare il file HelloWorld.java aperto nell'esercizio 4.ee in una cartella C:/cartella?\n" +
                "1. /save HelloWorld.java\n" +
                "2. /retain HelloWorld.java\n" +
                "3. /save HelloWorld2.java\n" +
                "4. /save C:/cartella/HelloWorld.java\n" +
                "5. /save -start start C:/cartella/HelloWorld.java\n" +
                "6. /env C:/cartella/HelloWorld.java\n" +
                "7. /! C:/cartella/HelloWorld.java\n");
        System.out.println("Il comando corretto è:\n" +
                "/save C:/cartella/HelloWorld.java");
    }
}
