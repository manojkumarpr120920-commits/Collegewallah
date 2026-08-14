import java.util.ArrayList;

public class IntersectionOfArrayBBEOP {

    // ============================================================
    // 1. BRUTE FORCE APPROACH
    // ============================================================

    static int[] intersectionBruteForce(int[] nums1, int[] nums2) {

        ArrayList<Integer> ans = new ArrayList<>();

        // visited tracks the elements of nums2
        boolean[] visited = new boolean[nums2.length];

        // Take each element from nums1
        for (int i = 0; i < nums1.length; i++) {

            // Search for nums1[i] in nums2
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j] && !visited[j]) {

                    ans.add(nums1[i]);

                    // Mark nums2[j] as used
                    visited[j] = true;

                    // One match is enough for this nums1[i]
                    break;
                }
            }
        }

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }

    // Time Complexity: O(n * m)
    // Space Complexity: O(m)


    // ============================================================
    // 2. OPTIMAL APPROACH — TWO POINTERS
    // ============================================================

    static int[] intersectionOptimal(int[] nums1, int[] nums2) {

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                i++;
            }
            else if (nums2[j] < nums1[i]) {
                j++;
            }
            else {

                // Both elements are equal
                ans.add(nums1[i]);

                i++;
                j++;
            }
        }

        int[] result = new int[ans.size()];

        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }

        return result;
    }

    // Time Complexity: O(n + m)
    // Space Complexity: O(n + m)


    // ============================================================
    // MAIN METHOD
    // ============================================================

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 3, 4};
        int[] nums2 = {2, 2, 4, 6};

        // Brute Force
        int[] brute = intersectionBruteForce(nums1, nums2);

        System.out.print("Brute Force: ");

        for (int num : brute) {
            System.out.print(num + " ");
        }

        System.out.println();


        // Optimal
        int[] optimal = intersectionOptimal(nums1, nums2);

        System.out.print("Optimal: ");

        for (int num : optimal) {
            System.out.print(num + " ");
        }
    }
}