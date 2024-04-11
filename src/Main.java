import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digita la prima parola: ");
        String prima = s.nextLine();
        System.out.print("Digita la seconda parola: ");
        String seconda = s.nextLine();

        System.out.println("--------------------------------------");

        Main m = new Main();

        m.confronto(prima, seconda);
        m.concat(prima, seconda);
        m.convert(prima, seconda);
    }

    public void confronto(String a, String b) {
        System.out.println("Esegue il confronto");
        System.out.println("Le due parole sono uguali? " + a.equals(b));

        System.out.println("--------------------------------------");

    }

    public void concat(String a, String b) {
        System.out.println("Esegue la concatenazione");
        System.out.println(a + " e " + b + " concatenate le due parole formano formano: " + a.concat(b));

        System.out.println("--------------------------------------");

    }

    public void convert(String a, String b) {
        System.out.println("Esegue la conversione");
        Scanner s = new Scanner(System.in);

        System.out.print("Vuoi convertire le parole in maiuscolo o in minuscolo?");
        String scelta = s.nextLine();

        switch (scelta) {
            case "maiuscolo" -> {
                System.out.println(a.toUpperCase());
                System.out.println(b.toUpperCase());
            }
            case "minuscolo" -> {
                System.out.println(a.toLowerCase());
                System.out.println(b.toLowerCase());
            }

        }

    }
}