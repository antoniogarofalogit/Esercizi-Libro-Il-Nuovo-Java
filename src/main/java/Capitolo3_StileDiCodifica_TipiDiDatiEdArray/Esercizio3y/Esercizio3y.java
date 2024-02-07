package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3y;

public class Esercizio3y {
    public static void main(String args[]){
        System.out.println("Quali dei seguenti snippet può essere compilato senza errori:\n" +
                "1. public class var {}\n" +
                "2. private class var {}\n" +
                "3. public var MiaClasse {}\n" +
                "4. var var[] = new int[8];\n" +
                "5. public var var = 1;");
        System.out.println("Nessuno snippet è corretto. I numeri 1 e 2 riportano classi con identificatore var, ma non è possibile utilizzare la parola var come identificatore per i tipi. \nInoltre nel caso dello snippet numero 2, non è neanche possibile utilizzare la parola chiave private per definire una classe. \nNello snippet 3, c’è una sintassi che prova a definire una classe usando la parola chiave var al posto della parola chiave class, ma non è questa la funzione per cui è stata creata la parola var. \nNel quarto snippet si prova ad utilizzare la parola var come identificatore di un array, viene specificato chiaramente che questo è illegale. \nInfine nello snippet numero 5, possiamo dedurre dalla presenza del modificatore public, che si tratta di una definizione di una variabile d’istanza e non di una variabile locale, e quindi l’utilizzo della parola var non è consentito.");
    }
}
