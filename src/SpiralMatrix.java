import java.util.*;

public class SpiralMatrix {

    static void spiralOrder(int[][] matrix, int n) {

        int topRow = 0;
        int bottomRow = n - 1;
        int leftCol = 0;
        int rightCol = n - 1;

        int curr = 1;

        while (curr <= n * n) {

            // 1. Top Row → Left to Right
            for (int j = leftCol;
                 j <= rightCol && curr <= n * n;
                 j++) {

                matrix[topRow][j] = curr++;
            }

            topRow++;


            // 2. Right Column → Top to Bottom
            for (int i = topRow;
                 i <= bottomRow && curr <= n * n;
                 i++) {

                matrix[i][rightCol] = curr++;
            }

            rightCol--;


            // 3. Bottom Row → Right to Left
            for (int j = rightCol;
                 j >= leftCol && curr <= n * n;
                 j--) {

                matrix[bottomRow][j] = curr++;
            }

            bottomRow--;


            // 4. Left Column → Bottom to Top
            for (int i = bottomRow;
                 i >= topRow && curr <= n * n;
                 i--) {

                matrix[i][leftCol] = curr++;
            }

            leftCol++;
        }


        // Print the matrix
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {

        int n = 5;

        int[][] matrix = new int[n][n];

        spiralOrder(matrix, n);
    }
}