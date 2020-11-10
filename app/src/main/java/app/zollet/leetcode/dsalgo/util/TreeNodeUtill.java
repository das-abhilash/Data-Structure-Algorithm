package app.zollet.leetcode.dsalgo.util;

import java.util.List;

public class TreeNodeUtill {
    public static TreeNode insertLevelOrder(List<Integer> arr, TreeNode root,
                                            int i) {
        // Base case for recursion
        if (i < arr.size()) {
            if (arr.get(i) == -1) {
                return null;
            }
            TreeNode temp = new TreeNode(arr.get(i));
            root = temp;

            // insert left child
            root.left = insertLevelOrder(arr, root.left,
                    2 * i + 1);

            // insert right child
            root.right = insertLevelOrder(arr, root.right,
                    2 * i + 2);
        }
        return root;
    }

    public static TreeNode insertLevelOrder(int[] arr, TreeNode root, int i) {
        // Base case for recursion
        if (i < arr.length) {
            if (arr[i] == -1) {
                return null;
            }
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;

            // insert left child
            root.left = insertLevelOrder(arr, root.left,
                    2 * i + 1);

            // insert right child
            root.right = insertLevelOrder(arr, root.right,
                    2 * i + 2);
        }
        return root;
    }

    public static TreeLinkNode insertLevelOrder(List<Integer> arr, TreeLinkNode root,
                                                int i) {
        // Base case for recursion
        if (i < arr.size()) {
            TreeLinkNode temp = new TreeLinkNode(arr.get(i));
            root = temp;

            // insert left child
            root.left = insertLevelOrder(arr, root.left,
                    2 * i + 1);

            // insert right child
            root.right = insertLevelOrder(arr, root.right,
                    2 * i + 2);
        }
        return root;
    }
}
