package app.zollet.leetcode.dsalgo;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {
        int a = maxOperations(new int[]{1, 2, 3, 4}, 5);
    }

    public int maxOperations(int[] nums, int k) {

        Map<Integer, Integer> set = new HashMap<>();
        int a = 0;

        for (int i = 0; i < nums.length; i++) {
            int v = nums[i];
            if (set.containsKey(v) && set.get(v) > 0) {
                a++;
                set.put(v, set.get(v) - 1);
            } else {
                set.put(k-v, set.getOrDefault(k-v, 0) + 1);
            }
        }
        return a;
    }

}