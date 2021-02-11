package app.zollet.leetcode.dsalgo;

import java.util.Arrays;

public class LeetCodeSolution {


    int answer = 0;

    public void execute() {
    }

    private int find(int from, int[] root) {
        if (root[from] == -1) return from;

        int parent = find(root[from], root);
        root[from] = parent;
        return parent;
    }

    private void union(int from, int to, int[] root, int[] rank) {

        int fromRoot = find(from, root);
        int toRoot = find(to, root);

        if (fromRoot == toRoot) return;
        int fromRank = rank[fromRoot];
        int toRank = rank[toRoot];

        if (fromRank > toRank) {
            root[toRoot] = fromRoot;
        } else if (fromRank < toRank) {
            root[fromRoot] = toRoot;
        } else {
            root[fromRoot] = toRoot;
            rank[fromRoot] = rank[fromRoot] + 1;
        }
        answer--;
    }

    public int makeConnected(int n, int[][] connections) {

        if (connections.length < n - 1) return -1;
        answer = n;
        int[] t = new int[n];
        int[] r = new int[n];

        Arrays.fill(t, -1);
        Arrays.fill(r, 1);

        int b = 0;

        for (int i = 0; i < connections.length; i++) {
            union(connections[i][0], connections[i][1], t, r);
        }

        return answer - 1;
    }

}