
public class LeftRotateByKPlacesBBEOP {

    // ============================================================
    // 1. BRUTE FORCE APPROACH
    // ============================================================

    static void leftRotateBruteForce(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        // Store first k elements
        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        // Shift remaining elements to the left
        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        // Put stored elements at the end
        for (int i = n - k; i < n; i++) {
            nums[i] = temp[i - (n - k)];
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(k)


    // ============================================================
    // 2. OPTIMAL APPROACH — REVERSAL
    // ============================================================

    static void leftRotateOptimal(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        // Reverse first k elements
        reverse(nums, 0, k - 1);

        // Reverse remaining elements
        reverse(nums, k, n - 1);

        // Reverse the entire array
        reverse(nums, 0, n - 1);
    }

    static void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)


    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        leftRotateBruteForce(nums1, k);

        System.out.println("Brute Force:");

        for (int num : nums1) {
            System.out.print(num + " ");
        }

        System.out.println();


        int[] nums2 = {1, 2, 3, 4, 5, 6, 7};

        leftRotateOptimal(nums2, k);

        System.out.println("Optimal:");

        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}