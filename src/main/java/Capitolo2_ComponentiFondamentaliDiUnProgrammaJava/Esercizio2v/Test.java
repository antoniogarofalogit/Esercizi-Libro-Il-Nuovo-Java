package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2v;

public class Test {
    public static void main(String args[]){
        System.out.println("Si crei una classe di nome Esercizio2V che consenta di ottenere la somma 2, 3, 5 e 10 numeri interi.");
        Esercizio2v es = new Esercizio2v();
        System.out.println(es.somma2Int(1,1));
        System.out.println(es.somma5Int(1,1,1,1,1));
        System.out.println(es.somma10Int(1,1,1,1,1,1,1,1,1,1));
    }
}
