package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2z;

public class Esercizio2z {
    public static void main(String args[]){
        System.out.println("Creare una classe che astragga il concetto di \"città\", chiamandola Citta (Java non supporta le lettere accentate per i nomi). Dopodiché dichiarare una classe Nazione che dichiari una variabile d’istanza capitale di tipo Citta. Infine creare una classe Esercizio2Z che istanzi una Nazione con una capitale, e stampi una frase che verifichi l’effettiva associazione tra la nazione e la capitale.");
        Citta capitale = new Citta("Roma");
        Nazione italia = new Nazione("Italia", capitale, 60_000_000);
        System.out.println("L'" + italia.nome
                + " ha come capitale " + italia.capitale.nome);
    }
}
