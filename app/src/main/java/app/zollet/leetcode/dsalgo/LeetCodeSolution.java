package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {

    public void execute() {
//        int[] a = solve(new int[]{5, 20, 3, 1, 26, 2, 50, 4, 19});
        int[] a = solve(new int[]{5, 3, 1, 2, 4});
        int[] a1 = solve(new int[]{1,2,5,6,8,9});
        int[] a2 = solve(new int[]{1,1,1,1,1});
    }

    private int[] solve(int[] a) {
        if (a.length < 2) return a;
        Arrays.sort(a);

        int si = 0;
        int ei = 0;
        int ll = 1;
        int i = 1;

        while (i < a.length) {
            int l = 1;
            int s = i -1;
            while (i < a.length && a[i] == a[i - 1]+1) {
                i++;
                l++;
            }

            if (l > ll) {
                si = s;
                ei = i - 1;
                ll = l;
            }
            i++;
        }

        int[] aa = new int[ll];
        int k = 0;
        for (int j = si; j <= ei; j++) {
            aa[k++] = a[j];
        }
        return aa;
    }

}