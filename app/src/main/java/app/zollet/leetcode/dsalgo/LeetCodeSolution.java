package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.List;

import app.zollet.leetcode.dsalgo.util.TreeNode;

import static app.zollet.leetcode.dsalgo.util.TreeNodeUtill.insertLevelOrder;

public class LeetCodeSolution {


    public void execute() {


        TreeNode root = insertLevelOrder(new int[]{5, 4, 8, 11, -1, 13, 4, 7, 2, -1, -1, 5, 1}, new TreeNode(5), 0);
        pathSum(root,22);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        solve(root, targetSum, answer, list);
        return answer;
    }

    private void solve(TreeNode node, int targetSum, List<List<Integer>> answer, List<Integer> list) {

        if(node == null) return;
        if (node.left == null && node.right == null) {
            if (targetSum - node.val== 0) {
                list.add(node.val);
                answer.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
            }
            return;
        }
        list.add(node.val);
        if (node.left != null) {
            solve(node.left, targetSum - node.val, answer, list);
        }
        if (node.right != null) {
            solve(node.right, targetSum - node.val, answer, list);
        }
        list.remove(list.size() - 1);
    }

}