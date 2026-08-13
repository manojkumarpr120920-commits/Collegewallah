
public class MaxSubarraySumUsingPrefix {

    static void maxSubarraySum(int[] numbers) {

        int[] prefix = new int[numbers.length];

        // Creating Prefix Sum array
        prefix[0] = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        int maxSum = Integer.MIN_VALUE;

        // Finding maximum subarray sum
        for (int i = 0; i < numbers.length; i++) {

            int start = i;

            for (int j = i; j < numbers.length; j++) {

                int end = j;

                int currSum;

                if (start == 0) {
                    currSum = prefix[end];
                } else {
                    currSum = prefix[end] - prefix[start - 1];
                }

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("max sum = " + maxSum);
    }

    public static void main(String[] args) {

        int[] numbers = {2, -4, 6, 8, -10, 100};

        maxSubarraySum(numbers);
    }
}