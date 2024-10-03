import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zahl eingeben 1-12: ");
        int zahl1 = scanner.nextInt();

        System.out.println("Monat: ");

        if (zahl1 == 1)
        {
            System.out.println("Januar");
        }
        else if (zahl1 == 2)
        {
            System.out.println("Februar");
        }
        else if (zahl1 == 3)
        {
            System.out.println("März");
        }
        else if (zahl1 == 4)
        {
            System.out.println("April");
        }
        else if (zahl1 == 5)
        {
            System.out.println("Mai");
        }
        else if (zahl1 == 6)
        {
            System.out.println("Juni");
        }
        else if (zahl1 == 7)
        {
            System.out.println("Juli");
        }
        else if (zahl1 == 8)
        {
            System.out.println("August");
        }
        else if (zahl1 == 9)
        {
            System.out.println("September");
        }
        else if (zahl1 == 10)
        {
            System.out.println("Oktober");
        }
        else if (zahl1 == 11)
        {
            System.out.println("November");
        }
        else if (zahl1 == 12)
        {
            System.out.println("Dezember");
        }
    }
}