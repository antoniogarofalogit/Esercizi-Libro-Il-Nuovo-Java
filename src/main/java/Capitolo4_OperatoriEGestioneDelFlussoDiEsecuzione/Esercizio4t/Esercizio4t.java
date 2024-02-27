package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4t;

public class Esercizio4t {
    public static void main(String args[]) {
        System.out.println("Dichiarare una classe CalcolatriceSemplificata che dati due numeri definisca i metodi per:\n" +
                "• Sommarli.\n" +
                "• Sottrarre il secondo dal primo.\n" +
                "• Moltiplicarli.\n" +
                "• Dividerli.\n" +
                "• Restituire il resto della divisione.\n" +
                "• Restituire il numero più grande (il massimo).\n" +
                "• Restituire il numero più piccolo (il minimo).\n" +
                "• Restituire la media dei due numeri.\n" +
                "Creare una classe che testa il funzionamento di tutti i metodi.\n");
        CalcolatriceSemplificata calcolatriceSemplificata = new CalcolatriceSemplificata();
        System.out.println("42.7 + 47.8 = " + calcolatriceSemplificata.somma(42.7, 47.8));
        System.out.println("42.7 - 47.8 = " + calcolatriceSemplificata.sottrai(42.7, 47.8));
        System.out.println("42.7 x 47.8 = " + calcolatriceSemplificata.moltiplica(42.7, 47.8));
        System.out.println("42.7 : 47.8 = " + calcolatriceSemplificata.dividi(42.7, 47.8));
        System.out.println("il resto della divisione tra 42.7 e 47.8 è " + calcolatriceSemplificata.restituisciResto(42.7, 47.8));
        System.out.println("Il massimo tra 42.7 e 47.8 è " + calcolatriceSemplificata.massimo(42.7, 47.8));
        System.out.println("Il minimo tra 42.7 e 47.8 è " + calcolatriceSemplificata.minimo(42.7, 47.8));
        System.out.println("La media tra 42.7 e 47.8 è " + calcolatriceSemplificata.media(42.7, 47.8));
    }
}
