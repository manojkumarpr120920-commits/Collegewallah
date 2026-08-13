package arrays;

public class PrintSubarrays {

    static void printSubarrays(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {

                for (int k = i; k <= j; k++) {

                    System.out.print(numbers[k] + " ");
                }

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        printSubarrays(numbers);
    }
}