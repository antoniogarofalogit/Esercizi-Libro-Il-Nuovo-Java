package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3z;

public class Esercizio3z {
    public static void main(String args[]){
        System.out.println("Creare una classe Pagella che astragga il concetto di pagella scolastica. Essa deve avere le seguenti informazioni:\n" +
                "• nome, cognome e classe dell’alunno;\n" +
                "• una tabella che associ per ogni materia, il voto e il giudizio.\n" +
                "Deve inoltre dichiarare un metodo che stampi in maniera leggibile i dati della pagella.\n" +
                "Creare anche una classe Esercizio3Z che stampi una o più pagelle.");
        Studente studente1 = new Studente("Giovanni","Battista","5A");
        String [][] tabellaVoti1 = {
                {"Italiano","7","Non si impegna troppo."},
                {"Matematica","9","È molto portato per questa materia."},
                {"Storia","7","Potrebbe fare di più."},
                {"Geografia","8","Appassionato."},
                {"Inglese","9", "Capace di sostenere dialoghi."},
                {"Scienze Motorie","6", "Voto d'incoraggiamento."},
                {"Musica","7", "Ha una certa passione per la materia."}
        };
        Pagella pagella1 = new Pagella(studente1, tabellaVoti1);

        Studente studente2 = new Studente("Daniele","Sapore","2A");
        String [][] tabellaVoti2 = {
                {"Italiano","8","Manifesta entusiasmo per la materia."},
                {"Matematica","5","Per niente interessato."},
                {"Storia","6","Interessato, ma si impegna poco."},
                {"Geografia","6","Potrebbe fare di più."},
                {"Inglese","8", "Ottima pronuncia."},
                {"Scienze Motorie","7", "Un po' pigro."},
                {"Musica","9", "Suona diversi strumenti ed ha un'ottima voce."}
        };
        Pagella pagella2 = new Pagella(studente2, tabellaVoti2);

        pagella1.stampaPagella();
        pagella2.stampaPagella();
    }
}
