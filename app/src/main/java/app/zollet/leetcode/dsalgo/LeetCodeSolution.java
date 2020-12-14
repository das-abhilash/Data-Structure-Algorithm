package app.zollet.leetcode.dsalgo;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeSolution {

    public void execute() {
        List<List<String>> a = partition("aab");
    }

    List<List<String>> an = new ArrayList<>();

    public List<List<String>> partition(String s) {

        solve(s, new ArrayList<>());
        return an;
    }

    private void solve(String s, List<String> a) {

        if (s.length() == 0) {
            List<String> l = new ArrayList<>(a);
            an.add(l);
            return;
        }

        for (int i = 0; i < s.length(); i++) {

            String ss = s.substring(0, i+1);
            if (isPalindrome(ss)) {
                a.add(ss);
                solve(s.substring(i+1), a);
                a.remove(a.size() - 1);
            }
        }

    }

    private boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }

}