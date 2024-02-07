package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3p;

public class Esercizio3p {
    public static void main(String args[]){
        System.out.println("Considerando le classi Auto e Autista dell’esercizio precedente, che pezzo di codice bisogna aggiungere alla seguente classe:\n" +
                "public class Esercizio3P {\n" +
                "//Inserisci il codice qui\n" +
                "public static void main(String args[]) {\n" +
                "    Auto auto = new Auto(\"Toyota Yaris\");\n" +
                "    Autista autista = new Autista();\n" +
                "    autista.guida(auto);\n" +
                "  }\n" +
                "}\n" +
                "Scegliere una delle seguenti opzioni:\n" +
                "1. import parcheggio.*;\n" +
                "2. import lavoratori.*;\n" +
                "3. import parcheggio.Auto; e import lavoratori.Autista;\n" +
                "4. Non bisogna aggiungere codice. Il codice è già compilabile.");
        System.out.println("La risposta corretta è la 3 perché sono state utilizzate nel codice entrambe le classi Auto e Autista.");
    }
}
