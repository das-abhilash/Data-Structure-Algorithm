package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LeetCodeSolution {


    public void execute() {

    }

    public List<List<Integer>> getAncestors(int n, int[][] edges) {

        Map<Integer, List<Integer>> adj = new HashMap<>();

        for (int i = 0; i < n; i++) {
            adj.put(i, new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][1]).add(edges[i][0]);
        }


        List<List<Integer>> ans = new ArrayList<>();

        Map<Integer, Set<Integer>> dp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>(getAncestors(adj, i, dp));
            Collections.sort(l);
            ans.add(l);
        }
        return ans;
    }

    private Set<Integer> getAncestors(Map<Integer, List<Integer>> adj, int node, Map<Integer, Set<Integer>> dp) {

        Set<Integer> list = new HashSet<>();

        List<Integer> nodes = adj.get(node);
        for (int i = 0; i < nodes.size(); i++) {
            list.add(nodes.get(i));
            if (dp.containsKey(nodes.get(i))) {
                list.addAll(dp.get(nodes.get(i)));
            } else {
                Set<Integer> l = getAncestors(adj, nodes.get(i), dp);
                if (!l.isEmpty()) {
                    dp.put(nodes.get(i), l);
                    list.addAll(l);
                }
            }
        }
        return list;
    }

}


