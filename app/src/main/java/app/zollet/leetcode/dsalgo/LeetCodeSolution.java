package app.zollet.leetcode.dsalgo;


import java.util.Stack;

import app.zollet.leetcode.dsalgo.util.ListNode;

public class LeetCodeSolution {

    public void execute() {
    }


    public ListNode removeNodes(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        stack.add(head.val);
        head = head.next;

        while (head != null) {
            while (!stack.isEmpty() && stack.peek() < head.val) {
                stack.pop();
            }

            stack.add(head.val);
            head = head.next;
        }

        ListNode dummy = new ListNode();

        while (!stack.isEmpty()) {

            ListNode node = new ListNode(stack.pop());

            ListNode temp = dummy.next;

            dummy.next = node;
            node.next = temp;
        }
        return dummy.next;
    }


}


