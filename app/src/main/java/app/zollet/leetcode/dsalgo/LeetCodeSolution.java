package app.zollet.leetcode.dsalgo;

import java.util.Arrays;

import app.zollet.leetcode.dsalgo.util.ListNode;

public class LeetCodeSolution {

    public void execute() {
    }

    public int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[nums.length-k];

    }
}