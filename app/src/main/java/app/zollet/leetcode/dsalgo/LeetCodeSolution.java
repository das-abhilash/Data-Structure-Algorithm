package app.zollet.leetcode.dsalgo;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LeetCodeSolution {

    public void execute() {
        int a = minJumps(new int[]{100, -23, -23, 404, 100, 23, 23, 23, 3, 404});
    }

    public int minJumps(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, List<Integer>> map2 = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> l = map2.getOrDefault(arr[i], new ArrayList<>());
            l.add(i);
            map2.put(arr[i], l);
        }

        return solve(arr, 0, map, 0, set, map2);
    }

    private int solve(int[] arr, int i, Map<Integer, Integer> map, int c, Set<Integer> set, Map<Integer, List<Integer>> map2) {
        if (i == arr.length - 1) {
            Log.d("mehbla", "reached");
            return c;
        }
        if (i < 0 || i >= arr.length || set.contains(i)) return Integer.MAX_VALUE;

//        if (map.containsKey(i)) return map.get(i);

        set.add(i);
        Log.d("mehbla", arr[i] + "");
        int a = Math.min(solve(arr, i + 1, map, c + 1, set, map2), solve(arr, i - 1, map, c + 1, set, map2));

        List<Integer> l = map2.getOrDefault(arr[i], new ArrayList<>());
        if (l.size() > 1) {
            for (int j = 0; j < l.size(); j++) {
                if (l.get(j) != i) {
                    a = Math.min(solve(arr, l.get(j), map, c + 1, set, map2), a);
                }
            }
        }

        set.remove(i);
        map.put(i, a);
        return a;
    }

}