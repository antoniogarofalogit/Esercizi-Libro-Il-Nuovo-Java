package Capitolo2_ComponentiFondamentaliDiUnProgrammaJava.Esercizio2l;

public class Esercizio2l {
    public static void main(String args[]){
        System.out.println("Si astragga con una classe il concetto di Nazione, creando almeno un costruttore e delle variabili d’istanza, ma nessun metodo.");
        System.out.println("L’astrazione, pur essendo molto generica sembra corretta. L’unico costruttore definito implica la specificazione in fase di istanza dei tre parametri in input, che abbiamo quindi imposto essere obbligatori. Infatti quando istanziamo un oggetto Nazione, dobbiamo specificare i parametri di input del costruttore:");
        Nazione italia = new Nazione("Italia", "Roma", 6000000);
    }
}
