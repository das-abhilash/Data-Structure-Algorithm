package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class LeetCodeSolution {

    public void execute() {
        List<Integer> a = findMinHeightTrees(1, new int[][]{{1, 0}, {1, 2}, {1, 3}});
    }

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {

        if(n == 1) return new ArrayList<>(Arrays.asList(0));

        Map<Integer, Set<Integer>> edgeMap = new HashMap<>();

        for (int i = 0; i < edges.length; i++) {
            Set<Integer> list1 = edgeMap.getOrDefault(edges[i][0], new HashSet<>());
            list1.add(edges[i][1]);
            edgeMap.put(edges[i][0], list1);

            Set<Integer> list2 = edgeMap.getOrDefault(edges[i][1], new HashSet<>());
            list2.add(edges[i][0]);
            edgeMap.put(edges[i][1], list2);
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int key : edgeMap.keySet()) {
            if (edgeMap.get(key).size() == 1) {
                queue.add(key);
            }
        }

        while (n > 2) {

            int size = queue.size();
            n = n - size;

            for (int i = 0; i < size; i++) {
                int node = queue.poll();

                int neighbour = edgeMap.get(node).iterator().next();

                edgeMap.get(neighbour).remove((Integer) node);

                if (edgeMap.get(neighbour).size() == 1) {
                    queue.add(neighbour);
                }
            }
        }


        return new ArrayList<>(queue);

    }


}