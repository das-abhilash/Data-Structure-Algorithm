package app.zollet.leetcode.dsalgo;


import app.zollet.leetcode.dsalgo.util.ListNode;
import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {


    public void execute() {

    }


    public int maxDepth(Node root) {
        if (root == null) return 0;

        List<Node> nodes = root.children;
        int d = 0;
        for (int i = 0; i < nodes.size(); i++) {
            Node n = nodes.get(i);
            int cd = maxDepth(nodes);
            d = Math.max(d,cd);
        }
        return d + 1;
    }

}