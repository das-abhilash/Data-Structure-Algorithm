package app.zollet.leetcode.dsalgo;


import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {
    }

    public long numberOfRightTriangles(int[][] grid) {

        Map<Integer, Integer> r = new HashMap<>();
        Map<Integer, Integer> c = new HashMap<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1) {
                    r.put(i, r.getOrDefault(i, 0) + 1);
                    c.put(j, c.getOrDefault(j, 0) + 1);
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int rr = r.getOrDefault(i, 0);
                int cc = c.getOrDefault(j, 0);

                if(grid[i][j] == 0) continue;
                if (rr < 2) continue;
                if (cc < 2) continue;


                ans = ans + (rr - 1) * (cc - 1);

            }
        }
        return ans;

    }


}