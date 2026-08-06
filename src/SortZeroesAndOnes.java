import java.util.Scanner;

public class SortZeroesAndOnes {

    // Method to sort 0s and 1s
    static void sortZeroesAndOnes(int arr[]) {

        int n = arr.length;
        int zeroes = 0;

        // Count the number of zeroes
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }

        // Fill the array
        for (int i = 0; i < n; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    // Method to print the array
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements (0s and 1s only):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        printArray(arr);

        sortZeroesAndOnes(arr);

        System.out.println("Sorted Array:");
        printArray(arr);

        sc.close();
    }
}