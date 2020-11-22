package app.zollet.leetcode.dsalgo;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCodeSolution {
    public void execute() {
        int a = minimumEffort(new int[][]{
                {3, 3},
                {1, 6},
                {1, 10},
                {1, 2},
                {4, 7},
                {2, 4}
        });
    }

    public int minimumEffort(int[][] tasks) {
        if (tasks.length == 0) return 0;
        Arrays.sort(tasks, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare( (a[1] - a[0]) , (b[1] - b[0]))*-1;
            }
        });
        int a = solve(tasks);
        return a;
    }
    private int solve(int[][] tasks) {
        int a = tasks[0][1];
        int l = a - tasks[0][0];

        for (int i = 1; i < tasks.length; i++) {
            int[] t = tasks[i];

            if (t[1] > l) {
                a += (t[1] - l);
                l = t[1] - t[0];
            } else {
                l = l - t[0];
            }
        }
        return a;
    }

}