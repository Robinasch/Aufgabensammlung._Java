import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deine Eingabe: ");
        String input = scanner.nextLine();

        int sum = 0;
        char vokal[] = {'A', 'E', 'I', 'O', 'U', 'Ä', 'Ö', 'Ü'};
        int counter[] = {0, 0, 0, 0, 0, 0, 0 ,0};

        input = input.toUpperCase();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < vokal.length; j++) {
                if (input.charAt(i) == vokal[j]) {
                    counter[j]++;
                    sum++;
                    break;
                }
            }
        }
        System.out.println("Dein Text hat total " + sum + " Vokale");
        for (int i = 0; i < vokal.length; i++) {
            if (counter[i] > 0)
                System.out.println("Der Buchstabe '" + vokal[i] + "' " + counter[i] + " mal vor.");
        }
    }
}