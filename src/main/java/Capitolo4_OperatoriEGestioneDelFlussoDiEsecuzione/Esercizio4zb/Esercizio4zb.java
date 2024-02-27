package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4zb;

public class Esercizio4zb {
  public static void main(String[] args) {
        System.out.println("JShell comandi \n" +
                "1. Per terminare una sessione JShell, bisogna digitare il comando goodbye.\n" +
                "Falso, bisogna digitare il comando exit.\n" +
                "2. Tutti i comandi di JShell devono avere come prefisso il simbolo \\.\n" +
                "Falso, tutti i comandi JShell devono avere come prefisso /.\n" +
                "3. I comandi help e ? sono equivalenti.\n" +
                "Vero. \n" +
                "4. Il comando history mostra tutti gli snippet e tutti i comandi lanciati dall'utente nella sessione corrente. Accanto agli snippet è presente uno snippet id che permette di richiamare lo snippet corrispondente.\n" +
                "Falso, è vero che il comando history mostra tutti gli snippet e tutti i comandi lanciati dall'utente nella sessione corrente. Ma non è vero che accanto agli snippet è presente uno snippet id.\n" +
                "5. Il comando list mostra tutti i comandi digitati dall'utente in questa sessione.\n" +
                "Falso, il comando list mostra tutti gli snippet digitati dall'utente in questa sessione, con accanto i rispettivi snippet id.\n" +
                "6. Se lanciamo il comando /types -all elencherà tutte le variabili dichiarate nella sessione corrente.\n" +
                "Falso, il comando /types -all elencherà tutte i tipi (classi, interfacce, enumerazioni, annotazioni) dichiarate nella sessione corrente. \nPiuttosto il comando /variables -all elencherà tutte le variabili dichiarate nella sessione corrente.\n" +
                "7. Il comando reload provocherà che tutte le istruzioni eseguite nella sessione corrente siano eseguite nuovamente.\n" +
                "Vero. \n" +
                "8. Il comando drop può cancellare un certo snippet specificando il suo snippet id.\n" +
                "Vero. \n" +
                "9. Se specifichiamo il comando /set start JAVASE, importeremo in questa ed in tutte le altre sessioni future di JShell, tutte i package di Java Standard Edition.\n" +
                "Falso, è vero che importeremo in questa sessione, tutte i package di Java Standard Edition, ma non nelle future sessioni (avremmo dovuto esplicitare anche l'opzione -retain).\n" +
                "10. Con li comando /! richiamiamo l'ultimo snippet editato, sia esso valido o non valido.\n" +
                "Vero.");
    }
}
