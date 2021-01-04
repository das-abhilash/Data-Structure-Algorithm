package app.zollet.leetcode.dsalgo;

import app.zollet.leetcode.dsalgo.util.ListNode;

public class LeetCodeSolution {

    public void execute() {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode();

        ListNode r = l2;

        dummy.next = l1;
        ListNode cur = l1;
        ListNode prev = dummy;

        while (cur != null && r != null) {
            if (cur.val < r.val) {
                ListNode temp = cur;
                cur = cur.next;
                prev = temp;
            } else {
                ListNode temp = r.next;
                prev.next = r;
                prev = prev.next;
                r.next = cur;
                r = temp;
            }
        }

        if (r!=null){
            prev.next = r;
        }

        return dummy.next;
    }

}