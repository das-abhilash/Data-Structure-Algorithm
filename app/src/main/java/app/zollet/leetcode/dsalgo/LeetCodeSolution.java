package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {


    public void execute() {
    }

    public Node copyRandomList(Node head) {

        Node cur = head;

        while (cur != null) {
            Node temp = cur.next;
            Node node = new Node(cur.val);
            cur.next = node;
            node.next = temp;
            cur = temp;
        }


        cur = head;
        while (cur != null) {
            Node next = cur.next;
            Node random = cur.random;
            if (random != null)
                next.random = random.next;
            cur = cur.next.next;
        }
        cur = head;
        Node dummy = new Node(-1);
        Node curr = dummy;
        while (cur != null) {
            Node temp = cur.next.next;

            curr.next = cur.next;
            curr = curr.next;
            cur.next = temp;
            cur = temp;
        }
        return dummy.next;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

}