package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
        int[] a = getSumAbsoluteDifferences(new int[]{2, 3, 5});
    }

    public int[] getSumAbsoluteDifferences(int[] nums) {


        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = nums[0];
        right[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i - 1] + nums[i];
            right[nums.length - 1 - i] = right[nums.length - i] + nums[nums.length - 1 - i];
        }

        int[] a = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                a[i] = right[1] - (nums[i] * (nums.length - 1));
            } else if (i == nums.length - 1) {
                a[i] = (nums[i] * (nums.length - 1)) - left[nums.length - 2];
            } else {
                int r = right[i + 1] - nums[i] * (nums.length - i - 1);
                int l = nums[i] * (i) - left[i - 1];
                a[i] = r + l;
            }

        }
        return a;
    }

}