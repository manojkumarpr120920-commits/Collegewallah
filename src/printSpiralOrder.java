public class printSpiralOrder {

    static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void spiralOrder(int[][] matrix, int r, int c) {

        int topRow = 0;
        int bottomRow = r - 1;
        int leftCol = 0;
        int rightCol = c - 1;

        int totalElements = 0;

        while (totalElements < r * c) {

            // Top Row → Left to Right
            for (int j = leftCol; j <= rightCol; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // Right Column → Top to Bottom
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            // Bottom Row → Right to Left
            for (int j = rightCol; j >= leftCol; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            // Left Column → Bottom to Top
            for (int i = bottomRow; i >= topRow; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int r = matrix.length;
        int c = matrix[0].length;

        spiralOrder(matrix, r, c);
    }
}