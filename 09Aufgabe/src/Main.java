import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib eine Zahl ein:");
        String input = scanner.nextLine();

        try {
            int i = Integer.parseInt(input);
            int quersumme = berechneQuersumme(i);
            System.out.println("Die Queersumme ist: " + quersumme);
        } catch (NumberFormatException e) {
            System.out.println("falsche eingabe");}

    }

    static int berechneQuersumme(int zahl) {
        int sum = 0;

        while (zahl != 0) {
            sum += (zahl % 10);
            zahl /= 10;
        }
        return sum;
    }
}