package app.zollet.leetcode.dsalgo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class LeetCodeSolution {

    public void execute() {
    }


    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Stack<Integer> stack = new Stack<>();

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        Set<Integer> visited = new HashSet<>();
        Set<Integer> visiting = new HashSet<>();


        for (int i = 0; i < numCourses; i++) {
            if (!dfs(visiting, adj, visited, i, stack)) return new int[0];
        }

        int[] out = new int[stack.size()];
        for (int i = 0; i < out.length; i++) {
            out[i] = stack.pop();
        }
        return out;
    }

    private boolean dfs(Set<Integer> visiting, List<List<Integer>> adj, Set<Integer> visited, int i, Stack<Integer> stack) {
        if (visited.contains(i)) return true;
        if (visiting.contains(i)) return false;

        visited.add(i);
        visiting.add(i);
        List<Integer> l = adj.get(i);
        for (int j = 0; j < l.size(); j++) {
            if (!dfs(visiting, adj, visited, l.get(j), stack)) return false;
        }
        visiting.remove(i);
        stack.push(i);
        return true;
    }
}