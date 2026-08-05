import java.util.Scanner;

public class FirstRepeatingElement {

    static int firstRepeating(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    return arr[i];   // Returns the first repeating element
                }

            }
        }

        return -1;   // No repeating element found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = firstRepeating(arr);

        if (ans == -1) {
            System.out.println("No repeating element found.");
        } else {
            System.out.println("First repeating element = " + ans);
        }

        sc.close();
    }
}