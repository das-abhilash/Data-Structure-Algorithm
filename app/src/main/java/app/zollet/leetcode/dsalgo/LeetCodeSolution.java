package app.zollet.leetcode.dsalgo;


import app.zollet.leetcode.dsalgo.util.TreeNode;
import app.zollet.leetcode.dsalgo.util.TreeNodeUtill;

public class LeetCodeSolution {

    public void execute() {

        TreeNode root = TreeNodeUtill.insertLevelOrder(new int[]{25, 1, -1, 0, 0, 1, -1, -1, -1, 0}, new TreeNode(1), 0);

        String h = smallestFromLeaf(root);
    }


    public String smallestFromLeaf(TreeNode root) {

        return solve(root, "");
    }

    private String solve(TreeNode node, String value) {

        value = (char) ('a' + node.val) + value;

        if (node.left == null && node.right == null) return value;

        if (node.left == null || node.right == null){
            if(node.left != null)
            return solve(node.left, value);
            else
                return solve(node.right, value);
        }

        String left = solve(node.left, value);
        String right = solve(node.right, value);
        if (left.compareTo(right) <= 0) return left;
        else return right;

    }
}