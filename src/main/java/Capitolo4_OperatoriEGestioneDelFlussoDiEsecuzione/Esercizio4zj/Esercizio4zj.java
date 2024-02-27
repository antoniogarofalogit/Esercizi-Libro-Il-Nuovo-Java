package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4zj;

public class Esercizio4zj {
    public static void main(String[] args) {
        System.out.println("Considerato la soluzione dell'esercizio 4.jj, aggiungere il ciclo più semplice che stampa tutti gli elementi dell'array alfabeto.\n");
        char alfabeto [] = new char[26];
        int i = 0;
        for (char c = 'a'; c <= 'z'; c++, i++) {
            alfabeto[i] = (char)c;
        }
        for (char lettera : alfabeto) {
            System.out.println(lettera);
        }
    }
}
