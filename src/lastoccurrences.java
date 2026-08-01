import java.util.Scanner;

public class lastoccurrences {

    static int lastOccurrence(int arr[], int x) {
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }

        return lastIndex;
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

        System.out.print("Enter the element to find last occurrence: ");
        int x = sc.nextInt();

        int index = lastOccurrence(arr, x);

        if (index != -1) {
            System.out.println("Last occurrence of " + x + " is at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}