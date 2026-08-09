import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayListByUsingCollection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Original ArrayList:");
        System.out.println(list);

        // Reverse using Collections
        Collections.reverse(list);

        System.out.println("Reversed ArrayList:");
        System.out.println(list);

        sc.close();
    }
}