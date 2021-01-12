package app.zollet.leetcode.dsalgo.util;

/*class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}*/

public class ListNode {
  public int val;
  public ListNode next;
  public ListNode prev;

  public ListNode() {
  }

  public ListNode(int d) {
    val = d;
    next = null;
    prev = null;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}