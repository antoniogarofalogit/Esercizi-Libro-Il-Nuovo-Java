package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4i;

public class Esercizio4i {
    public static void main(String args[]) {
        System.out.println("Ripetere l'esercizio 4.h usando un ciclo while invece del ciclo for.\n");
        int i = 1, j = 1;
        while (j <= 10) {
            if (i % 3 == 0) {
                System.out.println("Numero multiplo di 3 = " + i);
                j++;
            }
            i++;
        }
    }
}
