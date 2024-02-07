package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3f;

public class TestRisultatoFloat {
    public static void main(String args[]){
        System.out.println("Dopo aver svolto l’esercizio precedente, aggiungere alla classe CambiaRisultato un metodo che si chiama sempre cambiaRisultato che però prende in input una variabile float e ne modifica il risultato.\n" +
                "Creare poi una classe TestRisultatoFloat equivalente, che esegua le stesse operazioni della classe TestRisultato realizzata nell’esercizio precedente.");
        float risultato = 5.0F;
        System.out.println(risultato);
        CambiaRisultato cr = new CambiaRisultato();
        risultato = cr.cambiaRisultato(risultato);
        System.out.println(risultato);
    }
}
