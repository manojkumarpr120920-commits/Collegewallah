import java.util.Scanner;

public class RotateMatrix90 {

    static void rotate90(int[][] matrix, int n) {

        // Step 1: Transpose
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse every row
        for (int i = 0; i < n; i++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }

    static void printMatrix(int[][] matrix, int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printMatrix(matrix, n);

        rotate90(matrix, n);

        System.out.println("Matrix after 90 degree clockwise rotation:");
        printMatrix(matrix, n);

        sc.close();
    }
}