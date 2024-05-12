package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
        int[][] a = largestLocal(new int[][] {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}});
    }

    public int[][] largestLocal(int[][] grid) {

        int[][] ans = new int[grid.length - 2][grid.length - 2];


        for (int i = 0; i < grid.length - 2; i++) {
            for (int j = 0; j < grid.length - 2; j++) {
                ans[i][j] = calculate(grid, i, j);
            }
        }


        return ans;
    }

    private int calculate(int[][] grid, int x, int y) {
        int max = 0;

        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }


}


