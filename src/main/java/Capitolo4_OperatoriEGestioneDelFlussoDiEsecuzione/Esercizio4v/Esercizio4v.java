package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4v;

public class Esercizio4v {
    public static void main(String args[]) {
        System.out.println("Dichiarare una classe StranaCalcolatrice che dato un numero imprecisato di numeri definisca i metodi per:\n" +
                "1. Sommarli.\n" +
                "2. Moltiplicarli.\n" +
                "3. Restituire il numero più grande (il massimo).\n" +
                "4. Restituire il numero più piccolo (il minimo).\n");
        StranaCalcolatrice stranaCalcolatrice = new StranaCalcolatrice();
        double [] a1 = {42.7, 47.8};
        System.out.println("42.7 + 47.8 = " + stranaCalcolatrice.somma(a1));
        double [] a2 = {42.7, 47.8, 2};
        System.out.println("42.7 x 47.8 x 2= " +
                stranaCalcolatrice.moltiplica(a2));
        double [] a3 = {42.7, 47.8, 50, 2, 8, 89};
        System.out.println("Il massimo tra 42.7, 47.8, 50, 2, 8, 89 è " +
                stranaCalcolatrice.massimo(a3));
        double [] a4 = {42.7, 47.8, 50, 2, 8, 89};
        System.out.println("Il minimo tra 42.7, 47.8, 50, 2, 8, 89 è " +
                stranaCalcolatrice.minimo(a4));
    }
}
