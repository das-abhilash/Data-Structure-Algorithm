package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {

    }

    public int getMaximumGold(int[][] grid) {

        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0) {
                    max = Math.max(max, max(grid, new boolean[grid.length][grid[0].length], i, j));
                }
            }
        }
        return max;
    }

    private int max(int[][] grid, boolean[][] dp, int x, int y) {

        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || dp[x][y] || grid[x][y] == 0) {
            return 0;
        }

        dp[x][y] = true;
        int left = max(grid, dp, x - 1, y);
        int right = max(grid, dp, x + 1, y);
        int top = max(grid, dp, x, y - 1);
        int bottom = max(grid, dp, x, y + 1);
        dp[x][y] = false;

        return grid[x][y] + Math.max(Math.max(left, right), Math.max(top, bottom));
    }

}


