package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3b;

public class Main {
    public static void main(String args[]){
        System.out.println("Scrivere un programma con i seguenti requisiti:\n" +
                "1. Implementare una classe Persona che dichiari le variabili nome, cognome, eta (età). Si dichiari inoltre un metodo dettagli che restituisca in una stringa le informazioni sulla persona in questione.\n" +
                "Ricordarsi di utilizzare le convenzioni e le regole descritte in questo capitolo.\n" +
                "2. Implementare una classe Principale che, nel metodo main, istanzi due oggetti chiamati persona1 e persona2 della classe Persona, inizializzando per ognuno di essi i relativi campi utilizzando l’operatore dot.\n" +
                "3. Dichiarare un terzo reference (persona3) che punti ad uno degli oggetti già istanziati. Controllare che effettivamente persona3 punti all'oggetto voluto, stampando i campi di persona3 sempre mediante l’operatore dot.\n" +
                "4. Commentare adeguatamente le classi realizzate e sfruttare lo strumento javadoc per produrre la relativa documentazione.\n" +
                "Nella documentazione standard di Java sono usate tutte le regole e le convenzioni descritte in questo capitolo. Basta osservare che String inizia con lettera maiuscola, essendo una classe. Si può concludere che anche System è una classe.");
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        persona1.nome = "Mario";
        persona1.cognome = "Rossi";
        persona1.eta = 30;
        System.out.println("persona1 "+persona1.dettagli());
        persona2.nome = "Giuseppe";
        persona2.cognome = "Verdi";
        persona2.eta = 40;
        System.out.println("persona2 "+persona2.dettagli());
        Persona persona3 = persona1;
        System.out.println("persona3 "+persona3.dettagli());
    }
}
