package app.zollet.leetcode.dsalgo;

import app.zollet.leetcode.dsalgo.util.ListNode;
import app.zollet.leetcode.dsalgo.util.ListNodeUtil;

public class LeetCodeSolution {

    public void execute() {
        ListNodeUtil u = new ListNodeUtil();
        u.push(4);
        u.push(3);
        u.push(2);
        u.push(1);
        ListNode a = swapPairs(u.head);
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode cur = head;

        ListNode listNode = cur.next;

        ListNode last = null;
        while (cur != null && cur.next != null) {

            ListNode nextnext = cur.next.next;

            ListNode next = cur.next;

            cur.next = nextnext;
            next.next = cur;
            if (last != null) {
                last.next = next;
            }
            last = cur;
            cur = cur.next;

        }
        return listNode;
    }

}