package app.zollet.leetcode.dsalgo;


import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {


    public void execute() {

    }

    public boolean stoneGame(int[] piles) {

        Map<String, Integer> dp = new HashMap<>();
        int total = 0;
        for (int i = 0; i < piles.length; i++) {
            total += piles[i];
        }

        int val = solve(piles, true, 0, piles.length - 1, dp);
        return val > total - val;
    }

    private int solve(int[] piles, boolean isAlice, int start, int end, Map<String, Integer> dp) {

        if (start > end || start >= piles.length || end < 0) {
            return 0;
        }

        String key = start + "-" + end;
        if (dp.containsKey(key)) return dp.get(key);

        int val;
        if (isAlice) {
            val = Math.max(solve(piles, !isAlice, start + 1, end, dp) + piles[start], solve(piles, !isAlice, start, end - 1, dp) + piles[end]);
        } else {
            val = Math.min(solve(piles, !isAlice, start + 1, end, dp) + piles[start], solve(piles, !isAlice, start, end - 1, dp) + piles[end]);
        }
        dp.put(key, val);
        return val;
    }
}