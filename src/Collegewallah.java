
import java.util.Scanner;

public class Collegewallah {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int originalNumber = n;
        int numOfDigits = 0;

        while (n > 0) {
            n = n / 10;
            numOfDigits++;
        }

        System.out.println("Number of digits in " + originalNumber + " = " + numOfDigits);

        sc.close();
    }
}