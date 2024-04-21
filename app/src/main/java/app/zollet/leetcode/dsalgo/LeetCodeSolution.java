package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {

    }

    public int numberOfSpecialChars(String word) {

        boolean[] u = new boolean[26];
        boolean[] l = new boolean[26];

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                u[c - 'A'] = true;
            } else {
                l[c - 'a'] = true;
            }
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (u[i] && l[i]) {
                ans++;
            }
        }
        return ans;
    }


}