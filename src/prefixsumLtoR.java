import java.util.*;

public class prefixsumLtoR {

    static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    static int rangeSum(int[] prefix, int L, int R) {

        if (L == 0) {
            return prefix[R];
        }

        return prefix[R] - prefix[L - 1];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefix = prefixSum(arr);

        int L = sc.nextInt();
        int R = sc.nextInt();

        int sum = rangeSum(prefix, L, R);

        System.out.println(sum);

        sc.close();
    }
}