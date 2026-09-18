import java.util.Arrays;
import java.util.Scanner;

public class countTripletsxoptimizedone {

    static int countTriplets(int[] arr, int x) {

        Arrays.sort(arr);

        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == x) {
                    count++;
                    left++;
                    right--;
                }
                else if (sum < x) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return count;
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

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        int result = countTriplets(arr, x);

        System.out.println("Total number of triplets = " + result);

        sc.close();
    }
}

/*
Time Complexity  : O(n²)
Space Complexity : O(1) extra
*/