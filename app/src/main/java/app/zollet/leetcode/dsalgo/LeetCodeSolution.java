package app.zollet.leetcode.dsalgo;


import java.util.LinkedList;
import java.util.Queue;

import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {

    }


    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if (depth == 1) {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int d = 1;
        while (!queue.isEmpty() && d < depth - 1) {
            d++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
        }


        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            TreeNode left = node.left;
            TreeNode right = node.right;

            node.left = new TreeNode(val);
            node.right = new TreeNode(val);

            node.left.left = left;
            node.right.right = right;
        }


        return root;
    }

}