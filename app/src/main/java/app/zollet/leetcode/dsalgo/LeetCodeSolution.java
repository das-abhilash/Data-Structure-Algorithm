package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {

        int df = islandPerimeter(new int[][]{{1, 1}});
    }


    public int islandPerimeter(int[][] grid) {

        int p = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    p += getPerimeter(grid, i, j);
                }
            }
        }
        return p;
    }


    private int getPerimeter(int[][] grid, int x, int y) {
        int perimeter = 0;
        if (x - 1 < 0) {
            perimeter++;
        } else {
            if (grid[x - 1][y] == 0) {
                perimeter++;
            }
        }
        if (y - 1 < 0) {
            perimeter++;
        } else {
            if (grid[x][y - 1] == 0) {
                perimeter++;
            }
        }
        if (x + 1 >= grid.length) {
            perimeter++;
        } else {
            if (grid[x + 1][y] == 0) {
                perimeter++;
            }
        }
        if (y + 1 >= grid[0].length) {
            perimeter++;
        } else {
            if (grid[x][y + 1] == 0) {
                perimeter++;
            }
        }


        return perimeter;
    }


}