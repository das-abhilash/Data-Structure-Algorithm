package app.zollet.leetcode.dsalgo;

import app.zollet.leetcode.dsalgo.util.ListNode;

public class LeetCodeSolution {

    public void execute() {
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode();

        ListNode cur = dummy;
        int c = 0;

        while (l1 != null && l2 != null) {
            int s = l1.val + l2.val + c;
            c = s / 10;
            cur.next = new ListNode(s % 10);
            cur = cur.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int s = l1.val + c;
            c = s / 10;
            cur.next = new ListNode(s % 10);
            l1 = l1.next;
        }

        while (l2 != null) {
            int s = l2.val + c;
            c = s / 10;
            cur.next = new ListNode(s % 10);
            l2 = l2.next;
        }

        if (c != 0) {
            cur.next = new ListNode(c);
        }
        return dummy.next;
    }

}