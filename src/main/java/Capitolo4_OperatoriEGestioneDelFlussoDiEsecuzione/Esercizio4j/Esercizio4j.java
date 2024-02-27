package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4j;

public class Esercizio4j {
    public static void main(String args[]) {
        System.out.println("Ripetere l'esercizio 4.h usando un ciclo do-while invece del ciclo for.");
        int i = 1, j = 1;
        do {
            if (i % 3 == 0) {
                System.out.println("Numero multiplo di 3 = " + i);
                j++;
            }
            i++;
        } while(j <= 10);
    }
}
