import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zahl 1: ");
        int zahl1 = scanner.nextInt();

        System.out.println("Zahl 2: ");
        int zahl2 = scanner.nextInt();

        int summe = zahl1 + zahl2;



        System.out.println("Resultat: " + summe);

    }
}
