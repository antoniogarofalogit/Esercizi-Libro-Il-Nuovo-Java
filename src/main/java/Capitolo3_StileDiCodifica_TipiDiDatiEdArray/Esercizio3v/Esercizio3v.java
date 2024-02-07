package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3v;

import java.util.Random;

public class Esercizio3v {
    public static void main(String args[]){
        System.out.println("Creare una classe con metodo main, che quando viene lanciata, stampi un numero casuale di tipo intero.");
        Random ran = new Random();
        System.out.println(ran.nextInt());
    }
}
