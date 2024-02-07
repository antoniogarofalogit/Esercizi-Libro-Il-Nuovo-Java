package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3z;

import java.util.Arrays;

public class Pagella {
    public Studente studente;
    public String[][] tabellaVoti;

    public Pagella(Studente stu, String [][] tab) {
        studente = stu;
        tabellaVoti = tab;
    }

    public void stampaPagella() {
        System.out.println(studente.toString());
        System.out.println(Arrays.toString(tabellaVoti[0]));
        System.out.println(Arrays.toString(tabellaVoti[1]));
        System.out.println(Arrays.toString(tabellaVoti[2]));
        System.out.println(Arrays.toString(tabellaVoti[3]));
        System.out.println(Arrays.toString(tabellaVoti[4]));
        System.out.println(Arrays.toString(tabellaVoti[5]));
        System.out.println(Arrays.toString(tabellaVoti[6]));
    }
    /* Si noti che questa classe dichiara un oggetto studente e un array bidimensionale tabellaVoti, entrambi da impostare quando si istanzia l’oggetto con il costruttore fornito.
    Inoltre dichiara il metodo stampaPagella che usa il metodo statico toString della classe java.util.Arrays per formattare il contenuto di ogni "riga" dell’array bidimensionale tabellaVoti.
    * */
}
