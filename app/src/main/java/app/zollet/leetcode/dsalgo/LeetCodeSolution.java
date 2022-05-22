package app.zollet.leetcode.dsalgo;


import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCodeSolution {

    public void execute() {

        int a = lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
    }

    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            queue.offer(stone);
        }

        while (queue.size() > 1) {
            int x = queue.poll();
            int y = queue.poll();
            queue.offer(x - y);
        }
        return queue.peek();
    }

}