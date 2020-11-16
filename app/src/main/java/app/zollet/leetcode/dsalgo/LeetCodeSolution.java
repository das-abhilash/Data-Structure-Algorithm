package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
        int a = longestMountain(new int[]{3, 4, 3, 5, 4, 6, 3, 3, 2, 4, 2});
    }

    public int longestMountain(int[] A) {

        int answer = 0;
        int in = 0;
        int de = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                if (de > 0) {
                    de = 0;
                    in = 0;
                }
                if (in == 0) in = 2;
                else in++;
            } else if (A[i] < A[i - 1]) {
                if (de == 0)
                    de = 2;
                else
                    de++;
                if (in != 0)
                    answer = Math.max(answer, in + de - 1);
            } else {
                in = 0;
                de = 0;
            }
        }
        return answer;
    }

}