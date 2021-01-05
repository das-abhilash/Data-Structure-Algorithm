package app.zollet.leetcode.dsalgo;

import app.zollet.leetcode.dsalgo.util.ListNode;
import app.zollet.leetcode.dsalgo.util.ListNodeUtil;

public class LeetCodeSolution {

    public void execute() {

        ListNodeUtil U = new ListNodeUtil();
        U.push(5);
        U.push(4);
        U.push(4);
        U.push(3);
        U.push(3);
        U.push(2);
        U.push(1);

        ListNode node = deleteDuplicates(U.head);
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;

        while (cur != null) {
            int val = cur.val;
            int c = 1;
            ListNode pr = cur;
            cur = cur.next;
            while (cur != null && cur.val == val) {
                c++;
                cur = cur.next;
            }

            if (c > 1) {
                prev.next = cur;
            } else {
                prev = pr;
            }
            int ii = 0;
        }
        return dummy.next;
    }

}