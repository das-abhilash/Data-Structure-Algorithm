package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.List;

public class LeetCodeSolution {


    public void execute() {

    }


    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> answer = new ArrayList<>();

        List<Integer> list  =new ArrayList<>();
        list.add(0);
        solve(graph, graph.length - 1, 0, answer, list);
        return answer;
    }

    private void solve(int[][] graph, int end, int index, List<List<Integer>> answer, List<Integer> list) {

        if (index == end) {
            answer.add(new ArrayList<>(list));
            return;
        }


        int[] g = graph[index];

        for (int i = 0; i < g.length; i++) {
            list.add(g[i]);
            solve(graph, end, g[i], answer, list);
            list.remove(list.size() - 1);
        }
    }

}