package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2e;

import Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2d.Quadrato;

public class TestQuadrato {
    public static void main(String args[]){
        System.out.println("Creare una classe TestQuadrato che contenga un metodo main che istanzi un oggetto di tipo Quadrato, con lato di valore 5. Quindi stampare il perimetro e l’area dell’oggetto appena creato.");
            Quadrato quadrato = new Quadrato();
            quadrato.lato = 5;
            int perimetro = quadrato.perimetro();
            System.out.println(perimetro);
            int area = quadrato.area();
            System.out.println(area);
            System.out.println("Si noti che abbiamo creato le variabili locali perimetro e area con lo stesso nome del metodo, e questo non è un problema.\n Infatti il nome di un metodo si differenzia sempre dal nome di una variabile perché dichiarato con parentesi tonde.\n Avremmo anche potuto chiamare in modo diverso le variabili, ma è buona norma che i nomi siano auto-esplicativi.\n Tuttavia potevamo anche evitare completamente l’uso di queste variabili se avessimo scritto la classe in questo modo:\n" +
                    "public class TestQuadrato {\n" +
                    "    public static void main(String args[]) {\n" +
                    "      Quadrato quadrato = new Quadrato();\n" +
                    "      quadrato.lato = 5;\n" +
                    "      System.out.println(quadrato.perimetro());\n" +
                    "      System.out.println(quadrato.area());\n" +
                    "  }\n" +
                    "}");
        }
    }


