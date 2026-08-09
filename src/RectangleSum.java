import java.util.Scanner;

public class RectangleSum {

    // Brute Force method to find sum of rectangle
    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2) {

        int sum = 0;

        // Rows
        for (int i = l1; i <= l2; i++) {

            // Columns
            for (int j = r1; j <= r2; j++) {

                sum = sum + matrix[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter number of rows and columns
        System.out.println("Enter number of rows and columns of matrix:");

        int r = sc.nextInt();
        int c = sc.nextInt();

        // Create matrix
        int[][] matrix = new int[r][c];

        // Total number of elements
        int totalElements = r * c;

        System.out.println("Enter " + totalElements + " values:");

        // Input matrix
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        // Enter rectangle boundaries
        System.out.println("Enter rectangle boundaries l1, r1, l2, r2:");

        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        // Find rectangle sum
        int result = findSum(matrix, l1, r1, l2, r2);

        // Print result
        System.out.println("Rectangle Sum = " + result);

        sc.close();
    }
}