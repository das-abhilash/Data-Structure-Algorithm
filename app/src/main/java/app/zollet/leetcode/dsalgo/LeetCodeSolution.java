package app.zollet.leetcode.dsalgo;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

import app.zollet.leetcode.dsalgo.util.TreeNode;
import app.zollet.leetcode.dsalgo.util.TreeNodeUtill;

public class LeetCodeSolution {
    public void execute() {
        TreeNode root = TreeNodeUtill.insertLevelOrder(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new TreeNode(1), 0);
        rob(root);
    }

    public int rob(TreeNode root) {
        if (root == null) return 0;
        Map<String, Integer> map = new HashMap<>();


        solve(root, 0, 0, map);


        return map.get(0 + "-" + 0 + "-" + root.val);

    }

    private int solve(TreeNode node, int x, int y, Map<String, Integer> map) {
        if (node == null) {
            map.put(x + "-" + y + "-" + 0, 0);
            return 0;
        }

        if (map.containsKey(x + "-" + y + "-" + node.val))
            return map.get(x + "-" + y + "-" + node.val);

        Log.d("mehbla", node.val + "");

        int cl = solve(node.left, x - 1, y + 1, map);
        int cr = solve(node.right, x + 1, y + 1, map);

        int c = cl + cr;

        int ccll = (node.left == null) ? 0 : solve(node.left.left, x - 2, y + 2, map);
        int cclr = (node.left == null) ? 0 : solve(node.left.right, x, y + 2, map);
        int ccrl = (node.right == null) ? 0 : solve(node.right.left, x, y + 2, map);
        int ccrr = (node.right == null) ? 0 : solve(node.right.right, x + 2, y + 2, map);


        int a = Math.max(cl + cr, ccll + cclr + ccrl + ccrr + node.val);
        map.put(x + "-" + y + "-" + node.val, a);
        return a;
    }

}