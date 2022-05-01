import java.util.Arrays;
public class IntersectionOfTwoArrays_II {
    public static void main(String[] args) {
        int[] a1 = {7, 1, 5, 3, 6, 4};
        int[] a2 = {1, 3, 4, 6};
        for (int i : intersect(a1, a2))
            System.out.print(i + " ");
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m = nums1.length, n = nums2.length, i = 0, j = 0, k = 0;
        int t = Math.min(m, n);
        int[] ret = new int[t];
        while (i < m && j < n) {
            if (nums1[i] == nums2[j]) {
                ret[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) i++;
            else j++;
        }
        return ret;
    }
}
