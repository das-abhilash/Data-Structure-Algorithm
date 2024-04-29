package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {
    }

    private Map<Integer, List<Integer>> graph;

    private int[] count;
    private int[] res;

    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        graph = new HashMap<>();
        count = new int[n];
        Arrays.fill(count, 1);
        res = new int[n];
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }


        solve1(0, -1);
        solve2(0, -1);

        return res;
    }

    private void solve2(int node, int parent) {

        for (int child : graph.get(node)) {
            if (child != parent) {
                res[child] = res[node] - count[child] + (count.length - count[child]);
                solve2(child, node);
            }
        }


    }

    private void solve1(int node, int parent) {

        for (int child : graph.get(node)) {

            if (child != parent) {
                solve1(child, node);
                count[node] = count[node] + count[child];
                res[node] = res[node] + res[child] + count[child];
            }
        }
    }

}


