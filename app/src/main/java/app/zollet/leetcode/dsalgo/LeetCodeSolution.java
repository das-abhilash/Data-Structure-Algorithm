package app.zollet.leetcode.dsalgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeSolution {

    public void execute() {

    }

    public int[] sortedSquares(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

}