import java.util.InputMismatchException;
import java.util.Scanner;
 public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ganze Dezimalzahl eingeben (q to Quit):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                String bin = "";
                int wert = number;

                while (wert > 0) {
                    int rest = wert % 2;
                    bin = rest + bin;
                    wert = wert / 2;
                }

                System.out.println("Binäre Darstellung: " + bin + "\n");
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe, bitte eine gültige Ganzzahl eingeben.");
            }
        }

        scanner.close();
    }
}