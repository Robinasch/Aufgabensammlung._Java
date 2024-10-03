import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zahl1: ");
        int zahl1 = scanner.nextInt();

        System.out.print("Zahl2: ");
        int zahl2 = scanner.nextInt();

        System.out.print("-------------------------------------------\n");
        System.out.print("Zahl \t| Quersumme \t| Zahl / Quersumme \n");
        System.out.print("-------------------------------------------\n");

        if (zahl1 > zahl2){
            int temp = zahl1;
            zahl1 = zahl2;
            zahl2 = temp;
        }

        for (int i = zahl1; i <= zahl2; i++){
            int quersumme = berechneQuersumme(i);

            if(quersumme != 0 && i % quersumme == 0){
                System.out.println(i+"\t\t|"+quersumme+"\t\t\t\t|"+i/quersumme);
            }
        }

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