import java.util.Scanner;

public class SwapNumbersUsingSumAndDifference {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("\nBefore Swapping:");
        System.out.println("First Number = " + a);
        System.out.println("Second Number = " + b);

        // Swapping using sum and difference
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter Swapping:");
        System.out.println("First Number = " + a);
        System.out.println("Second Number = " + b);

        sc.close();
    }
}