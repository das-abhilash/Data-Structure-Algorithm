package app.zollet.leetcode.dsalgo;

import java.util.Arrays;

public class LeetCodeSolution {

    public void execute() {
        int a = numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40});
    }

    public int numPairsDivisibleBy60(int[] time) {

        int[] dp = new int[61];
        Arrays.fill(dp, 0);
        int a = 0;
        for (int t : time) {
            int r = t % 60;
            if (dp[r == 0 ? 60 : 60 - r] != 0) {
                a += dp[r == 0 ? 60 : 60 - r];
            }
            dp[r == 0 ? 60 :r]++;
        }
        return a;
    }

}