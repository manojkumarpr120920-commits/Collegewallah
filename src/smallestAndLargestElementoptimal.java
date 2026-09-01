

import java.util.Scanner;

public class smallestAndLargestElementoptimal {

    static int[] findSmallestAndLargest(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
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

        int[] result = findSmallestAndLargest(arr);

        System.out.println("Smallest Element: " + result[0]);
        System.out.println("Largest Element: " + result[1]);

        sc.close();
    }
}

