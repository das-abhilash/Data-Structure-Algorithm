package app.zollet.leetcode.dsalgo;


import java.util.TreeMap;

public class LeetCodeSolution {


    public void execute() {

    }

    public int[] advantageCount(int[] A, int[] B) {

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        int[] a = new int[A.length];

        for (int i = 0; i < B.length; i++) {
            if (map.higherKey(B[i]) != null) {
                int k = map.higherKey(B[i]);
                a[i] = k;
                if (map.get(k) == 1)
                    map.remove(k);
                else
                    map.put(k, map.get(k) - 1);
            } else {
                a[i] = -1;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                int k = map.firstKey();
                a[i] = k;
                if (map.get(k) == 1)
                    map.remove(k);
                else
                    map.put(k, map.get(k) - 1);

            }
        }
        return a;
    }

}