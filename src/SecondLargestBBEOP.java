import java.util.Arrays;

public class SecondLargestBBEOP {

    // ============================================================
    // 1. BRUTE FORCE APPROACH
    // ============================================================

    static int secondLargestBruteForce(int[] nums) {

        Arrays.sort(nums);

        // Find the second largest distinct element
        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] != nums[nums.length - 1]) {
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

    static int secondLargestBetter(int[] nums) {

        int largest = nums[0];

        // Find largest
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        int secondLargest = -1;

        // Find second largest distinct element
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != largest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        return secondLargest;
    }

    // Time Complexity: O(n) + O(n) = O(2n) = O(n)
    // Space Complexity: O(1)


    // ============================================================
    // 3. OPTIMAL APPROACH
    // ============================================================

    static int secondLargestOptimal(int[] nums) {

        int largest = nums[0];
        int secondLargest = -1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > largest) {

                secondLargest = largest;
                largest = nums[i];
            }

            else if (nums[i] != largest && nums[i] > secondLargest) {

                secondLargest = nums[i];
            }
        }

        return secondLargest;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)


    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 30, 15};

        System.out.println("Brute Force: " + secondLargestBruteForce(nums));

        System.out.println("Better: " + secondLargestBetter(nums));

        System.out.println("Optimal: " + secondLargestOptimal(nums));
    }
}
