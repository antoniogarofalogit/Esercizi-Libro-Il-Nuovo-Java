package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4l;

public class TestaOCroceTest {
    public static void main(String args[]) {
        System.out.println("Sfruttando la classe PariODispari creata nell'esercizio precedente, creare una classe chiamata TestaOCroce che definisca un metodo chiamato dammiTestaOCroce che utilizzando un'espressione switch, restituisca la stringa \"Testa\" o \"Croce\". Creare anche una classe di test che invocando tale metodo stampi il risultato.\n");
        TestaOCroce testaOCroce = new TestaOCroce();
        System.out.println(testaOCroce.dammiTestaOCroce());
    }
}
