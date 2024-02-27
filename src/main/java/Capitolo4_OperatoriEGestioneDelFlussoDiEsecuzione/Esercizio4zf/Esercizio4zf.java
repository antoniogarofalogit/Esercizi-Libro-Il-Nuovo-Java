package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4zf;

public class Esercizio4zf {
    public static void main(String[] args) {
        System.out.println("Una volta aperto il file HelloWorld.java all'interno di una sessione JShell, come possiamo far stampare la stringa Hello World!?\n");
        System.out.println("Possiamo solo invocare il metodo main nel seguente modo:\n" +
                "jshell> HelloWorld hw = new HelloWorld();\n" +
                "hw ==> HelloWorld@52a86356\n" +
                "jshell> hw.main(null);\n" +
                "Hello World!\n" +
                "Notare che siccome l'array args non viene utilizzato all'interno del metodo main, allora abbiamo potuto passargli null.\n" +
                "Anche se non l'abbiamo ancora studiato seriamente, il modificatore static ci permette di evitare di istanziare l'oggetto hw, e lanciare direttamente il comando usando il nome della classe:\n" +
                "jshell> HelloWorld.main(null)\n" +
                "Hello World!");
    }
}
