package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2c;

public class Esercizio2c {
    public static void main(String args[]){
        System.out.println("Sintassi dei componenti fondamentali. Vero o Falso \n" +
                "1. Nella dichiarazione di un metodo (non costruttore), il nome è sempre seguito dalle parentesi che circondano i parametri opzionali, ed è sempre preceduto da un tipo di ritorno.\n" +
                "Vero. \n" +
                "2. Il seguente metodo è dichiarato in maniera corretta:\n" +
                "public void metodo() {\n" +
                "  return 5;\n" +
                "}\n" +
                "Falso, tenta di restituire un valore intero ma possiede tipo di ritorno void. \n" +
                "3. Il seguente metodo è dichiarato in maniera corretta:\n" +
                "public int metodo() {\n" +
                "  System.out.println(\"Ciao\");\n" +
                "}\n" +
                "Falso, il metodo dovrebbe restituire un valore intero. \n" +
                "4. La seguente variabile è dichiarata in maniera corretta:\n" +
                "public int a = 0;\n" +
                "Vero. \n" +
                "5. La seguente variabile x è utilizzata in maniera corretta (fare riferimento alla classe Punto definita in questo capitolo):\n" +
                "Punto p1 = new Punto();\n" +
                "Punto.x = 10;\n" +
                "Falso, l’operatore dot deve essere applicato all’oggetto e non alla classe:\n" +
                "Punto p1 = new Punto();\n" +
                "p1.x = 10;\n" +
                "6. La seguente variabile x è utilizzata in maniera corretta (fare riferimento alla classe Punto definita in questo capitolo):\n" +
                "Punto p1 = new Punto();\n" +
                "Punto.p1.x = 10;\n" +
                "Falso, l’operatore dot deve essere applicato all’oggetto e non alla classe, inoltre la classe non \"contiene\" l’oggetto. \n" +
                "7. La seguente variabile x è utilizzata in maniera corretta (fare riferimento alla classe Punto definita in questo capitolo):\n" +
                "Punto p1 = new Punto();\n" +
                "x = 10;\n" +
                "Falso, l’operatore dot deve essere applicato all’oggetto. Il compilatore non troverebbe infatti la dichiarazione della variabile x.\n" +
                "8. Il seguente costruttore è utilizzato in maniera corretta (fare riferimento alla classe Punto definita in questo capitolo):\n" +
                "Punto p1 = new Punto();\n" +
                "p1.Punto();\n" +
                "Falso, un costruttore è un metodo speciale che ha la caratteristica di essere invocato una ed una sola volta nel momento in cui si istanzia un oggetto. \n" +
                "9. Il seguente costruttore è dichiarato in maniera corretta:\n" +
                "public class Computer {\n" +
                "  public void Computer(){\n" +
                "  }\n" +
                "}\n" +
                "Falso, il costruttore non dichiara tipo di ritorno e deve avere nome coincidente con la classe.\n" +
                "10. Il seguente costruttore è dichiarato in maniera corretta:\n" +
                "public class Computer {\n" +
                "  public computer(int a) {\n" +
                "  }\n" +
                "}\n" +
                "Falso, il costruttore deve avere nome coincidente con la classe."
        );
    }
}
