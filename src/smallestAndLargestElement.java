import java.util.Arrays;
import java.util.Scanner;

public class smallestAndLargestElement {

    static int[] smallestAndLargestElement(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = smallestAndLargestElement(arr);

        System.out.println("Smallest Element: " + result[0]);
        System.out.println("Largest Element: " + result[1]);

        sc.close();
    }
}