package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {

    public void execute() {
        tribonacci(4);
    }

    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;

        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        int df=  solve(n, dp);
        return df;
    }

    private int solve(int n, int[] dp) {
        if (n < 0) return 0;

        if (dp[n] >= 0) return dp[n];

        int d= solve(n - 1, dp) + solve(n - 2, dp) + solve(n - 3, dp);
        dp[n] = d;
        return d;
    }


}