package app.zollet.leetcode.dsalgo;

import java.util.Arrays;

public class LeetCodeSolution {

    public void execute() {
        int a = nextGreaterElement(12443322);
    }

    public int nextGreaterElement(int n) {

        StringBuilder s = new StringBuilder(String.valueOf(n));

        for (int i = s.length() - 2; i >= 0; i--) {

            if ((s.charAt(i) - '0') < (s.charAt(i + 1) - '0')) {
                char c = s.charAt(i + 1);

                char cc = s.charAt(i);
                int idx = i + 1;
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) > cc && s.charAt(j) < c) {
                        c = s.charAt(j);
                        idx = j;
                    }
                }
                s.setCharAt(i, c);
                s.setCharAt(idx, cc);

                if (Long.parseLong(s.toString()) > Integer.MAX_VALUE) return -1;
                else {
                    char[] a = s.substring(i + 1).toCharArray();
                    Arrays.sort(a);
                    String ss = s.substring(0, i + 1) + new String(a);
                    return Integer.parseInt(ss);
                }
            }
        }
        return -1;
    }

}