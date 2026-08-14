public class CheckTheArraySortedBBEOPT {

    static boolean isSorted(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] >= nums[i - 1]) {
                // Array is still sorted
            }
            else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(isSorted(nums));
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
}