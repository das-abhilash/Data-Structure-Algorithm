package app.zollet.leetcode.dsalgo;


import java.util.Collections;
import java.util.PriorityQueue;

public class LeetCodeSolution {

    public void execute() {
        long sdf = maximumHappinessSum(new int[]{12, 1, 42}, 3);
    }


    public long maximumHappinessSum(int[] happiness, int k) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int h : happiness) {
            priorityQueue.add(h);
        }

        long ans = 0;
        long minus = 0;
        while (!priorityQueue.isEmpty() && k > 0) {
            int a = priorityQueue.poll();
            if (a - minus > 0) {
                ans = ans + a - minus;
                minus++;
            }
            k--;
        }
        return ans;
    }


}


