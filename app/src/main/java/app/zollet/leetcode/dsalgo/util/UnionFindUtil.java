package app.zollet.leetcode.dsalgo.util;

public class UnionFindUtil {
    private int find(int from, int[] root) {
        if (root[from] == -1) return from;

        int parent = find(root[from], root);
        root[from] = parent;
        return parent;
    }

    private boolean union(int from, int to, int[] root, int[] rank) {

        int fromRoot = find(from, root);
        int toRoot = find(to, root);

        if (fromRoot == toRoot) return true;

        int fromRank = rank[fromRoot];
        int toRank = rank[toRoot];

        if (fromRank > toRank) {
            root[fromRoot] = toRoot;
        } else if (toRank > fromRank) {
            root[toRoot] = fromRoot;
        } else {
            root[fromRoot] = toRoot;
            rank[fromRoot] = rank[fromRoot] + 1;
        }
        return false;
    }
}
