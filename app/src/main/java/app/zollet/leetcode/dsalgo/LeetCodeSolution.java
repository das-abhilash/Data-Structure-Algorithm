package app.zollet.leetcode.dsalgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import app.zollet.leetcode.dsalgo.util.ListNode;

public class LeetCodeSolution {

    public void execute() {
        int a = maxOperations(new int[]{2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2}, 3);
    }

    public int maxOperations(int[] nums, int k) {

        Map<Integer, Integer> set = new HashMap<>();
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > k) continue;

            if (set.getOrDefault(nums[i], 0) > 0) {
                a++;
                set.put(nums[i], set.get(nums[i]) - 1);
            } else {
                set.put(k - nums[i], set.getOrDefault(k - nums[i], 0) + 1);
            }
        }
        return a;
    }
}