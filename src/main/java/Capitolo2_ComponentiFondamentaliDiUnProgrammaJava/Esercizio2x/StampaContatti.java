package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2x;

public class StampaContatti {
    public static void main(String args[]){
        System.out.println("Consideriamo la soluzione dell’esercizio 2.w, creiamo una nuova versione della classe StampaContatti dell’esercizio 1.x (il cui listato è riportato anche nella traccia dell’esercizio 2.w), questa volta sfruttando la classe Contatto creata nell’esercizio 2.w. l’output del programma deve essere lo stesso del programma StampaContatti dell’esercizio 1.x.\n" +
                "Consiglio: utilizzare un metodo simile a stampaDettagli che abbiamo definito nella soluzione dell’esercizio 2.k.\n");
        System.out.println("Elenco Contatti");
        System.out.println();
        Contatto contatto1 = new Contatto("Claudio De Sio Cesari",
                "Via Java 13", "131313131313");
        Contatto contatto2 = new Contatto("Stevie Wonder",
                "Via Musica 10", "1010101010");
        Contatto contatto3 = new Contatto("Gennaro Capuozzo",
                "Piazza Quattro Giornate 1", "1111111111");
        contatto1.stampaDettagli();
        contatto2.stampaDettagli();
        contatto3.stampaDettagli();
    }
}
