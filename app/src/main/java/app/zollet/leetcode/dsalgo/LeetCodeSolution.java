package app.zollet.leetcode.dsalgo;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeSolution {

    public void execute() {
        List<Integer> a = spiralOrder(new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        });
    }

    public List<Integer> spiralOrder(int[][] matrix) {


        List<Integer> a = new ArrayList<>();
        int l = 0;
        int r = matrix[0].length;
        int t = 0;
        int b = matrix.length;


        int x = 0;
        int y = 0;
        while (true) {

            int sdf = 0;
            for (; y < r; y++) {
                a.add(matrix[x][y]);
            }
            y--;
            x++;
            t++;
            if (l >= r || t >= b) break;
            for (; x < b; x++) {
                a.add(matrix[x][y]);
            }
            y--;
            x--;
            r--;
            if (l >= r || t >= b) break;

            for (; y >= l; y--) {
                a.add(matrix[x][y]);
            }
            y++;
            x--;
            b--;

            if (l >= r || t >= b) break;

            for (; x >= t; x--) {
                a.add(matrix[x][y]);
            }
            x++;
            y++;
            l++;
            if (l >= r || t >= b) break;

        }

        return a;
    }

}