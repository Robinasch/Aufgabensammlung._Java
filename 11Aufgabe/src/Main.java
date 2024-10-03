import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wie lange soll die Linie sein? ");
        int zahl = scanner.nextInt();
        for (int row = 1; row <= zahl; row++) {
            for (int col = 1; col <= zahl; col++) {
                if (col == row) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}