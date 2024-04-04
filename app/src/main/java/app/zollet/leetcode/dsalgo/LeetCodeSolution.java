package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {

    }

    public int maxDepth(String s) {
        int ans = 0;
        int curDepth = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                curDepth++;
                ans = Math.max(curDepth, ans);
            } else if (s.charAt(i) == ')') {
                curDepth--;
            }
        }
        return ans;

    }
}