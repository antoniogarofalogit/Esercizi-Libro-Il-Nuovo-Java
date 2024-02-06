package Capitolo1_IntroduzioneAJava.Esercizio1j;

public class Esercizio1j {
    public static void main(String args[]){
        System.out.println("Raddoppiare la parentesi graffa finale della classe HelloWorld. Utilizzando la prompt dei comandi compilare il programma e interpretare il messaggio di errore.");
        System.out.println("Il messaggio di errore è il seguente:\n" +
                "HelloWorld.java:5: error: class, interface, or enum expected\n" +
                "}\n" +
                "^\n" +
                "1 error\n" +
                "Il messaggio è lo stesso che abbiamo già visto nell’approfondimento 1.5, dove avevamo definito una classe utilizzando erroneamente la lettera maiuscola per la parola chiave class.\n In quel caso, come sappiamo un file sorgente Java deve obbligatoriamente definire al suo interno una classe.\n Il compilatore siccome non aveva trovato una definizione valida, reclamava la definizione di una classe (o un’interfaccia o una enumerazione).\n In questo caso invece, il compilatore si aspetta che al posto della parentesi graffa superflua, sia definita un’altra classe (o un’interfaccia o una enumerazione).\n Infatti, è possibile definire anche altre classi all’interno di un unico file sorgente.");
    }
}
