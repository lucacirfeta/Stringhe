import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digita la prima parola: ");
        String prima = s.nextLine() + " ";
        System.out.print("Digita la seconda parola: ");
        String seconda = s.nextLine();

        System.out.println("--------------------------------------");

        confronto(prima, seconda);
        concat(prima, seconda);
        convert(prima, seconda);
        conteggio(prima, seconda);
        sottoString(prima, seconda);
        conteggio(prima, seconda);

    }

    public static void confronto(String a, String b) {
        System.out.println("Esegue il confronto");
        System.out.println("Le due parole sono uguali? " + a.equals(b));

        System.out.println("--------------------------------------");

    }

    public static void concat(String a, String b) {
        System.out.println("Esegue la concatenazione");
        String c = a.concat(b);
        System.out.println(a + " e " + b + " concatenate le due parole formano: " + c);
        System.out.println("--------------------------------------");

    }

    public static void convert(String a, String b) {
        System.out.println("Esegue la conversione");
        Scanner s = new Scanner(System.in);

        System.out.print("Vuoi convertire le parole in maiuscolo '1' o in minuscolo '2'? ");
        String scelta = s.nextLine();

        try {
            if (scelta.equals("1")) {
                System.out.println(a.toUpperCase());
                System.out.println(b.toUpperCase());
            } else if (scelta.equals("2")) {
                System.out.println(a.toLowerCase());
                System.out.println(b.toLowerCase());
            }
        } catch (NoSuchElementException e) {
            System.out.println("Scelta non valida!");

        }

    }

    public static void sottoString(String a, String b) {
        Scanner s = new Scanner(System.in);

        String c = a.concat(b);
        String[] split = c.split(" ");
        System.out.print("Digita la parola da trovare: ");
        String primaPar = s.nextLine();

        boolean trovato = false;

        for (String string : split) {
            if (string.equals(primaPar)) {
                trovato = true;
                break;
            }
        }
        if (trovato) {
            System.out.println("La parola è stata trovata!");
        } else {
            System.out.println("La parola non è stata trovata!");
        }
    }


    public static void conteggio(String a, String b) {
        String c = a.concat(b);
        String[] split = c.split(" ");

        int contParole = 0;
        int contChar = 0;

        for (int i = 0; i < split.length; i++) {
            contParole++;
        }
        for (int j = 0; j < contParole; j++) {
            contChar++;
        }
        System.out.println("Nella frase ci sono " + contParole + " parole");
        System.out.println("Nella frase ci sono " + contChar + " caratteri senza spazi vuoti");

    }

}