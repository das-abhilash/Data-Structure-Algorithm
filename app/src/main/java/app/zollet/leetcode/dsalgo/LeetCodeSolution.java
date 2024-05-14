package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {

    }

    public int matrixScore(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < grid[0].length; j++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }

        for (int j = 1; j < grid[0].length; j++) {
            int count = 0;
            for (int[] ints : grid) {
                if (ints[j] == 0) {
                    count++;
                }
            }

            if (count > grid.length - count) {
                for (int i = 0; i < grid.length; i++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }

        int ans = 0;

        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                ans = ans + (ints[j] << (grid[0].length - j - 1));
            }
        }
        return ans;
    }

}


