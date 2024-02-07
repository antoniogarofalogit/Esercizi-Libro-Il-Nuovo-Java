package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3a;

public class Esercizio3a {
    public static void main(String args[]){
        System.out.println("Scrivere un semplice programma che svolga le seguenti operazioni aritmetiche correttamente, scegliendo accuratamente i tipi di dati da utilizzare per immagazzinare i risultati di esse.\n" +
                "1. Una divisione (usare il simbolo /) tra due interi a = 5, e b = 3. Immagazzinare il risultato in una variabile r1, scegliendone il tipo di dato opportunamente.\n" +
                "2. Una moltiplicazione (usare il simbolo *) tra un char c = 'a', ed uno short s = 5000. Immagazzinare il risultato in una variabile r2, scegliendone il tipo di dato opportunamente.\n" +
                "3. Una somma (usare il simbolo +) tra un int i = 6 ed un float f = 3.14F. Immagazzinare il risultato in una variabile r3, scegliendone il tipo di dato opportunamente.\n" +
                "4. Una sottrazione (usare il simbolo -) tra r1, r2 e r3. Immagazzinare il risultato in una variabile r4, scegliendone il tipo di dato opportunamente.\n" +
                "Verificare la correttezza delle operazioni stampandone i risultati parziali e il risultato finale. Tenere presente la promozione automatica nelle espressioni, e utilizzare il cast opportunamente. È richiesta la creazione di una sola classe con un main che svolga le operazioni.");
        int a = 5, b = 3;
        double r1 = (double)a/b;
        System.out.println("r1 = " + r1);
        char c = 'a';
        short s = 5000;
        int r2 = c*s;
        System.out.println("r2 = " + r2);
        int i = 6;
        float f = 3.14F;
        float r3 = i + f;
        System.out.println("r3 = " + r3);
        double r4 = r1 - r2 - r3;
        System.out.println("r4 = " + r4);
    }
}
