package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
        merge(new int[]{2, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int l = 0;
        int r = 0;

        while (m <= nums1.length && l<m && r < n) {

            int f = nums1[l];
            int s = nums2[r];

            if (f <= s) {
                l++;
            } else {
                shift(nums1, l + 1, m);
                nums1[l] = nums2[r];
                r++;
                l++;
                m++;
            }
            int ssfd = 0;
        }

        while (r < n) {
            nums1[l++] = nums2[r++];
        }
        int aa = 0;
    }

    private void shift(int[] a, int i, int m) {

        for (int j = a.length - 1; j >= i; j--) {
            a[j] = a[j - 1];
        }

    }

}