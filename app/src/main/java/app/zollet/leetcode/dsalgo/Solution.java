package app.zollet.leetcode.dsalgo;

import app.zollet.leetcode.dsalgo.util.TreeNode;
import app.zollet.leetcode.dsalgo.util.TreeNodeUtill;

public class Solution {

  public void execute() {

    TreeNode root = TreeNodeUtill.insertLevelOrder(new int[]{8, 3, 10, 1, 6, -1, 14, -1, -1, 4, 7, 13}, new TreeNode(8), 0);
    int s = maxAncestorDiff(root);
  }

  int a = 0;

  public int maxAncestorDiff(TreeNode root) {
    a = 0;
    solve(root);
    return a;
  }

  private int[] solve(TreeNode root) {
    if (root == null) return new int[]{0, 0};

    int[] left = solve(root.left);
    int[] right = solve(root.right);

    if (root.left == null && root.right != null) {
      a = Math.max(a, Math.max(Math.abs(root.val - right[0]), Math.abs(root.val - right[1])));
      return new int[]{Math.max(root.val, right[0]), Math.min(root.val, right[1])};
    } else if (root.left != null && root.right == null) {
      a = Math.max(a, Math.max(Math.abs(root.val - left[0]), Math.abs(root.val - left[1])));
      return new int[]{Math.max(root.val, left[0]), Math.min(root.val, left[1])};
    } else if (root.left == null) {
      return new int[]{root.val, root.val};
    } else {

      int one = Math.abs(root.val - Math.max(left[0], right[0]));
      int two = Math.abs(root.val - Math.min(left[1], right[1]));

      a = Math.max(a, Math.max(one, two));
      return new int[]{Math.max(root.val, Math.max(left[0], right[0])), Math.min(root.val, Math.min(right[1], left[1]))};
    }
  }
}