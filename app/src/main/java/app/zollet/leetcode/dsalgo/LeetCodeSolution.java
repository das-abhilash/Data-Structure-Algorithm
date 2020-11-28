package app.zollet.leetcode.dsalgo;

import app.zollet.leetcode.dsalgo.util.ListNode;

public class LeetCodeSolution {

    public void execute() {
    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        int index = 0;
        ListNode cur = list1;
        while (index + 1 != a) {
            cur = cur.next;
            index++;
        }

        ListNode tmp = cur.next;
        cur.next = list2;
        ListNode cur2 = list2;

        while (cur2.next != null) {
            cur2 = cur2.next;
        }


        while (index+1 != b) {
            tmp = tmp.next;
            index++;
        }
        ListNode tmpp = tmp.next;
        cur2.next = tmpp;
        return list1;
    }

}