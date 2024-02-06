package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2i;

import Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2h.Rettangolo;

public class TestRettangolo {
public static void main(String args[]){
    System.out.println("Creare una classe TestRettangolo che contenga un metodo main e che testi la classe Rettangolo, equivalentemente a come abbiamo fatto nell’esercizio 2.f. Questa volta si istanzino almeno due rettangoli diversi.");
    Rettangolo rettangolo1 = new Rettangolo(5,6);
    Rettangolo rettangolo2 = new Rettangolo(8,9);
    System.out.println("Perimetro del rettangolo 1 = "
            + rettangolo1.perimetro());
    System.out.println("Area del rettangolo 1 = "
            + rettangolo1.area());
    System.out.println("Perimetro del rettangolo 2 = "
            + rettangolo2.perimetro());
    System.out.println("Area del rettangolo 2 = "
            + rettangolo2.area());
}
}
