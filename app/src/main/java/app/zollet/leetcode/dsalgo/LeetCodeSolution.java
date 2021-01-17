package app.zollet.leetcode.dsalgo;

import java.util.Arrays;

import app.zollet.leetcode.dsalgo.util.ListNode;

public class LeetCodeSolution {

    public void execute() {
        int aa = countVowelStrings(5);
    }

    public int countVowelStrings(int n) {

        if (n == 1) return 5;
        int[] a = new int[5];
        Arrays.fill(a, 1);

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 5; j++) {
                int m = 0;
                for (int k = j; k < 5; k++) {
                    m += a[k];
                }
                a[j] = m;
            }
        }
        int aa = 0;
        for (int i = 0; i < 5; i++) {
            aa += a[i];
        }
        return aa;
    }
}