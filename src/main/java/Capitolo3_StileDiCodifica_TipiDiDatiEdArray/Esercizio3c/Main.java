package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3c;

public class Main {
    public static void main(String args[]){
        System.out.println("Array, Vero o Falso \n" +
                "1. Un array è un oggetto e quindi può essere dichiarato, istanziato ed inizializzato.\n" +
                "Vero. \n" +
                "2. Un array bidimensionale è un array i cui elementi sono altri array.\n" +
                "Vero. \n" +
                "3. Il metodo length restituisce il numero degli elementi di un array.\n" +
                "Falso, la variabile length restituisce il numero degli elementi di un array. \n" +
                "4. Un array non è ridimensionabile.\n" +
                "Vero. \n" +
                "5. Un array è eterogeneo di default.\n" +
                "Falso. \n" +
                "6. Un array di interi può contenere come elementi byte, ovvero le seguenti righe di codice non producono errori in compilazione:\n" +
                "int arr [] = new int[2];\n" +
                "byte a = 1, b = 2;\n" +
                "arr [0] = a;\n" +
                "arr [1] = b;\n" +
                "Vero, un byte (che occupa solo 8 bit) può essere immagazzinato in una variabile int (che occupa 32 bit). \n" +
                "7. Un array di interi può contenere come elementi char, ovvero le seguenti righe di codice non producono errori in compilazione:\n" +
                "char a = 'a', b = 'b';\n" +
                "int arr [] = {a,b};\n" +
                "Vero, un char (che occupa 16 bit) può essere immagazzinato in una variabile int (che occupa 32 bit). \n" +
                "8. Un array di stringhe può contenere come elementi char, ovvero le seguenti righe di codice non producono errori in compilazione:\n" +
                "String arr [] = {'a' , 'b'};\n" +
                "Falso, un char è un tipo di dato primitivo e String è una classe. I due tipi di dati non sono compatibili. \n" +
                "9. Un array di stringhe è un array bidimensionale, perché le stringhe non sono altro che array di caratteri. Per esempio:\n" +
                "String arr [] = {\"a\" , \"b\"};\n" +
                "è un array bidimensionale.\n" +
                "Falso, in Java la stringa è un oggetto istanziato dalla classe String e non un array di caratteri (anche se internamente alla classe, viene usato un array di caratteri). \n" +
                "10. Se abbiamo il seguente array bidimensionale:\n" +
                "int arr [][]= {\n" +
                "{1, 2, 3},\n" +
                "{1,2},\n" +
                "{1,2,3,4,5}\n" +
                "};\n" +
                "risulterà che:\n" +
                "arr.length = 3;\n" +
                "arr[0].length = 3;\n" +
                "arr[1].length = 2;\n" +
                "arr[2].length = 5;\n" +
                "arr[0][0] = 1;\n" +
                "arr[0][1] = 2;\n" +
                "arr[0][2] = 3;\n" +
                "arr[1][0] = 1;\n" +
                "arr[1][1] = 2;\n" +
                "arr[1][2] = 3;\n" +
                "arr[2][0] = 1;\n" +
                "arr[2][1] = 2;\n" +
                "arr[2][2] = 3;\n" +
                "arr[2][3] = 4;\n" +
                "arr[2][4] = 5;\n" +
                "Falso, tutte le affermazioni sono giuste tranne arr[1][2] = 3; perché questo elemento non esiste.");
    }
}
