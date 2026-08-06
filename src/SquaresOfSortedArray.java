import java.util.Scanner;

public class SquaresOfSortedArray {

    // Function to return sorted squares
    static int[] sortSquares(int[] arr) {
        int n = arr.length;

        int left = 0;
        int right = n - 1;

        int[] ans = new int[n];

        // Fill from the last index
        int k = n - 1;

        while (left <= right) {

            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k] = arr[left] * arr[left];
                left++;
            } else {
                ans[k] = arr[right] * arr[right];
                right--;
            }

            k--;
        }

        return ans;
    }

    // Function to print array
    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = sortSquares(arr);

        System.out.println("Sorted Squares:");
        printArray(ans);

        sc.close();
    }
}