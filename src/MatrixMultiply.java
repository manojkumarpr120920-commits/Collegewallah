
public class MatrixMultiply {

    static void multiply(int[][] a, int r1, int c1,
                         int[][] b, int r2, int c2) {

        // Check if matrix multiplication is possible
        if (c1 != r2) {
            System.out.println("Invalid dimensions - multiplication not possible");
            return;
        }

        // Result matrix has r1 rows and c2 columns
        int[][] mul = new int[r1][c2];

        // i -> selects the row of the result
        for (int i = 0; i < r1; i++) {

            // j -> selects the column of the result
            for (int j = 0; j < c2; j++) {

                // k -> multiplies and adds the elements
                for (int k = 0; k < c1; k++) {

                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Multiplication of matrices:");
        printMatrix(mul);
    }

    // Method to print the matrix
    static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {

            for (int val : row) {
                System.out.print(val + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] a = {
                {1, 2},
                {3, 4}
        };

        int[][] b = {
                {5, 6},
                {7, 8}
        };

        multiply(a, 2, 2, b, 2, 2);
    }
}