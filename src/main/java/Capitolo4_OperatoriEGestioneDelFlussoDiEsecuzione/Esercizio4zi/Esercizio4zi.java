package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4zi;

public class Esercizio4zi {
    public static void main(String[] args) {
        System.out.println("Sfruttano la proprietà dei tipi char di essere compatibili con il tipo intero, scrivere una classe con il metodo main, che sfruttando un ciclo for, inizializzi la seguente variabile:\n" +
                "char alfabeto [] = new char[26];\n" +
                "I caratteri dell'alfabeto sono 26 e non 21 perché contiamo anche i caratteri j, k, w, x e y.\n");
        char alfabeto [] = new char[26];
        int i = 0;
        for (char c = 'a'; c <= 'z'; c++, i++) {
            alfabeto[i] = (char)c;
        }
        System.out.println(alfabeto);
    }
}
