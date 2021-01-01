package app.zollet.leetcode.dsalgo;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {
    }


    public boolean canFormArray(int[] arr, int[][] pieces) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < pieces.length; i++) {
            map.put(pieces[i][0], i);
        }


        for (int i = 0; i < arr.length; ) {
            if (!map.containsKey(arr[i])) return false;
            int[] a = pieces[map.get(arr[i])];

            for (int j = 0; j < a.length; j++, i++) {
                if (a[j] != arr[i]) return false;
            }
        }

        return true;
    }
}