package app.zollet.leetcode.dsalgo;

import java.util.ArrayList;
import java.util.List;

import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {
    }

    List<Integer> list = new ArrayList<>();

    public TreeNode increasingBST(TreeNode root) {
        list = new ArrayList<>();
        solve(root);

        if (list.size() == 0) return null;
        TreeNode treeNode = new TreeNode(list.get(0));

        TreeNode cur = treeNode;
        for (int i = 1; i < list.size(); i++) {
            cur.right = new TreeNode(list.get(i));
            cur = cur.right;

        }
        return treeNode;
    }

    private void solve(TreeNode root) {
        if (root == null) return;
        solve(root.left);
        list.add(root.val);
        solve(root.right);
    }

    /*private TreeNode solve(TreeNode node) {
        if (node == null) return null;

        TreeNode left = solve(node.left);
        if (left == null) {
            if (node.right == null) {
                return node;
            }
            return node.right;
        } else if (node.right == null) {
            left.right = node;
            return node;
        } else {
            left.right = node;
            return node.right;
        }
    }*/

}