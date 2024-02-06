package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2zc;

public class Esercizio2zc {
    public static void main(String args[]){
        System.out.println("Consideriamo la classe Aritmetica definita\n" +
                "public class Aritmetica {\n" +
                "    public int somma(int a, int b) {\n" +
                "      return (a + b);\n" +
                "  }\n" +
                "}\n" +
                "Creare una versione \"maggiormente leggibile\" di questa classe. \n");
    System.out.println("Notiamo che il nome del metodo (somma) non descrive completamente la funzionalità che vuole definire. L’identificatore sommaDueInteri, sarebbe più \"parlante\", e non lascerebbe dubbi sulla implementazione del metodo. Tutto sommato però, anche il nome somma sembra accettabile. Infatti, questo metodo dichiara come lista di parametri due variabili di tipo int, e i parametri di un metodo rappresentano l’input del metodo. Quando questo metodo verrà chiamato, bisognerà passargli in input due valori di tipo intero. Non potremo passare a questo metodo valori non interi come 26.1, oppure abc. L’identificatore somma quindi, può essere considerato un buon identificatore, perché non ci sono dubbi sul fatto che il metodo possa fare la somma solamente di due numeri interi. D’altronde, \"un metodo è determinato dalla coppia costituita dall’identificatore e l’eventuale lista dei parametri\" (firma del metodo).\n" +
            "Come nome dei parametri abbiamo scelto a e b. Sebbene, siano identificatori coincisi, che ci permettono di risparmiare qualche digitazione, rimangono nomi che non astraggono bene i concetti che vogliono rappresentare. Ne comprendiamo l’utilità, solo perché stiamo definendo un metodo molto semplice e conosciamo bene cosa sia una addizione. Tuttavia, non sarà sempre così. Scegliere identificatori \"parlanti\", è fondamentali per la leggibilità del nostro codice, e quindi per semplificare la nostra interazione con il codice stesso. Sarebbe preferibile quindi, utilizzare identificatori come addendo1 e addendo2, oppure i più generici operando1 ed operando2.\n" +
            "Per quanto riguarda il tipo di ritorno, per la prima volta non troviamo la parola chiave void, ma int, che rappresenta un numero intero. Ciò significa che quando questo metodo sarà invocato, esso restituirà in output un valore di tipo intero. Infatti, nell’ultima istruzione del metodo sommaDueInteri, i due parametri saranno sommati tramite l’operatore +, e il risultato della loro somma verrà restituita come output tramite il comando return:\n" +
            "        return (a + b);\n" +
            "L’output sarà:\n" +
            "Il perimetro del quadrato è:\n" +
            "68 \n" +
            "Il risultato che viene restituito da questo metodo è la somma di due interi, che è ovviamente un intero. Ecco perché il tipo di ritorno è dichiarato come int.\n" +
            "Nell’unico statement contenuto nel blocco di codice quindi, ci sono due istruzioni: la somma dei due parametri ed il comando return, che provoca la terminazione del metodo, ritornando il valore successivamente specificato.\n" +
            "Anche in questo caso, sottolineiamo che il blocco di codice del metodo, anche se tecnicamente corretto, potrebbe essere astratto in maniera diversa. Condensando tutta la logica in un unico statement, abbiamo indubbiamente sacrificato la leggibilità del codice alla sinteticità. Per un esempio così semplice questo è accettabile, ma dopo le nostre considerazioni possiamo creare una nuova versione della classe Aritmetica, usando l’astrazione per rendere il programma più leggibile:\n" +
            "public class AritmeticaLeggibile {\n" +
            "  public int sommaDueInteri(int addendo1, int addendo2) {\n" +
            "    int risultato = addendo1 + addendo2;\n" +
            "    return risultato;\n" +
            "  }\n" +
            "}");
    }
}
