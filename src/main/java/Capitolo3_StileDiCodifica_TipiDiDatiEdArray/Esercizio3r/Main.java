package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3r;

public class Main {
    public static void main(String args[]){
        System.out.println("Scrivere un programma che prenda in input un argomento (variabile args del metodo main) e lo immagazzini come terzo elemento di un array di stringhe locale chiamato per l’appunto array.");
        String array[] = new String[5];
        array[2] = args[0];
    }
}
