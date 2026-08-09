import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {

    static void reverseList(ArrayList<Integer> list) {

        int i = 0;
        int j = list.size() - 1;

        while (i < j) {

            Integer temp = list.get(i);

            list.set(i, list.get(j));
            list.set(j, temp);

            i++;
            j--;
        }
    }

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

        reverseList(list);

        System.out.println("Reversed ArrayList:");
        System.out.println(list);

        sc.close();
    }
}