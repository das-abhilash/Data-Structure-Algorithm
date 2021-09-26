package app.zollet.leetcode.dsalgo;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCodeSolution {


    public void execute() {

        int[][] grid = new int[][]{
                {1, 0}, {0, 1}
        };
    }

    public int largestIsland(int[][] grid) {
        int n = grid.length;//grid dimmension
        int index = 2;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int area = calcIslandArea(grid, n, i, j, index);
                    map.put(index, area);
                    index++;

                }

            }
        }

        int[][] dir = new int[][]{
                {1, 0}, {0, 1}, {-1, 0}, {0, -1}
        };
        int maxConnectedArea = map.getOrDefault(2, 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> set = new HashSet<>();
                    for (int[] d : dir) {
                        int _i = i + d[0];
                        int _j = j + d[1];

                        if (_i < 0 || _j < 0 || _i >= n || _j >= n) continue;
                        set.add(grid[_i][_j]);
                    }

                    int area = 1;
                    for (int v : set) {
                        area = area + map.get(v);
                    }

                    maxConnectedArea = Math.max(maxConnectedArea, area);

                }


            }
        }

        return maxConnectedArea;
    }


    private int calcIslandArea(int[][] grid, int n, int i, int j, int index) {//Preorder DFS Approach
        if (i < 0 || j < 0 || i >= n || j >= n || grid[i][j] != 1) return 0;

        grid[i][j] = index;

        int top = calcIslandArea(grid, n, i - 1, j, index);
        int bottom = calcIslandArea(grid, n, i + 1, j, index);
        int left = calcIslandArea(grid, n, i, j - 1, index);
        int right = calcIslandArea(grid, n, i, j + 1, index);

        return 1 + top + left + bottom + right;

    }
}