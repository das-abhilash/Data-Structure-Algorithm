package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {


    public void execute() {

    }

    public int minDifference(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        if (n <= 4) return 0;
        int ans = Integer.MAX_VALUE;

        ans = Math.min(ans, nums[n - 1] - nums[4]);
        ans = Math.min(ans, nums[n - 2] - nums[3]);
        ans = Math.min(ans, nums[n - 3] - nums[1]);
        ans = Math.min(ans, nums[n - 4] - nums[0]);
        return ans;
    }

}


