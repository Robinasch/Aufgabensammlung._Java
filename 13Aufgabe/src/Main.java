import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jahr: ");
        int i = scanner.nextInt();

        if (i % 4 ==0){
            System.out.print(i+" ist ein Schaltjahr.");
        }
        else if(i % 400 ==0) {
            System.out.print(i+" ist ein Schaltjahr.");
        }
        else {
            System.out.print(i+" ist kein Schaltjahr.");
        }
    }
}
