package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3g;

public class TestArgs {
    public static void main(String args[]){
        System.out.println("Creare una classe TestArgs con un metodo main che stampa la variabile args[0]. Quindi testarla passando vari input da riga di comando (cfr. paragrafo 3.6.7).\n");
        System.out.println(args[0]);
        System.out.println("Si noti che se non passate un argomento quando eseguite l’applicazione otterrete un’eccezione al runtime:\n" +
                "java TestArgs\n" +
                "Exception in thread \"main\" java.lang.ArrayIndexOutOfBoundsException: 0\n" +
                "\tCapitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3g.TestArgs.main(TestArgs.java:6)");
    }
}
