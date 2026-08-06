import java.util.Scanner;

public class SortArraySquaresOptimal {

    // Function to return sorted squares without using reverse()
    static int[] sortedSquares(int[] arr) {

        int n = arr.length;
        int left = 0;
        int right = n - 1;

        int[] ans = new int[n];

        // Fill the answer array from the last index
        int k = n - 1;

        while (left <= right) {

            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }

        return ans;
    }

    // Function to print the array
    static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the sorted array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = sortedSquares(arr);

        System.out.println("Sorted Squares Array:");
        printArray(result);

        sc.close();
    }
}