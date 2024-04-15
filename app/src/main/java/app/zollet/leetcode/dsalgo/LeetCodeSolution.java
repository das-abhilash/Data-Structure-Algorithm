package app.zollet.leetcode.dsalgo;


import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {


    }

    int ans = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        sum(root.left, true);
        sum(root.right, false);
        return ans;
    }

    private void sum(TreeNode node, boolean isLeft) {
        if (node == null) return;
        if (node.left == null && node.right == null && isLeft) {
            ans += node.val;
            return;
        }

        sum(node.left, true);
        sum(node.right, false);
    }
}