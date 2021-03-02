package app.zollet.leetcode.dsalgo;

import java.util.HashSet;
import java.util.Set;

public class LeetCodeSolution {

    public void execute() {
        int[] a = findErrorNums(new int[]{1, 2, 3, 4, 1});
    }

    public int[] findErrorNums(int[] nums) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set2.add(i + 1);
        }

        int[] out = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                out[0] = nums[i];
            } else {
                set.add(nums[i]);
                set2.remove(nums[i]);
            }
        }

        out[1] = set2.iterator().next();
        return out;
    }

}