package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4h;

public class Esercizio4h {
    public static void main(String args[]) {
        System.out.println("Creare una classe con un metodo main che, utilizzando un ciclo for, selezioni i primi 10 numeri divisibili per 3, e li stampi dopo averli concatenati con una stringa in modo tale che l'output del programma sia:\n" +
                "Numero multiplo di 3 = 3\n" +
                "Numero multiplo di 3 = 6\n" +
                "Numero multiplo di 3 = 9\n" +
                "Numero multiplo di 3 = 12\n" +
                "Numero multiplo di 3 = 15\n" +
                "Numero multiplo di 3 = 18\n" +
                "Numero multiplo di 3 = 21\n" +
                "Numero multiplo di 3 = 24\n" +
                "Numero multiplo di 3 = 27\n" +
                "Numero multiplo di 3 = 30\n");
        for (int i = 1, j = 1; j <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println("Numero multiplo di 3 = " + i);
                j++;
            }
        }
    }
}
