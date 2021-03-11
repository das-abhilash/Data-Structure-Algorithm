package app.zollet.leetcode.dsalgo;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import app.zollet.leetcode.dsalgo.util.TreeNode;

public class LeetCodeSolution {


    public void execute() {
    }

    public int coinChange(int[] coins, int amount) {

        if (amount == 0) return 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(amount);

        int a = 0;
        while (!queue.isEmpty()) {
            a++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int c = queue.poll();
                for (int coin : coins) {
                    if (c - coin == 0) return a;
                    if (c - coin > 0)
                        queue.add(c - coin);
                }
            }
        }
        return -1;
    }
}