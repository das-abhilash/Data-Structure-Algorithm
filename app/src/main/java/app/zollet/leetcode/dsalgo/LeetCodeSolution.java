package app.zollet.leetcode.dsalgo;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {

    }

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {


        Map<Integer, Integer> a = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                int s = A[i] + B[j];
                a.put(s, a.getOrDefault(s, 0) + 1);
            }
        }

        Map<Integer, Integer> b = new HashMap<>();
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int s = C[i] + D[j];
                b.put(s, b.getOrDefault(s, 0) + 1);
            }
        }

        int an = 0;

        for (int k : a.keySet()) {

            if (b.containsKey(-k)) {
                an += (a.get(k) * b.get(-k));
            }
        }
        return an;
    }
}