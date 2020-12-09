package app.zollet.leetcode.dsalgo;

import java.util.ArrayList;
import java.util.List;

import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {
    }

    class BSTIterator {

        List<Integer> list;
        int p = 0;

        public BSTIterator(TreeNode root) {
            list = new ArrayList<>();
            bst(root);
            p = 0;
        }

        private void bst(TreeNode root) {
            if (root == null) return;
            bst(root.left);
            list.add(root.val);
            bst(root.right);
        }

        public int next() {
            return list.get(p++);
        }

        public boolean hasNext() {
            return p < list.size() - 1;
        }
    }

}