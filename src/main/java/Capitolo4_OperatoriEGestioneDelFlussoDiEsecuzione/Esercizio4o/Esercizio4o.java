package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4o;

public class Esercizio4o {
    public static void main(String args[]) {
        System.out.println("Qual'è l'output del seguente programma?");
        int i = 99;
        if (i++ >= 100) {
            System.out.println(i+=10);
        } else {
            System.out.println(--i==99?i++:++i);
        }
    System.out.println("La risposta corretta è: 99.\n" +
            "Infatti i inizialmente vale 99.\n Poi nella condizione del primo if, viene usato un operatore di post-incremento, il quale avendo minore priorità rispetto all'operatore >= viene eseguito dopo di esso.\n Questo implica che i vale ancora 99 quando viene testato se è >= 100, e solo dopo il test viene incrementato a 100.\n Quindi la condizione dell'if è false, e non viene eseguito il relativo blocco di codice.\n Quindi viene eseguito il blocco di codice della clausola else.\n Qui viene stampato il risultato di un operatore ternario.\n Infatti viene decrementato il valore di i da 100 a 99, e quindi l'operatore ternario ritorna il primo valore, ovvero i++.\n Anche in questo caso si tratta di un operatore di post-incremento (a bassa priorità), e quindi viene prima stampato il valore di i (99) e poi incrementata la variabile (ma tanto il programma termina subito dopo).");
    }
}

