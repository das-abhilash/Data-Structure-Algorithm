package app.zollet.leetcode.dsalgo;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {

    }


    public int numDecodings(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        return solve(s, 0, map);
    }

    private int solve(String s, int i, Map<Integer, Integer> map) {
        if (i == s.length()) {
            return 1;
        } else if (i > s.length()) {
            return 0;
        }

        if (map.containsKey(i)) return map.get(i);

        int a = 0;
        char c = s.charAt(i);
        if (c >= '3' && c <= '9') {
            a += solve(s, i + 1, map);
        } else if (c == '2') {
            a += solve(s, i + 1, map);
            if (i < s.length() - 1 && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '6')
                a += solve(s, i + 2, map);
        } else if (c == '1') {
            a += solve(s, i + 1, map);
            if (i < s.length() - 1 && s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9')
                a += solve(s, i + 2, map);
        }
        map.put(i, a);
        return a;
    }
}