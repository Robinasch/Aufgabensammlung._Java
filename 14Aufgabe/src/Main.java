import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Höhe der Krone: ");
        int hoeheKrone = scanner.nextInt();

        System.out.print("Höhe des Stammes: ");
        int hoeheStamm = scanner.nextInt();
        System.out.print("Breite des Stammes: ");
        int breiteStamm = scanner.nextInt();

        zeichneBaum(hoeheKrone, hoeheStamm, breiteStamm);
    }

    static void zeichneBaum(int hoeheKrone, int hoeheStamm, int breiteStamm) {
        zeichneKrone(hoeheKrone);

        zeichneStamm(hoeheStamm, breiteStamm, hoeheKrone);
    }

    static void zeichneKrone(int hoehe) {
        for (int i = 1; i <= hoehe; i++) {

            for (int j = 1; j <= hoehe - i; j++) {
                System.out.print(" ");
            }

            for (int a = 1; a <= 2 * i - 1; a++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }

    static void zeichneStamm(int hoehe, int breite, int hoeheKrone) {

        int leerzeichen = (2 * hoeheKrone - 1 - breite) / 2;

        for (int row = 1; row <= hoehe; row++) {
            for (int j = 1; j <= leerzeichen; j++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= breite; col++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
