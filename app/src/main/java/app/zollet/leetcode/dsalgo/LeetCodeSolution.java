package app.zollet.leetcode.dsalgo;

import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {


    public void execute() {
    }

    public TreeNode convertBST(TreeNode root) {

        solve(root, 0);
        return root;
    }

    private int solve(TreeNode node, int sum) {
        if (node == null) return 0;


        if (node.left == null && node.right == null) {
            node.val = sum + node.val;
            return node.val;
        }
        int val = node.val;
        int right = solve(node.right, sum);
        node.val = right == 0 ? val + sum : right + val;

        int left = solve(node.left, node.val);

        return left == 0 ? node.val : left;
    }

}