package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3za;

public class CalcolaAreaTriangolo {
    public static void main(String args[]){
        System.out.println("Creare una classe CalcolaAreaTriangolo, che calcola l’area di un triangolo che abbia come base il valore 3.8, come altezza il valore 5.4, e ne stampi il risultato. \nUsare solo una classe con metodo main, che dichiari delle variabili in maniera leggibile.");
        double base = 3.8;
        double altezza = 5.4;
        double areaTriangolo = (base * altezza)/2;
        System.out.println("L'area del triangolo è: " + areaTriangolo);
        System.out.println("Notare che le variabili double, possono avere come valore un numero decimale (notare che al posto della virgola viene utilizzato un punto, perché questo è lo standard negli Stati Uniti).\n" +
                "Non è possibile però assegnare un numero decimale ad una variabile di tipo int, per esempio l’istruzione:\n" +
                "int base = 3.8;\n" +
                "provocherebbe il seguente errore in compilazione:\n" +
                "error: incompatible types: possible lossy conversion from double to int\n" +
                "          int base = 3.8;\n" +
                "                     ^\n" +
                "  1 error");
    }
}
