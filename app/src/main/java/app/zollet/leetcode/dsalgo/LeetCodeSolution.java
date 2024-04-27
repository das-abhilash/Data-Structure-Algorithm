package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
    }

    public boolean canMakeSquare(char[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (leftTop(grid, i, j)) return true;
                if (leftBottom(grid, i, j)) return true;
                if (rightTop(grid, i, j)) return true;
                if (rightBottom(grid, i, j)) return true;
            }
        }
        return false;
    }
    private boolean leftTop(char[][] grid, int i, int j) {

        int w = 0;
        int b = 0;

        if (grid[i][j] == 'B') b++;
        else w++;

        if (i - 1 >= 0 && j-1 >= 0)
            if (grid[i - 1][j - 1] == 'B') b++;
            else w++;
        if (j - 1 >= 0)
            if (grid[i][j - 1] == 'B') b++;
            else w++;
        if (i - 1 >= 0)
            if (grid[i - 1][j] == 'B') b++;
            else w++;

        return w >= 3 || b >= 3;

    }

    private boolean leftBottom(char[][] grid, int i, int j) {
        int w = 0;
        int b = 0;
        if (grid[i][j] == 'B') b++;
        else w++;
        if (j - 1 >= 0)
            if (grid[i][j - 1] == 'B') b++;
            else w++;
        if (i + 1 < 3)
            if (grid[i + 1][j] == 'B') b++;
            else w++;
        if (i + 1 < 3 && j - 1 >= 0)
            if (grid[i + 1][j - 1] == 'B') b++;
            else w++;

        return w >= 3 || b >= 3;


    }

    private boolean rightTop(char[][] grid, int i, int j) {

        int w = 0;
        int b = 0;
        if (grid[i][j] == 'B') b++;
        else w++;
        if (i - 1 >= 0)
            if (grid[i - 1][j] == 'B') b++;
            else w++;
        if (j + 1 < 3)
            if (grid[i][j + 1] == 'B') b++;
            else w++;
        if (i - 1 >= 0 && j + 1 < 3)
            if (grid[i - 1][j + 1] == 'B') b++;
            else w++;

        return w >= 3 || b >= 3;


    }

    private boolean rightBottom(char[][] grid, int i, int j) {

        int w = 0;
        int b = 0;
        if (grid[i][j] == 'B') b++;
        else w++;
        if (i + 1 < 3)
            if (grid[i + 1][j] == 'B') b++;
            else w++;
        if (j + 1 < 3)
            if (grid[i][j + 1] == 'B') b++;
            else w++;
        if (i + 1 < 3 && j + 1 < 3)
            if (grid[i + 1][j + 1] == 'B') b++;
            else w++;

        return w >= 3 || b >= 3;
    }


}