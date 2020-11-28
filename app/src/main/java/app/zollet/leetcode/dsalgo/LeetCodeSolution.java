package app.zollet.leetcode.dsalgo;

import java.util.PriorityQueue;

public class LeetCodeSolution {

    public void execute() {
    }

    public int largestSumAfterKNegations(int[] A, int K) {

        PriorityQueue<Integer> treeMap = new PriorityQueue<>();

        int s = 0;
        for (int i = 0; i < A.length; i++) {
            treeMap.add(A[i]);
            s += A[i];
        }


        for (int i = 0; i < K; i++) {
            int v = treeMap.poll();
            s = s - v + (-1 * v);
            treeMap.add(-v);
        }
        return s;
    }


}