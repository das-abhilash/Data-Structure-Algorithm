package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import app.zollet.leetcode.dsalgo.util.TreeNode;
import app.zollet.leetcode.dsalgo.util.TreeNodeUtill;

public class LeetCodeSolution {

    public void execute() {

        TreeNode root = TreeNodeUtill.insertLevelOrder(new int[]{1, 2, 3, 4, 5, 6, 7}, new TreeNode(1), 0);
        List<List<Integer>> a = verticalTraversal(root);

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

        TreeMap<Integer, List<Pair>> map = new TreeMap<>();

        solve(root, 0, 0, map);

        List<List<Integer>> a = new ArrayList<>();
        for (List<Pair> e : map.values()) {
            List<Integer> l = new ArrayList<Integer>();
            Collections.sort(e, new Comparator<Pair>() {
                @Override
                public int compare(Pair i1, Pair i2) {
                    int c = Integer.compare(i1.first, i2.first);
                    if (c != 0) return c;
                    else
                        return Integer.compare(i1.second, i2.second);
                }
            });
            for (Pair p : e) {
                l.add(p.second);
            }
            a.add(l);
        }
        return a;
    }

    private void solve(TreeNode root, int x, int y, Map<Integer, List<Pair>> map) {
        if (root == null) return;

        solve(root.left, x - 1, y + 1, map);
        solve(root.right, x + 1, y + 1, map);

        List<Pair> list = map.getOrDefault(x, new ArrayList<>());
        list.add(new Pair(y, root.val));
        map.put(x, list);
    }


}