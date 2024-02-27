package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4a;

public class TestPari {
    public static void main(String args[]){
        System.out.println("Scrivere un semplice programma, costituito da un'unica classe, che sfruttando esclusivamente un cicloinfinito, l'operatore modulo, due costrutti if, un break ed un continue, stampi solo i primi cinque numeri pari.");
        int i = 0;
        while (true) {
            i++;
            if (i > 10)
                break;
            if ((i % 2) != 0)
                continue;
            System.out.println(i);
        }
        System.out.println("Nel metodo main dichiariamo prima una variabile i che fa da indice e che inizializziamo a 0. \nPoi dichiariamo il ciclo infinito while, la cui condizione è sempre true. \nAll'interno del ciclo incrementiamo subito di un'unità il valore della variabile i. \nPoi controlliamo se il valore della suddetta variabile è maggiore di 10, se la risposta è sì, il costrutto break seguente ci farà uscire dal ciclo che doveva essere infinito, e di conseguenza il programma terminerà subito dopo. \nNel caso invece i valesse meno di 10, utilizzando l'operatore modulo (%) si controlla se il resto della divisione tra i e 2 è diverso da 0. \nMa tale resto sarà diverso da 0 se e solo se i è un numero dispari. \nSe quindi il numero è dispari, con il costrutto continue passeremo alla prossima iterazione partendo dalla prima istruzione del ciclo while (i++). \nSe invece i è un numero pari, allora esso verrà stampato.");
    }
}
