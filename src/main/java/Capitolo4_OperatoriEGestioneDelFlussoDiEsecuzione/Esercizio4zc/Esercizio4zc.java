package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4zc;

public class Esercizio4zc {
    public static void main(String[] args) {
        System.out.println("jshell> public int a;\n" +
                "a ==> 0\n" +
                "jshell> private String a\n" +
                "a ==> null\n" +
                "jshell> /reset\n" +
                "|  Resetting state.\n" +
                "jshell> /list\n");
        System.out.println("L'output del comando list sarà vuoto. Infatti il comando reset avrà resettati tutti gli snippet immessi.");
    }
}
