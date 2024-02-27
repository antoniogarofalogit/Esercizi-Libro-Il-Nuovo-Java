package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4r;

public class Esercizio4r {
    private static int matrice[][] = {
            {1, 7, 3, 9, 5, 3},
            {6, 2, 3},
            {7, 5, 1, 4, 0},
            {1, 0, 2, 9, 6, 3, 7, 8, 4}
    };

    public static void main(String args[]) {
        System.out.println("Implementare il metodo main in modo che legga un numero (tra 0 e 9) come parametro args[0],\n e trovi la posizione (riga e colonna) della prima occorrenza del numero specificato all'interno dell'array bidimensionale denominato matrice.");
        int numeroDaTrovare = Integer.parseInt(args[0]);
        PRIMA_LABEL:
        for (int i = 0; i < matrice.length; i++) {
            int[] riga = matrice[i];
            for (int j = 0; j < riga.length; j++) {
                if (riga[j] == numeroDaTrovare) {
                    System.out.println(numeroDaTrovare +" trovato a riga = "
                            + ++i + ", colonna = " + ++j);
                    break PRIMA_LABEL;
                }
            }
        }
        System.out.println("Ricerca terminata");
        System.out.println("Abbiamo dapprima dovuto convertire args[0] tramite il metodo statico della classe Integer parseInt (cfr. esercizio 3.t) immagazzinandolo in una variabile numeroDaTrovare.\n Poi abbiamo utilizzato un doppio ciclo innestato per navigare all'interno delle celle della matrice, sfruttando gli indici i (per le righe) e j (per le colonne).\n Si noti l'utilizzo della label che abbiamo chiamato PRIMA_LABEL, che marca il ciclo esterno.\n Quando viene trovata la prima occorrenza del numero da trovare, l'istruzione:\n" +
                "break PRIMA_LABEL;\n" +
                "fa terminare anche il ciclo esterno, e il programma continua stampando il messaggio Ricerca terminata, e poi termina.");
    }
}
