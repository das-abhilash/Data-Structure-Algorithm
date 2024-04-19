package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {

        int a = numIslands(new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}});
    }

    public int numIslands(char[][] grid) {

        boolean[][] dp = new boolean[grid.length][grid[0].length];

        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !dp[i][j]) {
                    ans++;
                    dfs(grid, dp, i, j);
                }
            }
        }
        return ans;
    }

    private void dfs(char[][] grid, boolean[][] dp, int x, int y) {
        if (x < 0 || y < 0 || x == grid.length || y == grid[0].length || grid[x][y] == '0' || dp[x][y])
            return;

        dp[x][y] = true;
        dfs(grid, dp, x + 1, y);
        dfs(grid, dp, x - 1, y);
        dfs(grid, dp, x, y + 1);
        dfs(grid, dp, x, y - 1);
    }


}