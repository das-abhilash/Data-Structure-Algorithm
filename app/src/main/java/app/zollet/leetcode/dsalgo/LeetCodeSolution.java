package app.zollet.leetcode.dsalgo;


import java.util.HashSet;
import java.util.Set;

public class LeetCodeSolution {


    public void execute() {

        int[][] grid = new int[][]{
                {0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}
        };
        int a = islandPerimeter(grid);
    }

    public int islandPerimeter(int[][] grid) {

        int answer = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1) {

                    if (i - 1 < 0 || grid[i - 1][j] == 0) {
                        answer++;
                    }
                    if (j - 1 < 0 || grid[i][j - 1] == 0) {
                        answer++;
                    }
                    if (i + 1 >= grid.length || grid[i + 1][j] == 0) {
                        answer++;
                    }
                    if (j + 1 >= grid[0].length || grid[i][j + 1] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}