package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3s;

public class Nave {
    int indice = 0;
    public Auto[] autoArray;

    public Nave() {
        autoArray = new Auto[100];
    }

    public void caricaAuto(Auto auto) {
        autoArray[indice] = auto;
        System.out.println("Auto: " + auto.tipo + " caricata");
        indice++;
    }
    /*Dove abbiamo usato un indice per tenere traccia delle posizioni già occupate nella nave.
    Questo viene incrementato ogni volta che viene caricata un'auto, e poi sfruttato per caricare la prossima*/
}
