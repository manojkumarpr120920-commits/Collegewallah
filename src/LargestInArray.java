public class LargestInArray {

    public static void main(String[] args) {

        int[] numbers = {-10, -25, -7, -45, -30, -60, -15};

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element is: " + largest);
    }
}