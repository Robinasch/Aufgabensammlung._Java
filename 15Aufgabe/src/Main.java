
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char weitermachen;
        boolean firstAttempt = true;

        do {
            int min = 1;
            int max = 100;

            Random random = new Random();

            int value = random.nextInt(max + min) + min;


            while (true) {
                if (firstAttempt) {
                    System.out.print("Geben Sie eine Zahl ein: ");
                    firstAttempt = false;
                }
                int zahl1 = scanner.nextInt();

                if (value == zahl1) {
                    System.out.println("Richtig!!!");
                    break;
                } else if (value < zahl1) {
                    System.out.println("Zu groß: ");
                } else if (value > zahl1) {
                    System.out.println("Zu klein: ");
                }
            }
            System.out.print("Möchten Sie weitermachen? (y/n): ");
            weitermachen = scanner.next().charAt(0);

        } while (weitermachen == 'y' || weitermachen == 'Y');

        System.out.println("Programm beendet.");
        scanner.close();
    }
}