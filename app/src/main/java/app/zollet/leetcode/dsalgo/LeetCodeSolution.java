package app.zollet.leetcode.dsalgo;


import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {

    }

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) return null;

        TreeNode left = removeLeafNodes(root.left, target);
        TreeNode right = removeLeafNodes(root.right, target);

        if (left == null && right == null) {
            if (root.val == target) {

                return null;
            }
        } else if (left == null) {
            root.left = null;
        } else if (right == null) {
            root.right = null;
        }
        return root;
    }
}


