package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4e;

public class TestArgs {
    public static void main(String args[]){
        System.out.println("Modificare la classe TestArgs creata nell'esercizio 3.g, in modo tale da evitare eccezioni al runtime, con un costrutto imparato in questo capitolo.");
        if (args.length == 1) {
            System.out.println(args[0]);
        } else {
            System.out.println("Specificare un valore da riga di comando");
        }
    }
}
