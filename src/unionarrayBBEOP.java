import java.util.ArrayList;

public class unionarrayBBEOP {

    public static int[] unionArray(int[] nums1, int[] nums2) {

        ArrayList<Integer> union = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] <= nums2[j]) {

                if (union.isEmpty() ||
                        union.get(union.size() - 1) != nums1[i]) {
                    union.add(nums1[i]);
                }

                i++;

            } else {

                if (union.isEmpty() ||
                        union.get(union.size() - 1) != nums2[j]) {
                    union.add(nums2[j]);
                }

                j++;
            }
        }

        while (i < nums1.length) {

            if (union.isEmpty() ||
                    union.get(union.size() - 1) != nums1[i]) {
                union.add(nums1[i]);
            }

            i++;
        }

        while (j < nums2.length) {

            if (union.isEmpty() ||
                    union.get(union.size() - 1) != nums2[j]) {
                union.add(nums2[j]);
            }

            j++;
        }

        int[] result = new int[union.size()];

        for (int k = 0; k < union.size(); k++) {
            result[k] = union.get(k);
        }

        return result;
    }
}