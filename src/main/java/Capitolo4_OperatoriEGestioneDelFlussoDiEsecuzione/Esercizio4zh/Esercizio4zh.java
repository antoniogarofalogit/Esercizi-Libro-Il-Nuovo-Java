package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4zh;

public class Esercizio4zh {
    public static void main(String[] args) {
        System.out.println("JShell strumenti ausiliari, Vero o Falso:\n" +
                "1. In una sessione JShell è possibile dichiarare una variabile senza specificare un reference.\n" +
                "Vero, in questo caso si parla di variabile implicita, e JShell ne dedurrà automaticamente il tipo. \n" +
                "2. In una sessione JShell è possibile dichiarare un reference senza specificare il tipo del reference.\n" +
                "Vero, in questo caso si parla di forwarding reference, e JShell creerà il reference, ma non lo renderà disponibile sino a quando non dichiareremo anche il suo tipo. A quel punto il reference verrà sostituito e inizializzato a null. \n" +
                "3. In una sessione JShell è possibile scrivere un valore, poi con il tasto \"TAB\" far dedurre automaticamente il tipo della variabile a JShell, per poi scrivere il nome del reference.\n" +
                "Falso, bisogna invece premere contemporaneamente i tasti \"SHIFT e TAB\", rilasciarli e dopo premere il tasto \"v\" (che sta per \"variable\"). JShell dedurrà il tipo della variabile, la dichiarerà e posizionerà il cursore subito dopo per permetterci di definire il reference. \n" +
                "4. Mentre si dichiara un reference ad un tipo non importato, è possibile farci suggerire da JShell una lista di possibili import da usare per il tipo, premendo contemporaneamente i tasti \"SHIFT\" e \"TAB\", rilasciarli e dopo premere il tasto \"v\".\n" +
                "Falso, bisogna invece premere contemporaneamente i tasti \"SHIFT e TAB\", rilasciarli e dopo premere il tasto \"i\" (che sta per \"input\"). \n" +
                "5. Il comando /edit aprirà il programma Notepad++.\n" +
                "Falso, verrà aperto il programma JShell Edit Pad, a meno che prima non si sia impostato come editor di default Notepad++ mediante il comando:\n" +
                "/set editor C:\\Program Files (x86)\\Notepad++\\notepad++.exe \n" +
                "6. In una sessione JShell la pressione contemporanea dei tasti \"CTRL – BARRA SPAZIATRICE\" provoca l'auto-completamento del codice che si è iniziato a scrivere, o nel caso di più opzioni disponibili, la scelta tra esse.\n" +
                "Falso, la pressione del tasto \"TAB\" provoca l'auto-completamento del codice che si è iniziato a scrivere, o nel caso di più opzioni disponibili, la scelta tra esse. \n" +
                "7. In una sessione JShell la pressione contemporanea dei tasti \"CTRL – E\" provoca lo spostamento del cursore al termine della riga.\n" +
                "Vero. \n" +
                "8. In una sessione JShell la pressione contemporanea dei tasti \"ALT – D\" provoca la cancellazione della parola alla destra del cursore.\n" +
                "Vero. \n" +
                "9. Il comando /set feedback silent provoca che JShell eviti di stampare i messaggi dell'analisi del codice scritto.\n" +
                "Vero. \n" +
                "10. Scrivendo System e premendo due volte il tasto \"TAB\", JShell ci mostrerà la documentazione della classe System.\n" +
                "Vero.");
    }
}
