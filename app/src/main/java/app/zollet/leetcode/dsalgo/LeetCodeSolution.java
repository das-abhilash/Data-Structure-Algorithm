package app.zollet.leetcode.dsalgo;

import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original.val == target.val) return cloned;


        if (original.left != null) {
            TreeNode left = getTargetCopy(original.left, cloned.left, target);
            if (left != null) return left;
        }

        if(original.right != null) {
            TreeNode right = getTargetCopy(original.right, cloned.right, target);
            if (right != null) return right;
        }
        return null;
    }
}