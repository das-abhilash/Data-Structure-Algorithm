package app.zollet.leetcode.dsalgo;


import java.util.LinkedList;
import java.util.Queue;

import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {
    }

    public TreeNode addOneRow(TreeNode root, int v, int d) {

        if (d == 1) {
            TreeNode treeNode = new TreeNode(v);
            treeNode.left = root;
            return treeNode;
        }

        TreeNode cur = root;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int de = 0;
        while (!q.isEmpty()) {

            de++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                if (d == de - 1) {

                    TreeNode left = node.left;
                    TreeNode right = node.right;
                    node.left = new TreeNode(v);
                    node.right = new TreeNode(v);

                    node.left.left = left;
                    node.right.right = right;

                } else {
                    if (node.left != null)
                        q.add(node.left);
                    if (node.right != null)
                        q.add(node.right);
                }
            }
            if (d == de - 1) break;
        }
        return cur;
    }

}