package app.zollet.leetcode.dsalgo;


import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {


    public void execute() {

    }


//    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
//
//    }

    public int climbStairs(int n) {

        return solve(n,new HashMap<>());

    }

    private int solve(int n, Map<Integer, Integer> map) {

        if (map.containsKey(n)) return map.get(n);
        if (n < 0) return 0;
        if (n == 0) return 1;

        int v = climbStairs(n - 1) + climbStairs(n - 2);
        map.put(n, v);
        return v;
    }

}