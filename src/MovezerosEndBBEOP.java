public class MovezerosEndBBEOP {

    // ============================================================
    // 1. BRUTE FORCE APPROACH
    // ============================================================

    static void moveZeroesBruteForce(int[] nums) {

        int n = nums.length;

        int[] temp = new int[n];

        int index = 0;

        // Store all non-zero elements
        for (int i = 0; i < n; i++) {

            if (nums[i] != 0) {
                temp[index] = nums[i];
                index++;
            }
        }

        // Copy back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)


    // ============================================================
    // 2. OPTIMAL APPROACH — TWO POINTERS
    // ============================================================

    static void moveZeroesOptimal(int[] nums) {

        int j = -1;

        // Find the first zero
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // No zero found
        if (j == -1) {
            return;
        }

        // Move non-zero elements forward
        for (int i = j + 1; i < nums.length; i++) {

            if (nums[i] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)


    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args) {

        int[] nums1 = {1, 0, 2, 0, 3, 4};

        moveZeroesBruteForce(nums1);

        System.out.println("Brute Force:");

        for (int num : nums1) {
            System.out.print(num + " ");
        }

        System.out.println();


        int[] nums2 = {1, 0, 2, 0, 3, 4};

        moveZeroesOptimal(nums2);

        System.out.println("Optimal:");

        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}