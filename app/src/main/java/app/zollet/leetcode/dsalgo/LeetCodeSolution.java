package app.zollet.leetcode.dsalgo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import app.zollet.leetcode.dsalgo.util.TreeNode;
import app.zollet.leetcode.dsalgo.util.TreeNodeUtill;

public class LeetCodeSolution {

    public void execute() {

        int[] sf = new int[]{};
        TreeNode root = TreeNodeUtill.insertLevelOrder(new int[]{3, 9, 20, -1, -1, 15, 7}, new TreeNode(3), 0);
        verticalTraversal(root);
    }

    class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer, TreeSet<Pair>> map = new TreeMap<>();

        dfs(root, 0, 0, map);

        List<List<Integer>> list = new ArrayList<>();

        for (TreeSet<Pair> s : map.values()) {
            List<Integer> l = new ArrayList<>();
            for (Pair p : s) {
                l.add(p.second);
            }
            list.add(l);
        }
        return list;
    }

    private void dfs(TreeNode node, int x, int y, Map<Integer, TreeSet<Pair>> map) {
        if (node == null) return;

        TreeSet<Pair> set = map.getOrDefault(x, getDefault());
        set.add(new Pair(y, node.val));
        map.put(x, set);
        dfs(node.left, x - 1, y + 1, map);
        dfs(node.right, x + 1, y + 1, map);
    }


    private TreeSet<Pair> getDefault() {
        return new TreeSet<Pair>(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                if (p1.first != p2.first)
                    return Integer.compare(p1.first, p2.first);
                else return Integer.compare(p1.second, p2.second);
            }
        });
    }

}