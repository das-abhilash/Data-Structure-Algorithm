package app.zollet.leetcode.dsalgo;

import app.zollet.leetcode.dsalgo.util.TreeNode;
import app.zollet.leetcode.dsalgo.util.TreeNodeUtill;

public class LeetCodeSolution {

    public void execute() {
        TreeNode root = TreeNodeUtill.insertLevelOrder(new int[]{2,3,1,3,1,-1,1}, new TreeNode(2), 0);

        int aa = pseudoPalindromicPaths(root);

    }

    int a = 0;

    public int pseudoPalindromicPaths(TreeNode root) {
        int[] c = new int[9];
        solve(root, c);
        return a;
    }

    private void solve(TreeNode node, int[] c) {
        c[node.val - 1]++;
        if (node.right == null && node.left == null) {
            boolean isOdd = false;
            for (int i = 0; i < 9; i++) {
                if (c[i] % 2 != 0) {
                    if (isOdd) {
                        c[node.val - 1]--;
                        return;
                    } else
                        isOdd = true;
                }
            }
            a++;
        } else {
            if (node.left != null)
                solve(node.left, c);
            if (node.right != null)
                solve(node.right, c);
        }
        c[node.val - 1]--;
    }

}