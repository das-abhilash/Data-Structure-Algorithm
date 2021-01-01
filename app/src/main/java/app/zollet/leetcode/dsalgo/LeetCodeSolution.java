package app.zollet.leetcode.dsalgo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCodeSolution {

    public void execute() {
        List<String> w = new ArrayList<>();
        w.add("apple");
        w.add("pen");
        boolean a = wordBreak("applepenapple", w);
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> invalid = new HashSet<>();
        Set<String> set = new HashSet<>(wordDict);
        if (set.contains(s)) return true;

        return solve(s, 0, set, invalid);

    }

    private boolean solve(String s, int i, Set<String> wordDict, Set<String> set) {

        if (set.contains(s)) return false;
        if (wordDict.contains(s)) return true;
        for (int k = i + 1; k < s.length(); k++) {
            String ss = s.substring(i, k);
            if (wordDict.contains(ss)) {
                if (solve(s.substring(k), 0, wordDict, set)) return true;
            }
        }
        set.add(s);
        return false;
    }
}