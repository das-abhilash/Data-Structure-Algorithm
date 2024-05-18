package app.zollet.leetcode.dsalgo;


import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {

    public void execute() {

    }

    int moves = 0;

    public int distributeCoins(TreeNode root) {
        moves = 0;
        solve(root);
        return moves;
    }


    int solve(TreeNode node) {

        if (node == null) return 0;

        int left = solve(node.left);
        int right = solve(node.right);

        moves = moves + Math.abs(left) + Math.abs(right);

        return node.val - 1 + left + right;
    }

}


