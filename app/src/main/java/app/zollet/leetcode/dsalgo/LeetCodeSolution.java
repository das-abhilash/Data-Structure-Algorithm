package app.zollet.leetcode.dsalgo;

import java.util.Arrays;

public class LeetCodeSolution {
    public void execute() {
        String a = getSmallestString(5,31);
    }

    public String getSmallestString(int n, int k) {

        int[] a = new int[n];
        Arrays.fill(a, 1);

        k = k - n;

        for (int i = a.length - 1; i >= 0; i--) {
            if (k < 26) {
                a[i] = k +1;
                break;
            } else {
                a[i] = 26;
                k = k + 1 - 26;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            sb.append((char) (a[i] + 'a' -1));
        }
        return sb.toString();
    }

}