package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {


    public void execute() {

    }

    public int numSquares(int n) {

        int[] dp = new int[n + 1];

        dp[0] = 0;

        Arrays.fill(dp,Integer.MAX_VALUE);
        for (int i = 1; i <= n; i++) {
            int s = (int) Math.sqrt(i);

            if (s * s == i) {
                dp[i] = 1;
                continue;
            }


            for (int j = 1; j <= s; j++) {
                int diff = i - j * j;
                dp[i] = Math.min(dp[i], dp[diff] + 1);
            }

        }
        return dp[n];
    }

}