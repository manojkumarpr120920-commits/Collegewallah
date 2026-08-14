import java.util.HashMap;
import java.util.Arrays;

public class NumbersThatAppearOnceBBEOP {

    // ============================================================
    // 1. BRUTE FORCE APPROACH
    // ============================================================

    static int singleNumberBruteForce(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int count = 0;

            for (int j = 0; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count == 1) {
                return nums[i];
            }
        }

        return -1;
    }

    // Time Complexity: O(n²)
    // Space Complexity: O(1)


    // ============================================================
    // 2. BETTER APPROACH — HASHMAP
    // ============================================================

    static int singleNumberBetterHashMap(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find number appearing once
        for (int num : nums) {

            if (map.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)


    // ============================================================
    // 3. BETTER APPROACH — SORTING
    // ============================================================

    static int singleNumberBetterSorting(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {

            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        // Single element is the last element
        return nums[nums.length - 1];
    }

    // Time Complexity: O(n log n)
    // Space Complexity: O(1) auxiliary space
    // Note: Sorting changes the original array.


    // ============================================================
    // 4. OPTIMAL APPROACH — XOR
    // ============================================================

    static int singleNumberOptimal(int[] nums) {

        int ans = 0;

        for (int num : nums) {
            ans = ans ^ num;
        }

        return ans;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)


    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 3};

        System.out.println(
                "Brute Force: " + singleNumberBruteForce(nums)
        );

        System.out.println(
                "Better - HashMap: " + singleNumberBetterHashMap(nums)
        );

        System.out.println(
                "Better - Sorting: " + singleNumberBetterSorting(nums)
        );

        // Fresh array because sorting changes the original array
        int[] nums2 = {1, 2, 2, 3, 3};

        System.out.println(
                "Optimal - XOR: " + singleNumberOptimal(nums2)
        );
    }
}