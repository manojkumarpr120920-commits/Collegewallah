
import java.util.Scanner;

public class raisetopower {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int power = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * base;
        }

        System.out.println(base + " raised to the power " + power + " = " + result);

        sc.close();
    }
}