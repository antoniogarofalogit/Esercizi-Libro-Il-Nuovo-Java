package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3h;

public class Main {
    public static void main(String args[]){
        System.out.println("La seguente classe dichiara vari identificatori di tipo stringa:\n" +
                "public class Esercizio3H {\n" +
                "  public String Break,\n" +
                "  String,\n" +
                "  character,\n" +
                "  bit,\n" +
                "  continues,\n" +
                "  exports,\n" +
                "  Class,\n" +
                "  imports,\n" +
                "  _AAA_,\n" +
                "  _@_,\n" +
                "  _;\n" +
                "}\n" +
                "Sono tutti validi? Una volta individuati quelli non validi, usare opportunamente i commenti per escluderli dalla compilazione.");
        System.out.println("Solo gli ultimi due identificatori non sono validi, infatti:\n" +
                "• L’identificatore Break è differente da break (tutte le parole chiave non hanno lettere maiuscole).\n" +
                "• L’identificatore String coincide con il nome della classe String, ma non essendo una parola chiave, è possibile utilizzarla come identificatore. Ciononostante si tratta di una cattiva pratica.\n" +
                "• L’identificatore character non è una parola chiave (lo è invece char).\n" +
                "• L’identificatore bit non è una parola chiave (lo è invece byte).\n" +
                "• L’identificatore continues non è una parola chiave (lo è invece continue).\n" +
                "• L’identificatore exports è una parola a utilizzo limitato, e sarebbe inutilizzabile all’interno della dichiarazione di un modulo, ma in questo contesto non crea problemi.\n" +
                "• L’identificatore Class non è una parola chiave (lo è invece class, vedi punto 1).\n" +
                "• L’identificatore imports non è una parola chiave (lo è invece import).\n" +
                "• L’identificatore _AAA_ non è una parola chiave.\n" +
                "• L’identificatore _@_ non è legale perché non si può usare il simbolo di chiocciola negli identificatori.\n" +
                "• L’identificatore _ è una parola riservata a partire da Java 9.\n" +
                "È possibile commentare i due identificatori non validi nel seguente modo:\n" +
                "    /*,\n" +
                "    _@_,\n" +
                "    _*/;\n" +
                "Abbiamo utilizzato un commento su più righe per commentare solo ciò che va commentato. Chiaramente questo approccio va a discapito della leggibilità del codice. \nIl modo più opportuno per commentare richiede il cambio del simbolo di \",\" con il simbolo \";\" subito dopo la dichiarazione dell’identificatore _AAA_, e l'utilizzo del commento a singola riga:\n" +
                "//    _@_\n" +
                "//    _;");
    }
}
