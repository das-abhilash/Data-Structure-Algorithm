package app.zollet.leetcode.dsalgo;


import app.zollet.leetcode.dsalgo.util.ListNode;

public class LeetCodeSolution {

    public void execute() {
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode nextTemp = null;

        // Set each node's next pointer to the previous node
        while (current != null) {
            nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }

        return prev;
    }


    public ListNode removeNodes(ListNode head) {

        head = reverseList(head);

        int max = 0;
        ListNode current = head;
        ListNode next = null;
        ListNode temp = null;
        while (current != null) {


            if (current.val < max) {
                current = current.next;
            } else {
                max = current.val;

                next = current.next;
                current.next = temp;
                temp = current;
                current = next;
            }
        }

        return temp;
    }



}


