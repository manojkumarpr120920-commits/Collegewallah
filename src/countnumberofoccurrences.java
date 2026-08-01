import java.util.Scanner;

public class countnumberofoccurrences {

    static int countOccurrences(int arr[], int x) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        return count;
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

        System.out.print("Enter the element to count: ");
        int x = sc.nextInt();

        int count = countOccurrences(arr, x);

        System.out.println("Number of occurrences of " + x + " is: " + count);

        sc.close();
    }
}