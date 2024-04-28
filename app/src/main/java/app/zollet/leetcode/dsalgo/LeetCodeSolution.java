package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {

    public void execute() {
        int a = longestIdealString("acfgbd", 2);
    }

    public int longestIdealString(String s, int k) {
        int[][] dp = new int[s.length()][27];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(0, '{', s, k, dp);
    }


    private int solve(int i, char last, String s, int k, int[][] dp) {
        if (i == s.length()) return 0;
        if (dp[i][last - 'a'] != -1) return dp[i][last - 'a'];

        int take = 0;
        int notTake = 0;

        if (last == '{' || Math.abs(s.charAt(i) - last) <= k) {
            take = 1 + solve(i + 1, s.charAt(i), s, k, dp);
        }

        notTake = solve(i + 1, last, s, k, dp);

        dp[i][last - 'a'] = Math.max(take, notTake);
        return dp[i][last - 'a'];
    }

}


