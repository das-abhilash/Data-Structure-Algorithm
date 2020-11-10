package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {

    }

    public int[][] flipAndInvertImage(int[][] A) {

        for (int i = 0; i < A.length; i++) {
            int l = 0;
            int r = A[i].length - 1;
            int[] a = A[i];
            while (l <= r) {
                int L = a[l];
                int R = a[r];

                a[l] = R ^ 1;
                a[r] = L ^ 1;
                l++;
                r--;
            }
        }
        return A;
    }

}