import java.util.ArrayList;
import java.util.Collections;

public class StringSortArrayListUsingCollection {

    public static void main(String[] args) {

        ArrayList<String> l1 = new ArrayList<>();

        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");

        System.out.println("Original " + l1);

        Collections.sort(l1);

        System.out.println("Sorted " + l1);
    }
}
