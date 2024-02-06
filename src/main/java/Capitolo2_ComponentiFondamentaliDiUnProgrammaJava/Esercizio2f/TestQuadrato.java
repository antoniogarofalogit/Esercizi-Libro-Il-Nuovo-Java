package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2f;

import Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2d.Quadrato;

public class TestQuadrato {
    public static void main(String args[]){
        System.out.println("Dopo aver svolto l’esercizio precedente, dovreste aver impostato la variabile lato a mano con un'istruzione come la seguente:\n" +
                "nomeOggetto.lato = 5;\n" +
                "Per poter evitare questa istruzione si crei un costruttore nella classe Quadrato dell’esercizio 2.d, che prenda in input il valore della variabile lato.\n Dopo aver finito, si compili la classe Quadrato. La classe TestQuadrato invece, non compilerà più per via dell’istruzione specificata sopra e per il mancato utilizzo del nuovo costruttore.\n Si modifichi il codice della classe TestQuadrato in modo tale che compili e sia eseguita correttamente.");
        Quadrato quadrato = new Quadrato(5);
        int perimetro = quadrato.perimetro();
        System.out.println(perimetro);
        int area = quadrato.area();
        System.out.println(area);
    }
}
