package app.zollet.leetcode.dsalgo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class LeetCodeSolution {

    public void execute() {
        int a = minJumps(new int[]{100, -23, -23, 404, 100, 23, 23, 23, 3, 404});
    }

    public int minJumps(int[] arr) {
        Map<Integer, Set<Integer>> map2 = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            map2.computeIfAbsent(arr[i], x -> new HashSet<>()).add(i);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        int a = 0;
        int f = arr.length - 1;
        while (!queue.isEmpty()) {
            int s = queue.size();
            for (int i = 0; i < s; i++) {
                int x = queue.poll();
                if (x == f) return a;
                Set<Integer> se = map2.get(arr[x]);
                map2.put(arr[x], new HashSet<>());
                if (x != 0) {
                    if (!set.contains(x - 1)) {
                        queue.add(x - 1);
                        set.add(x - 1);
                    }
                }
                if (!set.contains(x + 1)) {
                    queue.add(x + 1);
                    set.add(x + 1);
                }

                for (int j : se) {
                    if (!set.contains(j)) {
                        set.add(j);
                        queue.add(j);
                    }
                }
            }
            a++;
        }
        return a;
    }

}