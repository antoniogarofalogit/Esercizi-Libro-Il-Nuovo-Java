package Capitolo4_OperatoriEGestioneDelFlussoDiEsecuzione.Esercizio4m;

import java.util.Scanner;

public class Moderatore {
    public static void main(String args[]){
        System.out.println("Si consideri il seguente codice:\n" +
                "import java.util.Scanner;\n" +
                "public class ProgrammaInterattivo {\n" +
                "    public static void main(String args[]) {\n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "        String stringa = \"\";\n" +
                "        System.out.println(\"Digita qualcosa e batti enter, oppure scrivi \"\n" +
                "          + \"\\\"fine\\\" per terminare il programma\");\n" +
                "        while(!(stringa = scanner.next()).equals(\"fine\")) {\n" +
                "            System.out.println(\"Hai digitato \" + stringa.toUpperCase() + \"!\");\n" +
                "        }\n" +
                "        System.out.println(\"Fine programma!\");\n" +
                "    }\n" +
                "}\n" +
                "Questa classe legge l'input da tastiera mediante la classe Scanner del package java.util. Il metodo next usato nel costrutto while (con una sintassi complessa che comprende anche l'assegnazione alla variabile stringa) è un metodo bloccante (ovvero che blocca l'esecuzione del codice in attesa di input da parte dell'utente) che legge l'input da tastiera sino a quando si preme il tasto \"enter\" (\"invio\"). Il programma termina quando si digita la parola \"fine\".\n" +
                "Attenzione che i metodi bloccanti di Scanner leggono le pressioni dei tasti. Questo significa che a volte troveremo caratteri non riconosciuti in output, in corrispondenza della pressione di tasti come \"Maiuscolo\", o \"Canc\".\n" +
                "Modificare il programma precedente in modo tale che diventi un moderatore di parole, ovvero che censuri alcune parole digitate.\n" +
                "Eseguire l'esercizio solo censurando le parole digitate singolarmente (non all'interno di una frase), a meno che non si è convinti di essere in grado di farlo (eventualmente la documentazione è come sempre a vostra disposizione per cercare metodi utili alla causa).\n");
            Scanner scanner = new Scanner(System.in);
            String stringa = "";
            System.out.println("Digita qualcosa e batti enter, oppure scrivi "
                    + "\"fine\" per terminare il programma");
            while (!(stringa = scanner.next()).equals("fine")) {
                stringa = moderaStringa(stringa);
                System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
            }
            System.out.println("Fine programma!");
        }

        private static String moderaStringa(String stringa) {
            switch (stringa) {
                case "accipicchiolina":
                case "perbacco":
                case "stupidino":
                case "giulivo":
                case "giocondo":
                case "perdindirindina":
                    stringa = "CENSURATA!";
                    break;
                default:
                    break;
            }
            return stringa;
        }
}
