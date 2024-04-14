package app.zollet.leetcode.dsalgo;


import java.util.LinkedList;
import java.util.Queue;

public class LeetCodeSolution {

    public void execute() {
    }

    public int scoreOfString(String s) {
        int ans = 0;

        for (int i = 1; i < s.length(); i++) {
            ans = ans + Math.abs(s.charAt(i) - s.charAt(i-1));
        }
        return ans;
    }
}