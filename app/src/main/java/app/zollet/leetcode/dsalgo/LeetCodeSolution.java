package app.zollet.leetcode.dsalgo;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCodeSolution {

    public void execute() {
    }

    public int findMaxK(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        int ans = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > 0 && set.contains(num * -1)) {
                ans = Math.max(ans, num);
            }
        }

        return ans == Integer.MIN_VALUE ? -1 : ans;
    }

}


