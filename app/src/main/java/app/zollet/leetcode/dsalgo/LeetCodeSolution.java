package app.zollet.leetcode.dsalgo;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {
        int a = lengthOfLongestSubstring("aab");
    }

    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) return 0;

        Map<Character, Integer> map = new HashMap<>();
        int a = -1;
        int in = 0;
        map.put(s.charAt(0), 0);

        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                int ind = map.get(c);
                if (ind >= in) {
                    a = Math.max(a, i - in);
                    in = ind + 1;
                }
            }
            map.put(c, i);
        }
        a = Math.max(a, s.length() -1 - in);
        return a;
    }
}