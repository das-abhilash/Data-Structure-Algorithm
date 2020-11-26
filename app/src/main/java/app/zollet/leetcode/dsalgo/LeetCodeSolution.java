package app.zollet.leetcode.dsalgo;

import java.util.Arrays;

public class LeetCodeSolution {

    public void execute() {
        int a = longestSubstring("aaabb", 3);
    }

    public int longestSubstring(String s, int k) {
        if (k > s.length()) return 0;
        if (s.length() == 0) return 0;
        if (k == 0 || k == 1) return s.length();

        int[] c = new int[26];
        Arrays.fill(c, 0);

        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;

        }
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            max = Math.max(max, c[i]);
            if (c[i] != 0)
                min = Math.min(min, c[i]);
        }

        if (max < k) return 0;
        if (min >= k) return s.length();
        if (k == s.length() && max == k) return s.length();

        int a = 0;

        int l = -1;
        for (int i = 0; i < s.length(); i++) {
            if (c[s.charAt(i) - 'a'] < k) {
                a = Math.max(a, longestSubstring(s.substring(l + 1, i), k));
                l = i;
            }
        }

        if (l < s.length())
            a = Math.max(a, longestSubstring(s.substring(l + 1), k));
        return a;
    }

    private int find(String s, int k) {
        if (s.length() == 0) return 0;

        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (c[i] > 0 && c[i] < k) return 0;
        }
        return s.length();
    }

}