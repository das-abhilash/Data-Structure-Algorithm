package app.zollet.leetcode.dsalgo;


import java.util.Arrays;
import java.util.Comparator;

public class LeetCodeSolution {

    public void execute() {

        int sdf = minRectanglesToCoverPoints(new int[][]{{0, 0}, {1, 1}, {2, 2}, {3, 3}, {4, 4}, {5, 5}, {6, 6}}, 2);
    }

    public int minRectanglesToCoverPoints(int[][] points, int w) {


        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));

        int ans = 1;
        int last = points[0][0];
        for (int i = 1; i < points.length - 1; i++) {
            if (points[i][0] - last > w) {
                last = points[i + 1][0];
                ans++;
            }
        }

        return ans;

    }


}