package Capitolo3_StileDiCodifica_TipiDiDatiEdArray.Esercizio3x;

public class Rubrica {
    public Contatto[] contatti;

    public Rubrica() {
        contatti = new Contatto[]{
                new Contatto("Claudio De Sio Cesari", "Via Java 13", "131313131313"),
                new Contatto("Stevie Wonder", "Via Musica 10", "1010101010"),
                new Contatto("Gennaro Capuozzo", "Piazza Quattro Giornate 1",
                        "1111111111")};
    }
}