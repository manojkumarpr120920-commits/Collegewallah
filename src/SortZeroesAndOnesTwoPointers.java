import java.util.Scanner;

public class SortZeroesAndOnesTwoPointers {

    // Swap two elements
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Sort using two pointers
    static void sortZeroesAndOnes(int arr[]) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] == 0) {
                left++;
            }

            if (arr[right] == 1) {
                right--;
            }
        }
    }

    // Print array
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements (0s and 1s only):");

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
