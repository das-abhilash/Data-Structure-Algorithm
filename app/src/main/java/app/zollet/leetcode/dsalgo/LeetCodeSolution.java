package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {




    public void execute() {
    }
    int a = Integer.MAX_VALUE;
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) return -1;
        bfs(grid, 0, 0, 0);
        return a == Integer.MAX_VALUE ? -1 : a;
    }

    private void bfs(int[][] grid, int x, int y, int d) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || grid[x][y] == -1 || grid[x][y] == 1)
            return;

        if (x == grid.length - 1 && y == grid[0].length - 1) {
            a = Math.min(a, d + 1);
            return;
        }

        grid[x][y] = -1;

        bfs(grid, x + 1, y, d + 1);
        bfs(grid, x + 1, y - 1, d + 1);
        bfs(grid, x + 1, y + 1, d + 1);
        bfs(grid, x - 1, y + 1, d + 1);
        bfs(grid, x - 1, y + 1, d + 1);
        bfs(grid, x - 1, y + 1, d + 1);

        bfs(grid, x, y - 1, d + 1);
        bfs(grid, x, y + 1, d + 1);
        grid[x][y] = 0;
    }

}