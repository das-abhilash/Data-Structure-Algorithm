package app.zollet.leetcode.dsalgo;


import static app.zollet.leetcode.dsalgo.util.ListUtil.convertArrayToList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCodeSolution {

    public void execute() {

        int a = maximumSafenessFactor(convertArrayToList(new int[][]{{0, 0, 1}, {0, 0, 0}, {0, 0, 0}}));

    }

    final int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int maximumSafenessFactor(List<List<Integer>> grid) {

        int n = grid.size();
        Queue<int[]> queue = new LinkedList<>();

        int[][] dis = new int[n][n];
        boolean[][] isVisited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        int distance = 0;

        while (!queue.isEmpty()) {
            distance++;

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] pos = queue.poll();

                for (int j = 0; j < dir.length; j++) {

                    int ii = pos[0] + dir[j][0];
                    int jj = pos[1] + dir[j][1];

                    if (isValidCell(n, ii, jj) && !isVisited[ii][jj]) {
                        isVisited[ii][jj] = true;
                        dis[ii][jj] = distance;
                        queue.add(new int[]{ii, jj});
                    }
                }
            }
        }

        int left = 0;
        int right = distance;

        int ans = 0;
        while (left <= right) {

            int mid = left + (right - left) / 2;

            boolean[][] visited = new boolean[n][n];
            if (dfs(grid, mid, 0, 0, dis, visited)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        return ans;
    }

    private boolean dfs(List<List<Integer>> grid, int safeness, int x, int y, int[][] mat, boolean[][] visited) {
        if (!isValidCell(grid.size(), x, y) || visited[x][y] || grid.get(x).get(y) == 1 || mat[x][y] < safeness) {
            return false;
        }

        if (x == grid.size() - 1 && y == grid.size() - 1) {
            return true;
        }

        visited[x][y] = true;
        for (int i = 0; i < dir.length; i++) {
            int ii = x + dir[i][0];
            int jj = y + dir[i][1];
            if (dfs(grid, safeness, ii, jj, mat, visited)) {
                return true;
            }
        }

        return false;
    }

    private boolean isValidCell(int size, int i, int j) {
        return i >= 0 && j >= 0 && i < size && j < size;
    }
}


