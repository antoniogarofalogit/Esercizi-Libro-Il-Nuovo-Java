package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3e;

public class TestRisultato {
    public static void main(String args[]){
        System.out.println("Creare una classe Risultato che dichiara una sola variabile d’istanza di tipo float di nome risultato. \n Aggiungere eventuali metodi e costruttori utili. Creare una classe CambiaRisultato che dichiara un metodo public di nome cambiaRisultato che prende in input un oggetto di tipo Risultato e ne modifica la variabile interna risultato sommandola con un altro valore. \n Creare una classe con un metodo main di nome TestRisultato che stampi la variabile risultato di un oggetto di tipo Risultato, prima e dopo che questo oggetto sia passato in input al metodo cambiaRisultato di un oggetto di tipo CambiaRisultato.");
    Risultato ris = new Risultato(5F);
    ris.stampa();
    CambiaRisultato cambiaRis = new CambiaRisultato();
    cambiaRis.cambiaRisultato(ris);
    ris.stampa();
    }
}
