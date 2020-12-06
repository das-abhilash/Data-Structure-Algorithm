package app.zollet.leetcode.dsalgo;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCodeSolution {

    public void execute() {
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    ;

    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            Node prev = null;
            for (int i = 0; i < size; i++) {
                Node pop = queue.poll();
                if (pop.left != null) queue.add(pop.left);
                if (pop.right != null) queue.add(pop.right);
                if (i != 0) {
                    prev.next = pop;
                }
                prev = pop;
            }
            prev.next = null;
        }
        return root;
    }

}