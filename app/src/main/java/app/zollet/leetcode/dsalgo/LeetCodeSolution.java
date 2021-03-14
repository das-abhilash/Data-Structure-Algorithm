package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.List;

import app.zollet.leetcode.dsalgo.util.ListNode;

public class LeetCodeSolution {


    public void execute() {
    }

    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }

        int temp = list.get(k-1);
        list.set(k-1, list.get(list.size() - k));
        list.set(list.size() - k, temp);

        ListNode dummy = new ListNode();
        ListNode cu = dummy;

        for (int i = 0; i < list.size(); i++) {
            cu.next = new ListNode(list.get(i));
            cu = cu.next;
        }
        return dummy.next;
    }

}