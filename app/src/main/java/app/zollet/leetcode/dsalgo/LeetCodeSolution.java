package app.zollet.leetcode.dsalgo;


import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {
    }

    int a = 0;
    public int distributeCoins(TreeNode root) {
        a = 0;
        solve(root);
        return a;
    }

    private int solve(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null && root.right == null) return root.val - 1;

        int left = solve(root.left);
        int right = solve(root.right);

        int c = left + right + root.val - 1;

        if (c != 0)
            a += Math.abs(c);
        return c;
    }

}