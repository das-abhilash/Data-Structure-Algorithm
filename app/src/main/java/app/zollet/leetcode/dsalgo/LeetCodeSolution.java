package app.zollet.leetcode.dsalgo;


import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {


    }

    int sum = 0;

    public int sumNumbers(TreeNode root) {

        if (root.left == null && root.right == null) {
            return root.val;
        }
        if (root.left != null)
            solve(root.left, root.val);
        if (root.right != null)
            solve(root.right, root.val);
        return sum;
    }

    private void solve(TreeNode node, int value) {
        if (node.left == null && node.right == null) {
            sum = (value * 10 + node.val) + sum;
            return;
        }

        if (node.left != null)
            solve(node.left, value * 10 + node.val);
        if (node.right != null)
            solve(node.right, value * 10 + node.val);


    }

}