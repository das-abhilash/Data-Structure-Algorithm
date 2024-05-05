package app.zollet.leetcode.dsalgo;


import app.zollet.leetcode.dsalgo.util.ListNode;

public class LeetCodeSolution {

    public void execute() {
    }

    public void deleteNode(ListNode node) {

        int next  = node.next.val;
        ListNode n = node.next.next;

        node.val = next;

        node.next = n;

    }

}


