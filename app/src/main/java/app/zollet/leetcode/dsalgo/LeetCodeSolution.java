package app.zollet.leetcode.dsalgo;

import java.util.List;

import app.zollet.leetcode.dsalgo.util.ListNode;

public class LeetCodeSolution {

    public void execute() {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int a = 0;
        ListNode cur = headA;
        while (cur != null) {
            a++;
            cur = cur.next;
        }

        int b = 0;
        cur = headB;
        while (cur != null) {
            b++;
            cur = cur.next;
        }

        ListNode curA = headA;
        ListNode curB = headB;
        if (a > b) {
            int aa = a - b;
            while (aa > 0) {
                aa--;
                curA = curA.next;
            }
        } else if (a < b) {
            int aa = b - a;
            while (aa > 0) {
                aa--;
                curB = curB.next;
            }
        }

        if (curA == null || curB == null) return null;

        while (curA != null) {
            if (curA == curB) return curA;
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }
}