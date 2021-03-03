package app.zollet.leetcode.dsalgo;

import java.util.Arrays;

public class LeetCodeSolution {

    public void execute() {
        int a = missingNumber(new int[]{1, 2, 3, 4, 5});
    }


    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i)
                return i;
        }
        return nums.length;
    }

}