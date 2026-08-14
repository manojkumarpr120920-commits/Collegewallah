
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementsBBEOP {

    // ============================================================
    // 1. BRUTE FORCE APPROACH
    // ============================================================

    static int removeDuplicatesBruteForce(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int i = 0;

        for (int num : set) {
            nums[i] = num;
            i++;
        }

        return i;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)


    // ============================================================
    // 2. OPTIMAL APPROACH — TWO POINTERS
    // ============================================================

    static int removeDuplicatesOptimal(int[] nums) {

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {

                nums[i + 1] = nums[j];
                i++;
            }
        }

        return i + 1;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)


    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 2, 2, 3, 3, 4};

        int k1 = removeDuplicatesBruteForce(nums1);

        System.out.println("Brute Force:");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }

        System.out.println();


        int[] nums2 = {1, 1, 2, 2, 3, 3, 4};

        int k2 = removeDuplicatesOptimal(nums2);

        System.out.println("Optimal:");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}