package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {


    public void execute() {

    }

    public int minIncrementForUnique(int[] nums) {

        Arrays.sort(nums);

        int max = nums[0] + 1;

        int ans = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= max) {
                ans = ans + max - nums[i];
                max++;
            } else {
                max = nums[i] + 1;
            }

        }

        return ans;
    }

}


