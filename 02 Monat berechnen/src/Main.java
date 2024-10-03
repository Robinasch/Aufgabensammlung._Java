import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele tage hat der Monat, für den Sie die Sekundenzahl berechnen wollen?");
        int zahl1 = scanner.nextInt();

        int summe = zahl1 * 60 * 60;

        System.out.println("Resultat: " + summe + " Sekunden");
    }
}

