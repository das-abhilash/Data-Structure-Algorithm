package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
    }

    int a = 0;

    public int uniquePathsIII(int[][] grid) {
        a = 0;
        int z = 0;
        int x = -1;
        int y = -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    x = i;
                    y = j;
                } else if (grid[i][j] == 0) {
                    z++;
                }
            }
        }
        dfs(grid, x, y, z, 0);
        return a;
    }

    private void dfs(int[][] grid, int i, int j, int z, int p) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == -1)
            return;
        if (grid[i][j] == 2) {
            if (z == p -1)
                a++;
            return;
        }

        int temp = grid[i][j];
        grid[i][j] = -1;
        dfs(grid, i + 1, j, z, p + 1);
        dfs(grid, i - 1, j, z, p + 1);
        dfs(grid, i, j + 1, z, p + 1);
        dfs(grid, i, j - 1, z, p + 1);

        grid[i][j] = temp;
    }

}