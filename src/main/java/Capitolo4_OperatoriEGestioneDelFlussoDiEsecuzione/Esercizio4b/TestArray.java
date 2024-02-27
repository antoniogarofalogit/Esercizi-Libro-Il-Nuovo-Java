package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4b;

public class TestArray {
    public static void main(String args[]){
        System.out.println("Scrivere un'applicazione che stampi i 26 caratteri dell'alfabeto (inglese) con un ciclo.");
        for (int i = 0; i < 26; ++i) {
            char c = (char)('a' + i);
            System.out.println(c);
        }
        System.out.println("Si esegue un ciclo con l'indice i che varia da 0 a 25. \nAggiungendo al carattere 'a' il valore dell'indice i (che ad ogni iterazione si incrementa di un'unità), otterremo gli altri caratteri dell'alfabeto. \nIl cast a char è necessario perché la somma tra un carattere ed un intero viene promosso ad intero.");
    }
}
