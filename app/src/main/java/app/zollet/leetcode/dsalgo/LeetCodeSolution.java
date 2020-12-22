package app.zollet.leetcode.dsalgo;

import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {

    }

    class Pair {
        boolean first;
        int second;

        public Pair(boolean first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public boolean isBalanced(TreeNode root) {
        return solve(root).first;
    }

    private Pair solve(TreeNode root) {
        if (root == null) return new Pair(true, 1);

        Pair l = solve(root.left);
        Pair r = solve(root.right);

        return new Pair(l.first && r.first && Math.abs(l.second - r.second) <= 1, Math.max(l.second, r.second) + 1);
    }

}