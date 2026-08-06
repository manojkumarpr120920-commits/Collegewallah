import java.util.Scanner;

public class InPlacePrefixSum {

    // Function to convert the array into an in-place prefix sum array
    static void prefixSum(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }

    // Function to print the array
    static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        prefixSum(arr);

        System.out.println("In-Place Prefix Sum Array:");
        printArray(arr);

        sc.close();
    }
}