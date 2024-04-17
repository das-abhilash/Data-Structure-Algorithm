package app.zollet.leetcode.dsalgo.util;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public static TreeNode createTree(int[] values) {
        if (values == null || values.length == 0) return null;

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int index = 1;
        while (!queue.isEmpty() && index < values.length) {
            TreeNode current = queue.poll();

            // Add left child
            if (index < values.length && values[index] != -1) {
                current.left = new TreeNode(values[index]);
                queue.offer(current.left);
            }
            index++;

            // Add right child
            if (index < values.length && values[index] != -1) {
                current.right = new TreeNode(values[index]);
                queue.offer(current.right);
            }
            index++;
        }

        return root;
    }

    //         TreeNode root = TreeNodeUtill.insertLevelOrder(new int[]{25,1,-1,0,0,1,-1,-1,-1,0}, new TreeNode(25), 0);
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
