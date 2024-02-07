package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3t;

public class Esercizio3t {
    public static void main(String args[]){
        System.out.println("Creare un programma Esercizio3T che deve essere eseguito passando un parametro da riga di comando rappresentante un numero intero, nel seguente modo:\n" +
                "java Esercizio3T 9\n" +
                "Con EJE è possibile passare parametri con la scorciatoia di tastiera \"Maiuscolo - F9\", ovvero con il menu \"esegui con argomenti\" (\"execute with args\").\n" +
                "Si può sostituire il numero intero 9 con un qualsiasi altro numero intero.\n" +
                "Il programma dovrà:\n" +
                "• utilizzare args[0], che contiene un numero intero, per creare un array di interi della stessa dimensione dell’argomento;\n" +
                "• stampare una frase che confermerà la creazione dell’array, stampandone la dimensione.\n" +
                "Visto che i parametri vengono immagazzinati negli elementi dell’array di stringhe args, bisogna convertire il parametro passato in input da stringa ad intero. Cercare nella libreria il metodo parseInt della classe Integer. Leggere la documentazione, capire come funziona ed utilizzarlo nel programma.");
        int dimensioneArray = Integer.parseInt(args[0]);
        int [] array = new int[dimensioneArray];
        System.out.println("L'array ha dimensione " + array.length);
        System.out.println("Si noti che il metodo parseInt è statico e può essere utilizzato con la sintassi: nomeClasse.parseInt, ma è possibile anche istanziare un oggetto e invocarlo come un normale metodo (ma è inutile istanziare l’oggetto).");
    }
}
