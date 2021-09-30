package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import app.zollet.leetcode.dsalgo.util.Node;

public class LeetCodeSolution {


    public void execute() {

    }

    public List<List<Integer>> levelOrder(Node root) {

        if (root == null) return new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                list.add(node.val);
                queue.addAll(node.children);
            }
            answer.add(list);
        }
        return answer;
    }
}