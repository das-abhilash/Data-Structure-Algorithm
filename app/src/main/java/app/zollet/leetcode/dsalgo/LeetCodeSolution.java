package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {

    public void execute() {
        int a = minimumAddedInteger(new int[]{6, 3, 6, 7}, new int[]{6, 2});
//        int a = minimumAddedInteger(new int[]{4, 6, 3, 1, 4, 2, 10, 9, 5}, new int[]{5, 10, 3, 2, 6, 1, 9});
//        int a = minimumAddedInteger(new int[]{4,7,5}, new int[]{5});
//        int a = minimumAddedInteger(new int[]{4,20,16,12,8}, new int[]{14,18,10});
//        int a = minimumAddedInteger(new int[]{3,5,5,3}, new int[]{7,7});
    }

    public int minimumAddedInteger(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums1.length; i++) {
            int diff = nums2[0] - nums1[i];
            if (check(nums1, nums2, diff)) {
                ans = Math.min(diff, ans);
            }

        }
        return ans;
    }

    private boolean check(int[] nums1, int[] nums2, int diff) {

        int count = 0;
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; i++) {
            if (nums2[j] - nums1[i] == diff) {
                j++;
            } else {
                count++;
            }
        }
        return count <= 2;
    }
}


