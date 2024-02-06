package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2d;

public class Quadrato {
    public int lato;

    public int perimetro() {
        int perimetro = lato * 4;
        return perimetro;
    }

    public int area() {
        int area = lato * lato;
        return area;
    }
    public Quadrato(){}
    public Quadrato(int l){
      lato = l;
    }
}
