package app.zollet.leetcode.dsalgo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LeetCodeSolution {

    public void execute() {
        boolean b = canPartition(new int[]{1, 2, 3, 4, 5});
    }

    public boolean canPartition(int[] nums) {
        if (nums.length == 0) return false;
        Map<Integer, Integer> map = new HashMap<>();
        Map<String, Boolean> dp = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return solve(map, dp, 0, sum);
    }

    private boolean solve(Map<Integer, Integer> map, Map<String, Boolean> dp, int till, int sum) {
        if (sum == till) return true;
        if (sum < till) return false;
        if (dp.containsKey(till + "-" + sum)) {
            return dp.get(till + "-" + sum);
        }

        Set<Integer> keys = map.keySet();

        for (int k : keys) {
            if (map.get(k) <= 0) continue;
            sum = sum - k;
            till = till + k;
            map.put(k, map.get(k) - 1);
            if (solve(map, dp, till, sum)) {
                dp.put(till + "-" + sum, true);
                return true;
            }
            dp.put(till + "-" + sum, false);
            map.put(k, map.getOrDefault(k, 0) + 1);
            sum = sum + k;
            till = till - k;
        }
        return false;
    }


}