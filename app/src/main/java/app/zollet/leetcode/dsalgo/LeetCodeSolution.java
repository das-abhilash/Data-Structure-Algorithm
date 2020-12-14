package app.zollet.leetcode.dsalgo;

import app.zollet.leetcode.dsalgo.util.TreeNode;
import app.zollet.leetcode.dsalgo.util.TreeNodeUtill;

public class LeetCodeSolution {

    public void execute() {
        TreeNode root = TreeNodeUtill.insertLevelOrder(new int[]{3, 5, 1, 6, 2, 0, 8, -1, -1, 7, 4}, new TreeNode(3), 0);
        TreeNode a = subtreeWithAllDeepest(root);
    }

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        solve(root, 0);
        return solve(root, 0).first;
    }

    class Pair {
        TreeNode first;
        int second;

        public Pair(TreeNode first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    private Pair solve(TreeNode node, int d) {
        if (node == null) return new Pair(null, d);

        Pair pL = solve(node.left, d + 1);
        Pair pR = solve(node.right, d + 1);

        if (pL.first == null && pR.first == null) return new Pair(node, d);
        if (pL.first == null) return pR;
        if (pR.first == null) return pL;

        if (pL.second > pR.second) {
            return pL;
        } else if (pR.second > pL.second) {
            return pR;
        } else {
            return new Pair(node, Math.max(pL.second, pR.second));
        }
    }

}