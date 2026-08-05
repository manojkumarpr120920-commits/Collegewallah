import java.util.Scanner;

public class SecondSmallest {

    static int findMin(int arr[]) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    static int findSecondMin(int arr[]) {
        int mn = findMin(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mn) {
                arr[i] = Integer.MAX_VALUE;
            }
        }

        return findMin(arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Second Smallest Element = " + findSecondMin(arr));

        sc.close();
    }
}