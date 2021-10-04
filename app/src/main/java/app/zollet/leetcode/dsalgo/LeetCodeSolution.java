package app.zollet.leetcode.dsalgo;


import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {


    public void execute() {


        int s = minCut("aab");
    }

    public int minCut(String s) {
        Map<String, Integer> dp = new HashMap<>();
        Map<String, Boolean> pall = new HashMap<>();
        int sf = solve(s, 0, s.length() - 1, dp, pall);

        return sf;
    }

    private int solve(String s, int start, int end, Map<String, Integer> dp, Map<String, Boolean> pall) {
        if (start == end || isPalindrome(s, start, end, pall)) return 0;

        String key = start + "_" + end;
        if (dp.containsKey(key)) return dp.get(key);

        int min = s.length() - 1;

        for (int i = start; i <= end; i++) {
            if (isPalindrome(s, start, i, pall))
                min = Math.min(min, 1 + solve(s, i + 1, end, dp, pall));
        }

        dp.put(key, min);
        return min;

    }


    private boolean isPalindrome(String value, int start, int end, Map<String, Boolean> pall) {
        if (start >= end) return true;
        String key = start + "_" + end;
        if (pall.containsKey(key)) return pall.get(key);
        String pal = value.substring(start, end + 1);
        String reverse = (new StringBuilder(pal)).reverse().toString();
        boolean iss = pal.equals(reverse);
        pall.put(key, iss);
        return iss;
    }
}