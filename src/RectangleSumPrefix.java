import java.util.Scanner;

public class RectangleSumPrefix {

    // Create row-wise prefix sum matrix
    static void findPrefixSumMatrix(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        // Traverse horizontally
        // to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {

            for (int j = 1; j < c; j++) {

                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }

    // Find rectangle sum using prefix sum
    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2) {

        int sum = 0;

        // Go through the required rows
        for (int i = l1; i <= l2; i++) {

            // If rectangle starts from column 0
            if (r1 == 0) {

                sum += matrix[i][r2];

            } else {

                sum += matrix[i][r2] - matrix[i][r1 - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter rows and columns
        System.out.println("Enter number of rows and columns:");

        int r = sc.nextInt();
        int c = sc.nextInt();

        // Create matrix
        int[][] matrix = new int[r][c];

        int totalElements = r * c;

        System.out.println("Enter " + totalElements + " values:");

        // Input matrix
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        // Create prefix sum matrix
        findPrefixSumMatrix(matrix);

        // Enter rectangle boundaries
        System.out.println("Enter rectangle boundaries l1, r1, l2, r2:");

        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        // Find rectangle sum
        int result = findSum(matrix, l1, r1, l2, r2);

        System.out.println("Rectangle Sum = " + result);

        sc.close();
    }
}