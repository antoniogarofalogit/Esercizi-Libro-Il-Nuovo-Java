package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3l;

public class Main {
    public static void main(String args[]){
        System.out.println("Data la seguente classe:\n" +
                "public class Esercizio3L {\n" +
                "    public static void main(String args[]) {\n" +
                "      bit i1 = 8;\n" +
                "      short i2 = -1024;\n" +
                "      integer i3 = 638;\n" +
                "      long i5 = 888_666_777;\n" +
                "      float i6 = 0;\n" +
                "      double i7 = 0x11B;\n" +
                "  }\n" +
                "}\n" +
                "Le variabili all’interno del metodo main sono tutte dichiarate correttamente? E i valori assegnati sono tutti entro l’intervallo di rappresentazione dei rispettivi tipi?");
                System.out.println("I tipi bit e integer non esistono (semmai esistono byte e int). \nTutti i valori dichiarati rientrano nei rispettivi intervalli di rappresentazione, compreso il valore 0x11B che vale 283.0 per il sistema decimale e che, essendo immagazzinato in un double, è assolutamente compatibile.");
    }
}
