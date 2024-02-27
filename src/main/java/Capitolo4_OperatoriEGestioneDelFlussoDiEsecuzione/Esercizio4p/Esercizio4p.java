package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4p;

public class Esercizio4p {
    public static void main(String args[]) {
        System.out.println("Qual'è l'output del seguente programma?");
        int i = 22;
        int j = i++%3;
        i = j!=0?j:i;
        switch (i) {
            case 1:
                System.out.println(8<<2);
            case 0:
                System.out.println(8>>2);
                break;
            case 2:
                System.out.println(i!=j);
                break;
            case 3:
                System.out.println(++j);
                break;
            default:
                System.out.println(i++);
                break;
        }
    System.out.println("La risposta corretta è: 32 e al rigo successivo 2, ovvero l'output è il seguente:\n" +
            "32\n" +
            "2\n" +
            "Infatti inizialmente i vale 22, e j vale quanto il resto di 22 (e non 23 perché il post-incremento viene applicato dopo l'operatore modulo %) diviso 3, ovvero 1.\n Dopodiché ad i viene assegnato il valore di ritorno dell'operatore ternario che controlla se j!=0 (e lo è).\n Quindi viene ritornato il valore di j che è 1.\n Nel costrutto switch si entra nel case 1 dove viene stampato 8<<2, che equivale a 8 moltiplicato per 2 alla seconda, ovvero 32.\n Inoltre viene eseguito anche il case 0, visto che non c'è un break che fa uscire dal costrutto.\n Quindi viene stampato 8>>2 che equivale a 8 diviso 2 alla seconda, ovvero 2.");
    }
}

