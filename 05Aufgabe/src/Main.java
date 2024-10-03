import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele Kilometer möchten Sie rennen?");
        int zahl1 = scanner.nextInt();

        if (zahl1 >42){
            System.out.println("Das schaffst du nicht!");
        }
        else{
            System.out.println("Das sind " + zahl1*1000/400 + " Runden. Bereit für den Lauf?");
        }

    }
}