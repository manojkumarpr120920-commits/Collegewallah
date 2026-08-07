import java.util.Scanner;

public class PascalTriangle {

    static int[][] pascal(int n) {

        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {

            // ith row has i + 1 columns
            ans[i] = new int[i + 1];

            // First and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;

            // Calculate middle elements
            for (int j = 1; j < i; j++) {

                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }

        return ans;
    }

    static void printPascal(int[][] ans) {

        for (int i = 0; i < ans.length; i++) {

            for (int j = 0; j < ans[i].length; j++) {

                System.out.print(ans[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int[][] ans = pascal(n);

        System.out.println("Pascal Triangle:");

        printPascal(ans);

        sc.close();
    }
}