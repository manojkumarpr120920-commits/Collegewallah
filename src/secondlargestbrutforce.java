

import java.util.Arrays;

class secondlargestbrutforce {

    public int secondLargestElement(int[] nums) {

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
}