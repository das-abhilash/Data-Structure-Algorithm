package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {

    public void execute() {
        int a = findPermutationDifference("abc","bac");
    }

    public int findPermutationDifference(String s, String t) {

        int[] ss = new int[26];
        Arrays.fill(ss, -1);
        int[] tt = new int[26];
        Arrays.fill(tt, -1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            ss[c - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = t.charAt(i);
            tt[c - 'a'] = i;
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (ss[i] > -1) {
                ans = ans +  Math.abs(ss[i] - tt[i]);
            }
        }
        return ans;
    }

}


