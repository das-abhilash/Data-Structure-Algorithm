package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {

    public void execute() {

        int a = numberOfSpecialChars("AbBCab");
    }

    public int numberOfSpecialChars(String word) {

        int[] l = new int[26];
        int[] u = new int[26];
        Arrays.fill(u,-1);
        Arrays.fill(l,-1);
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLowerCase(c)) {
                l[c - 'a'] = Math.max(l[c - 'a'], i);
            } else {
                if (u[c - 'A'] == -1)
                    u[c - 'A'] =  i;
            }
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (l[i] != -1 && u[i] > l[i]) {
                ans++;
            }
        }
        return ans;
    }


}