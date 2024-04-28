package app.zollet.leetcode.dsalgo;


import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {
        long a = numberOfRightTriangles(new int[][]{{1,1,1},{1,0,1}});
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


                ans = ans + (cc-1) * nCr(rr,2);

            }
        }
        return ans;

    }


    private int nCr(int n, int r)
    {
        return fact(n) / (fact(r) *
                fact(n - r));
    }
    private int fact(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

}