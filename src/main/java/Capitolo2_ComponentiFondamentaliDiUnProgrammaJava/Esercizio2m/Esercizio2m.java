package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2m;

public class Esercizio2m {
    public static void main(String args[]){
        System.out.println("Dopo aver creato la classe Nazione dell’esercizio 2.l, riuscite a creare uno o più metodi? Se ci riuscite, definiteli all’interno della classe. Se non ci riuscite, sapete spiegare il perché?");
   System.out.println("È possibile che qualcuno sia riuscito a creare dei metodi all’interno di questa classe. Nell’esercizio precedente è stata richiesta solo in modo generico un’astrazione della classe Nazione, senza specificare il contesto o il programma in cui tale classe dovrà avere un ruolo. È per questo che ci risulta difficile creare dei metodi, visto che attualmente ignoriamo il programma in cui Nazione sarà utilizzato. Potremmo utilizzare questa classe in un programma che conserva i dati fisici delle nazioni, ma potremmo anche utilizzarlo in un videogioco che simula il famoso gioco da tavola Risiko. I metodi (ma anche le variabili d’istanza) da definire, potrebbero cambiare drasticamente da contesto a contesto. Nel primo caso infatti definiremmo variabili d’istanza come fiumi, laghi, montagne, superficie etc., e metodi come produce, esporta, importa. Nel secondo caso invece potremmo definire i confini, e il metodo difendi.\n" +
           "Concludendo, abbiamo reso estremamente generica la definizione della classe Nazione, proprio perché non avevamo vincoli da poter sfruttare.");
    }
}
