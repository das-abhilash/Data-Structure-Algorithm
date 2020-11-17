package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
        int a = mincostTickets(new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15});
    }

    public int mincostTickets(int[] days, int[] costs) {

        int[] dp = new int[366];
        dp[0] = 0;
        int answer = 0;
        int d = 0;
        for (int i = days[d]; i < 366; i++) {

            if (i > days[days.length - 1] || days[d] != i) {
                dp[i] = dp[i - 1];
                continue;
            }
            d++;
            int one = costs[0] + dp[i - 1];
            int seven = costs[1] + ((i - 7) < 1 ? 0 : dp[i - 7]);
            int thirty = costs[2] + ((i - 30) < 1 ? 0 : dp[i - 30]);
            dp[i] = Math.min(one, Math.min(seven, thirty));


        }

        return dp[365];
    }

}