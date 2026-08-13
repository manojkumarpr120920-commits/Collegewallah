

public class MaxSubarraySum {

    static int maxSubarraySum(int[] numbers) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i; j < numbers.length; j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {

                    sum = sum + numbers[k];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] numbers = {2, -4, 6, 8, -10, 100};

        int result = maxSubarraySum(numbers);

        System.out.println("Maximum subarray sum is: " + result);
    }
}