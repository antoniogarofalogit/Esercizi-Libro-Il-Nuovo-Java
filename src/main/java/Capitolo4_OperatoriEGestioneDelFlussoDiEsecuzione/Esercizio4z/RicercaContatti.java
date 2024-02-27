package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4z;

import java.util.Scanner;

public class RicercaContatti {
    public static void main(String args[]) {
        System.out.println("Riprendendo la classe Rubrica creata nell'esercizio 3.x, creare un metodo chiamato cercaContattiPerNome(String nome) che prende come input una stringa che può rappresentare un nome o una parte di esso,\ne deve restituire un array di oggetti Contatto che contengano la stringa nel proprio nome.\nCreare anche una classe di test chiamata RicercaContatti che permette all'utente di specificare la stringa da passare come criterio di ricerca al metodo cercaContattiPerNome e che stampi i risultati della ricerca.\n");
        System.out.println("Ricerca Contatti");
        var rubrica = new Rubrica();
        System.out.println("Inserisci nome o parte del nome da ricercare");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Contatto[] contattiTrovati = rubrica.cercaContattiPerNome(input);
        System.out.println("Contatti trovati con nome contenente \"" +
                input +"\"" );
        for (Contatto contatto : contattiTrovati) {
            if (contatto != null) {
                contatto.stampaDettagli();
            }
        }
    }
}
