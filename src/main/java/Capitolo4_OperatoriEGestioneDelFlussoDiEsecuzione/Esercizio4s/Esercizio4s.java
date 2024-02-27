package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4s;

public class Esercizio4s {
    private static int matrice[][] = {
            {1, 7, 3, 9, 5, 3},
            {6, 2, 3},
            {7, 5, 1, 4, 0},
            {1, 0, 2, 9, 6, 3, 7, 8, 4}
    };

    public static void main(String args[]) {
        System.out.println("La soluzione dell'esercizio precedente fallisce nel momento in cui:\n" +
                "• non si specifica un argomento da riga di comando;\n" +
                "• si specifica da riga di comando un argomento intero che non rientra nel range 0-9;\n" +
                "• si specifica da riga di comando un argomento che non è un numero intero;\n" +
                "Aggiungere, alla soluzione dell'esercizio 4.r, il codice che gestisce i tre casi (specificando un messaggio con le istruzioni da seguire per il corretto utilizzo).\n");
        int numeroDaTrovare = controllaArgomento(args);
        if (numeroDaTrovare == -1) {
            System.out.println("Specificare un numero intero compreso tra"
                    + " 0 e 9");
            return;
        }
        PRIMA_LABEL:
        for (int i = 0; i < matrice.length; i++) {
            int[] riga = matrice[i];
            for (int j = 0; j < riga.length; j++) {
                if (riga[j] == numeroDaTrovare) {
                    System.out.println(numeroDaTrovare + " trovato a riga = "
                            + ++i + ", colonna = " + ++j);
                    break PRIMA_LABEL;
                }
            }
        }
        System.out.println("Ricerca terminata");
        System.out.println("Si noti che abbiamo delegato al metodo controllaArgomento la correttezza dell'input specificato dall'utente.\n Tale metodo ritorna il valore specificato, oppure, nel caso non sia corretto, il valore -1.\n Come è possibile vedere dal codice del metodo main, nel caso il valore ritornato dal metodo controllaArgomento sia -1, viene stampato un messaggio di istruzioni per l'utente, e con l'istruzione return, si esce dal metodo.\n Si noti che il metodo main ritorna void, quindi per uscire dal metodo si usa l'istruzione return senza specificare cosa ritornare.\n" +
                "Analizziamo ora il metodo controllaArgomento.\n Con il primo if abbiamo dapprima controllato che la lunghezza dell'array args sia 1, ovvero che sia stato specificato un unico argomento, utilizzando la variabile length dell'array (cfr. paragrafo 3.6.5).\n Con il secondo if abbiamo controllato che la lunghezza della stringa args[0] sia esattamente 1.\n Abbiamo sfruttato la chiamata al metodo length della classe String (da non confondersi con la variabile length dell'array).\n Il ciclo for seguente esegue un ciclo su valori che vanno da 0 a 9, e controlla che args[0] coincida con uno dei valori.\n Nel momento in cui trova una corrispondenza, il valore corrente viene ritornato dopo averlo convertito a intero mediante la chiamata al metodo statico della classe Integer parseInt (cfr. esercizio 3.t).\n Se invece nel ciclo for non si trovano corrispondenze, per esempio perché è stata specificata una lettera o un simbolo (quindi non un intero compreso tra 0 e 9), allora il ciclo terminerà e sarà ritornato il valore -1.");
    }

    private static int controllaArgomento(String[] args) {
        if (args.length == 1) {
            if (args[0].length() == 1) {
                for (int i = 0; i < 10; i++) {
                    if (args[0].equals("" + i)) {
                        return Integer.parseInt(args[0]);
                    }
                }
            }
        }
        return -1;
    }
}
