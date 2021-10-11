package app.zollet.leetcode.dsalgo;


import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {




    public void execute() {

    }
    int d = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        d = 0;

        solve(root);
        return d;
    }

    private int solve(TreeNode root) {
        if (root == null) return 0;

        int left = solve(root.left);
        int right = solve(root.right);

        d = Math.max(left + right + 1, d);

        return Math.max(left, right) + 1;
    }

}