package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2g;

public class Quadrato {
    public final int NUMERO_LATI = 4;

    public int lato;

    public int perimetro() {
        int perimetro = lato * NUMERO_LATI;
        return perimetro;
    }

    public int area() {
        int area = lato * lato;
        return area;
    }
}
