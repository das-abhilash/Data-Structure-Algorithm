package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
    }

    public int minOperations(int[] nums, int k) {
        int finalXor = 0;
        for (int i = 0; i < nums.length; i++) {
            finalXor = finalXor ^ nums[i];
        }

        return Integer.bitCount(finalXor ^ k);
    }

}


