package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3s;

public class Esercizio3s {
    public static void main(String args[]){
        System.out.println("Data la classe:\n" +
                "public class Auto {\n" +
                "  public String tipo;\n" +
                "  public Auto(String t) {\n" +
                "      tipo = t;\n" +
                "  }\n" +
                "}\n" +
                "Creare una classe Nave che astragga il concetto di nave che carica automobili. \nQuesta classe deve definire un metodo caricaAuto a cui sarà passato un oggetto Auto. \nOgni oggetto auto verrà immagazzinato in una variabile d’istanza array chiamata autoArray, nel primo posto disponibile dell’array. \nCreare anche una classe di test che è possibile chiamare Esercizio3S.");
        Nave nave = new Nave();
        Auto auto1 = new Auto("Renault");
        Auto auto2 = new Auto("Volkswagen");
        Auto auto3 = new Auto("Nissan");
        nave.caricaAuto(auto1);
        nave.caricaAuto(auto2);
        nave.caricaAuto(auto3);
    }
}
