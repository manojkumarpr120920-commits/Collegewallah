import java.util.Scanner;

public class ReverseArrayUsingNewArray {

    // Method to print the array
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to reverse the array using a new array
    static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int j = 0;

        for (int i = n - 1; i >= 0; i--) {
            ans[j] = arr[i];
            j++;
        }

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

        System.out.println("Original Array:");
        printArray(arr);

        int[] reversed = reverseArray(arr);

        System.out.println("Reversed Array:");
        printArray(reversed);

        sc.close();
    }
}