import java.util.Scanner;

public class TransposeMatrix {

    static int[][] findTranspose(int[][] matrix, int r, int c) {

        // Transpose will have c rows and r columns
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++) {

            for (int j = 0; j < r; j++) {

                ans[i][j] = matrix[j][i];
            }
        }

        return ans;
    }

    static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns of matrix");

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        int totalElements = r * c;

        System.out.println("Enter " + totalElements + " values");

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input Matrix");
        printMatrix(matrix);

        System.out.println("Transpose of matrix");

        int[][] ans = findTranspose(matrix, r, c);

        printMatrix(ans);

        sc.close();
    }
}