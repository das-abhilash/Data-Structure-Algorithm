package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
        int[][] g = generateMatrix(3);
    }

    public int[][] generateMatrix(int n) {
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = -1;
            }
        }

        solveLR(grid, 0, 0, 1, n);
        return grid;
    }

    private void solveLR(int[][] grid, int x, int y, int v, int n) {
        if (x < 0 || y < 0 || x >= n || y >= n || grid[x][y] != -1) return;

        for (; y < n && grid[x][y] == -1; y++) {
            grid[x][y] = v++;
        }
        solveTB(grid, x+1, y-1, v, n);
    }

    private void solveTB(int[][] grid, int x, int y, int v, int n) {
        if (x < 0 || y < 0 || x >= n || y >= n || grid[x][y] != -1) return;

        for (; x < n && grid[x][y] == -1; x++) {
            grid[x][y] = v++;
        }
        solveRL(grid, x-1, y-1, v, n);
    }

    private void solveRL(int[][] grid, int x, int y, int v, int n) {
        if (x < 0 || y < 0 || x >= n || y >= n || grid[x][y] != -1) return;

        for (; y >= 0 && grid[x][y] == -1; y--) {
            grid[x][y] = v++;
        }
        solveBT(grid, x-1, y+1, v, n);
    }

    private void solveBT(int[][] grid, int x, int y, int v, int n) {
        if (x < 0 || y < 0 || x >= n || y >= n || grid[x][y] != -1) return;

        for (; x >= 0 && grid[x][y] == -1; x--) {
            grid[x][y] = v++;
        }
        solveLR(grid, x+1, y+1, v, n);
    }
}