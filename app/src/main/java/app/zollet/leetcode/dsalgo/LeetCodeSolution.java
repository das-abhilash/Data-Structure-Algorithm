package app.zollet.leetcode.dsalgo;


import app.zollet.leetcode.dsalgo.util.ListNode;

public class LeetCodeSolution {


    public void execute() {

    }

    public boolean isPalindrome(ListNode head) {

        StringBuilder s = new StringBuilder();

        while (head != null) {
            s.append(head.val);
            head = head.next;
        }

        return s.toString().equals(s.reverse().toString());
    }

}