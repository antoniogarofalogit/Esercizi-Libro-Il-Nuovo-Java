package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3u;

import java.util.Arrays;

public class Esercizio3u {
    public static void main(String args[]){
        System.out.println("Creare un programma che:\n" +
                "\n" +
                "• crei un array di tipi carattere, con tutte le lettere dell’alfabeto;\n" +
                "• utilizzi un metodo (statico) della classe java.util.Arrays per stampare il suo contenuto sotto forma di stringa. Cercare nella documentazione ufficiale il metodo adatto allo scopo.");
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'z'};
        System.out.println(Arrays.toString(array));
        System.out.println("Il metodo toString della classe Arrays era il metodo richiesto. Per utilizzarlo è necessario importare la classe Arrays.");
    }
}
