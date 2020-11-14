package app.zollet.leetcode.dsalgo;


import java.util.LinkedList;
import java.util.Queue;

import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {
    }

    public TreeNode connect(TreeNode root) {

        if (root == null) return root;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            TreeNode last = null;
            for (int i = 0; i < size - 1; i++) {
                TreeNode node = queue.poll();
                if (i != 0) {
                    last.next = node;
                }
                last = node;
                if(node.left != null)
                queue.add(node.left);
                if(node.right != null)
                queue.add(node.right);
            }
            last.next = null;
        }
        return root;
    }

}