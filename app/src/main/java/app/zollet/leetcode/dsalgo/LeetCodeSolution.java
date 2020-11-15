package app.zollet.leetcode.dsalgo;


import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {
    }

    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        sum = 0;
        solve(root, low, high);
        return sum;
    }

    private void solve(TreeNode root, int low, int high) {
        if (root == null) return;

        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        solve(root.left, low, high);
        solve(root.right, low, high);
    }

}