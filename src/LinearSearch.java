public class LinearSearch {

    static int linearSearch(int[] numbers, int key) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int key = 20;

        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println("key is at index : " + index);
        }
    }
}