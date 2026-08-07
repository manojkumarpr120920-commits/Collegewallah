import java.util.Scanner;

public class MatrixAddition {

    static void add(int[][] a, int r1, int c1,
                    int[][] b, int r2, int c2) {

        // Check whether addition is possible
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong Input - Addition not possible");
            return;
        }

        // Create result matrix
        int[][] sum = new int[r1][c1];

        // Traverse rows
        for (int i = 0; i < r1; i++) {

            // Traverse columns
            for (int j = 0; j < c1; j++) {

                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // Print result
        System.out.println("Sum of matrices:");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of first matrix: ");
        int r1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("Enter first matrix:");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter rows of second matrix: ");
        int r2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];

        System.out.println("Enter second matrix:");

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        add(a, r1, c1, b, r2, c2);

        sc.close();
    }
}