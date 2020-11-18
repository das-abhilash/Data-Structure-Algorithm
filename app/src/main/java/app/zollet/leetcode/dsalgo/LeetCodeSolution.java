package app.zollet.leetcode.dsalgo;


import app.zollet.leetcode.dsalgo.util.TreeNode;
import app.zollet.leetcode.dsalgo.util.TreeNodeUtill;

public class LeetCodeSolution {

    public void execute() {

        TreeNode root = TreeNodeUtill.insertLevelOrder(new int[]{2, 2, 1, -1, 1, 0, -1, 0}, new TreeNode(2), 0);
        String a = smallestFromLeaf(root);

    }

    public String smallestFromLeaf(TreeNode root) {
        if (root == null) return "";

        String left = smallestFromLeaf(root.left);
        String right = smallestFromLeaf(root.right);

        char c = ((char) (root.val + 'a'));
        String lex;
        if (left.equals("")) {
            lex = right + c;
        } else if (right.equals("")) {
            lex = left + c;
        } else {
            lex = (left + c).compareTo(right + c) > 0 ? right + c : left + c;
        }
        return lex;
    }

}