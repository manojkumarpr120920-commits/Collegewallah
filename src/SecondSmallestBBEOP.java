import java.util.Arrays;

public class SecondSmallestBBEOP {

    // ============================================================
    // 1. BRUTE FORCE APPROACH
    // ============================================================

    static int secondSmallestBruteForce(int[] nums) {

        Arrays.sort(nums);

        // Find the second smallest distinct element
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[0]) {
                return nums[i];
            }
        }

        return -1;
    }

    // Time Complexity: O(n log n)
    // Space Complexity: O(1) auxiliary space


    // ============================================================
    // 2. BETTER APPROACH
    // ============================================================

    static int secondSmallestBetter(int[] nums) {

        int smallest = nums[0];

        // Find smallest
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }

        int secondSmallest = Integer.MAX_VALUE;

        // Find second smallest distinct element
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != smallest && nums[i] < secondSmallest) {
                secondSmallest = nums[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            return -1;
        }

        return secondSmallest;
    }

    // Time Complexity: O(n) + O(n) = O(n)
    // Space Complexity: O(1)


    // ============================================================
    // 3. OPTIMAL APPROACH
    // ============================================================

    static int secondSmallestOptimal(int[] nums) {

        int smallest = nums[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < smallest) {

                secondSmallest = smallest;
                smallest = nums[i];
            }

            else if (nums[i] != smallest && nums[i] < secondSmallest) {

                secondSmallest = nums[i];
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            return -1;
        }

        return secondSmallest;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)


    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args) {

        int[] nums = {10, 5, 20, 5, 8};

        System.out.println(
                "Brute Force: " + secondSmallestBruteForce(nums)
        );

        System.out.println(
                "Better: " + secondSmallestBetter(nums)
        );

        System.out.println(
                "Optimal: " + secondSmallestOptimal(nums)
        );
    }
}