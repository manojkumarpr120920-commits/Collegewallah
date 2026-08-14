public class LeftRotateByOnePlace {

    static void rotateArrayByOne(int[] nums) {

        int first = nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }

        nums[nums.length - 1] = first;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        rotateArrayByOne(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
}