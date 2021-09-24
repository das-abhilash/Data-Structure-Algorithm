package app.zollet.leetcode.dsalgo;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCodeSolution {


    public void execute() {

    }

    public int[] twoSum(int[] nums, int target) {

        int[] a = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
                set.add(nums[i]);
            }
        }
        return new int[2];
    }
}