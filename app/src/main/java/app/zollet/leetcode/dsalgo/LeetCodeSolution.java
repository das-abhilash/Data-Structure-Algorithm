package app.zollet.leetcode.dsalgo;


import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {



    public void execute() {

        TreeNode df = bstFromPreorder(new int[]{8,5,1,7,10,12});

    }
    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0) return null;
        i = 0;
        TreeNode root = new TreeNode(preorder[0]);
        i++;
        solve(root, preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return root;
    }

    private void solve(TreeNode root, int[] preorder, int min, int max) {
        if(i>= preorder.length) return;
        if (preorder[i] > min && preorder[i] < root.val) {
            TreeNode left = new TreeNode(preorder[i]);
            root.left = left;
            i++;
            solve(root.left, preorder, min, root.val);
        }
        if(i>= preorder.length) return;
        if (preorder[i] < max && preorder[i] > root.val) {
            TreeNode right = new TreeNode(preorder[i]);
            root.right = right;
            i++;
            solve(root.right, preorder, root.val, max);
        }
    }

}