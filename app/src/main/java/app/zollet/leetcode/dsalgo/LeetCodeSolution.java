package app.zollet.leetcode.dsalgo;

import java.util.Arrays;

public class LeetCodeSolution {

    public void execute() {
        int a = findJudge(1,new int[][]{});
    }

    public int findJudge(int N, int[][] trust) {
        int[] c = new int[N];
        Arrays.fill(c, 0);
        for (int[] ints : trust) {
            c[ints[1] - 1]++;
            c[ints[0] - 1]--;
        }

        int a = -1;

        for (int i = 0; i < N; i++) {
            if (c[i] == N - 1) {
                if (a == -1)
                    a = i;
                else
                    return -1;
            }
        }
        return a == -1 ? -1 : a + 1;
    }

}