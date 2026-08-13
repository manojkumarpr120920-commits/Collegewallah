package arrays;

public class BinarySearch {

    static int binarySearch(int[] numbers, int key) {

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            else if (numbers[mid] < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        int key = 50;

        int index = binarySearch(numbers, key);

        if (index == -1) {
            System.out.println("NOT found");
        }
        else {
            System.out.println("key is at index : " + index);
        }
    }
}