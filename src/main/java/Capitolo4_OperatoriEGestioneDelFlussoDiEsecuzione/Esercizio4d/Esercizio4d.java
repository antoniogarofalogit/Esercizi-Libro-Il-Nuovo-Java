package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4d;

public class Esercizio4d {
    public static void main(String args[]){
        System.out.println("Operatori e flusso di esecuzione, Vero o Falso \n" +
                "1. Gli operatori unari di pre-incremento e post-incremento applicati ad una variabile danno lo stesso risultato, ovvero se abbiamo:\n" +
                "int i = 5;\n" +
                "sia\n" +
                "i++;\n" +
                "sia\n" +
                "++i;\n" +
                "aggiornano il valore di i a 6;\n" +
                "Vero. \n" +
                "2. d += 1 è equivalente a d++, dove d è una variabile double.\n" +
                "Vero. \n" +
                "3. Se abbiamo:\n" +
                "int i = 5;\n" +
                "int j = ++i;\n" +
                "int k = j++;\n" +
                "int h = k--;\n" +
                "boolean flag = ((i != j) && ( (j <= k ) ||  (i <= h)) );\n" +
                "flag avrà valore false.\n" +
                "Falso, la variabile booleana flag avrà valore true. \nLe espressioni atomiche valgono rispettivamente true-false-true, sussistendo le seguenti uguaglianze: i = 6, j = 7, k = 5, h = 6. \nInfatti (i != j) vale true e inoltre (i <= h) vale true. \nL'espressione ( (j <= k ) || (i <= h)) ) vale true, sussistendo l'operatore OR. \nInfine l'operatore AND fa sì che la variabile flag valga true.\n" +
                "4. L'istruzione:\n" +
                "System.out.println(1 + 2 + \"3\");\n" +
                "stamperà 33.\n" +
                "Vero. \n" +
                "5. Il costrutto switch può in ogni caso sostituire il costrutto if.\n" +
                "Falso, switch può testare solo una variabile intera (o compatibile) confrontandone l'uguaglianza con costanti \n(in realtà dalla versione 5 si possono utilizzare come variabili di test anche le enumerazioni e il tipo Integer, e dalla versione 7 anche le stringhe). \nIl costrutto if permette di svolgere controlli incrociati sfruttando oggetti, espressioni booleane etc.\n" +
                "6. L'operatore ternario può in ogni caso sostituire il costrutto if.\n" +
                "Falso, l'operatore ternario è equivalente ad un'espressione che restituisce un valore. \nIn particolare produce sempre un valore, e questo deve essere per forza assegnato o utilizzato in qualche modo (assegnandolo ad una variabile, passandolo come argomento ad un metodo, etc.). \nPer esempio, se i e j sono due interi, la seguente espressione: i < j ? i : j; provocherebbe un errore in compilazione (oltre a non avere senso), visto che il risultato non viene sfruttato.\n" +
                "7. Il costrutto for può in ogni caso sostituire il costrutto while.\n" +
                "Vero. \n" +
                "8. Il costrutto do può in ogni caso sostituire il costrutto while.\n" +
                "Falso, il do in qualsiasi caso garantisce l'esecuzione della prima iterazione sul codice. Il while potrebbe prescindere da questa soluzione.\n" +
                "9. Il costrutto switch può in ogni caso sostituire il costrutto while.\n" +
                "Falso, lo switch è una condizione non un ciclo.\n" +
                "10. I comandi break e continue possono essere utilizzati nei costrutti switch, for, while e do ma non nel costrutto if.\n" +
                "Falso, il continue non si può utilizzare nello switch ma solo nei cicli.");
    }
}
