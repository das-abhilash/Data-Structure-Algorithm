package app.zollet.leetcode.dsalgo;


import app.zollet.leetcode.dsalgo.util.TreeNode;
import app.zollet.leetcode.dsalgo.util.TreeNodeUtill;

public class LeetCodeSolution {

    public void execute() {

        TreeNode root = TreeNodeUtill.insertLevelOrder(new int[]{1, 2, 3, -1, 4, -1, 5}, new TreeNode(1), 0);

        boolean a = isCousins(root, 5, 4);
    }

    TreeNode NX = null;
    TreeNode NY = null;
    int DX = 0;
    int DY = 0;

    public boolean isCousins(TreeNode root, int x, int y) {

        if (root == null) return false;

        findX(root, x, 0);
        findY(root, y, 0);
        return NX != NY && DX == DY;
    }

    private void findX(TreeNode node, int f, int d) {
        if (node == null) return;
        if (node.left != null && node.left.val == f) {
            NX = node;
            DX = d+1;
            return;
        } else if (node.right != null && node.right.val == f) {
            NX = node;
            DX = d+1;
            return;
        }
        findX(node.left, f, d + 1);
        findX(node.right, f, d + 1);
    }

    private void findY(TreeNode node, int f, int d) {
        if (node == null) return;
        if (node.left != null && node.left.val == f) {
            NY = node;
            DY = d+1;
            return;
        } else if (node.right != null && node.right.val == f) {
            NY = node;
            DY = d+1;
            return;
        }
        findY(node.left, f, d + 1);
        findY(node.right, f, d + 1);
    }

}