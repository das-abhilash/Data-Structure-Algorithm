package app.zollet.leetcode.dsalgo.util;

public class ListNodeUtil {

    public ListNode head; // head of list

    /* Linked list Node*/

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
		/* 1 & 2: Allocate the Node &
				Put in the data*/
        ListNode new_node = new ListNode(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }
}
