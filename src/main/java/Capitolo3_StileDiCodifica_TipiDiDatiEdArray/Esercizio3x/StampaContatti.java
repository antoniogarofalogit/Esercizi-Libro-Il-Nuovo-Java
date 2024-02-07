package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3x;

public class StampaContatti {
    public static void main(String args[]) {
        System.out.println("Elenco Contatti");
        System.out.println();
        Rubrica rubrica = new Rubrica();
        rubrica.contatti[0].stampaDettagli();
        rubrica.contatti[1].stampaDettagli();
        rubrica.contatti[2].stampaDettagli();
    }
}
