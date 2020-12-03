package app.zollet.leetcode.dsalgo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import app.zollet.leetcode.dsalgo.util.ListNode;

public class LeetCodeSolution {

    public void execute() {
    }

    class Solution {

        List<Integer> list;

        /**
         * @param head The linked list's head.
         *             Note that the head is guaranteed to be not null, so it contains at least one node.
         */
        public Solution(ListNode head) {
            list = new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
        }

        /**
         * Returns a random node's value.
         */
        public int getRandom() {
            int r = new Random().nextInt(list.size());
            return list.get(r);
        }
    }


}