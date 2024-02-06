package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2b;

public class Esercizio2b {
    public static void main(String args[]){
        System.out.println("Concetti sui componenti fondamentali, Vero o Falso \n" +
                "1. Una variabile d’istanza deve essere per forza inizializzata dal programmatore.\n" +
                "Falso, una variabile locale deve essere per forza inizializzata dal programmatore. Una variabile è detta locale se è dichiarata all'interno di un metodo. Essa smetterà di esistere quando terminerà il metodo. \n" +
                "A differenza delle variabili di istanza, non saranno inizializzate ad un valore nullo nel momento in cui viene istanziato l'oggetto a cui appartengono. \n" +
                "2. Una variabile locale condivide il ciclo di vita con l’oggetto in cui è definita.\n" +
                "Falso, una variabile d’istanza condivide il ciclo di vita con l’oggetto a cui appartiene. Una variabile si dice d'istanza se è dichiarata in una classe, ma al di fuori di un metodo. \n" +
                "3. Un parametro ha un ciclo di vita coincidente con il metodo in cui è dichiarato: nasce quando il metodo viene invocato, muore quando termina il metodo.\n" +
                "Vero. \n" +
                "4. Una variabile d’istanza appartiene alla classe in cui è dichiarata.\n" +
                "Falso, una variabile d’istanza appartiene ad un oggetto istanziato dalla classe in cui è dichiarata. \n" +
                "5. Un metodo è sinonimo di azione, operazione.\n" +
                "Vero. \n" +
                "6. Sia le variabili sia i metodi sono utilizzabili di solito mediante l’operatore dot, applicato ad un’istanza della classe dove sono stati dichiarati.\n" +
                "Vero. \n" +
                "7. Un costruttore è un metodo che non restituisce mai niente, infatti ha come tipo di ritorno void.\n" +
                "Falso, un costruttore è un metodo che non restituisce mai niente, infatti non ha tipo di ritorno. \n" +
                "8. Un costruttore viene detto di default, se non ha parametri.\n" +
                "Falso, un costruttore viene detto di default se viene inserito dal compilatore. Inoltre non ha parametri, ma non tutti i costruttori di default non hanno parametri. \n" +
                "9. Un costruttore è un metodo e quindi può essere utilizzato mediante l’operatore dot, applicato ad un’istanza della classe dove è stato dichiarato.\n" +
                "Falso, un costruttore è un metodo speciale che ha la caratteristica di essere invocato una ed una sola volta nel momento in cui si istanzia un oggetto. \n" +
                "10. Un package è fisicamente una cartella che contiene classi, le quali hanno dichiarato esplicitamente di far parte del package stesso nei rispettivi file sorgente. \n" +
                "Vero.");
    }
}
