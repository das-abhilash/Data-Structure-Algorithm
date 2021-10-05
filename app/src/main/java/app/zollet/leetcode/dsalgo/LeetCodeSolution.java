package app.zollet.leetcode.dsalgo;


import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {


    public void execute() {

    }

    public int climbStairs(int n) {


        Map<Integer, Integer> dp = new HashMap<>();
        return solve(n, dp);

    }

    private int solve(int n, Map<Integer, Integer> dp) {
        if (n < 0) return 0;
        if (n < 2) return n;
        if (dp.containsKey(n)) return dp.get(n);


        int ways = solve(n - 1, dp) + solve(n - 2, dp);
        dp.put(n, ways);

        return ways;
    }
}