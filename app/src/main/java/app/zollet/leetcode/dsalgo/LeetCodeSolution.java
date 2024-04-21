package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.List;

public class LeetCodeSolution {

    public void execute() {

    }

    int minI = Integer.MAX_VALUE;
    int minJ = Integer.MAX_VALUE;
    int maxI = Integer.MIN_VALUE;
    int maxJ = Integer.MIN_VALUE;

    public int[][] findFarmland(int[][] land) {

        List<int[]> a = new ArrayList<>();

        boolean[][] dp = new boolean[land.length][land[0].length];
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (land[i][j] == 1 && !dp[i][j]) {
                    minI = Integer.MAX_VALUE;
                    minJ = Integer.MAX_VALUE;
                    maxI = Integer.MIN_VALUE;
                    maxJ = Integer.MIN_VALUE;
                    dfs(land, dp, i, j);
                    a.add(new int[]{minI, minJ, maxI, maxJ});
                }
            }
        }

        return a.toArray(new int[0][]);
    }

    private void dfs(int[][] land, boolean[][] dp, int i, int j) {
        if (i < 0 || j < 0 || i >= land.length || j >= land[0].length || dp[i][j] || land[i][j] == 0)
            return;

        minI = Math.min(i, minI);
        minJ = Math.min(j, minJ);
        maxI = Math.max(i, maxI);
        maxJ = Math.max(j, maxJ);
        dp[i][j] = true;
        dfs(land, dp, i + 1, j);
        dfs(land, dp, i - 1, j);
        dfs(land, dp, i, j + 1);
        dfs(land, dp, i, j - 1);

    }


}