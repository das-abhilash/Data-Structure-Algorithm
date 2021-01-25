package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
    }

    public boolean kLengthApart(int[] nums, int k) {

        int p = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            if (p == -1) {
                p = i;
                continue;
            }

            if (i - p +1 <= k) return false;
            p = i;


        }
        return true;
    }

}