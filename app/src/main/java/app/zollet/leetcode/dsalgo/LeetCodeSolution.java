package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {

    }

    public int maximumEnergy(int[] energy, int k) {

        int[] dp = new int[energy.length];

        int ans = Integer.MIN_VALUE;

        for (int i = energy.length -1; i >= 0; i--) {
            dp[i] = energy[i] + ((i + k) < energy.length ? dp[i + k] : 0);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

}


