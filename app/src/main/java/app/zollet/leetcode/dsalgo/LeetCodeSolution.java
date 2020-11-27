package app.zollet.leetcode.dsalgo;

import androidx.annotation.Nullable;

import java.util.HashSet;
import java.util.Set;

public class LeetCodeSolution {

    public void execute() {
        int[] a = gridIllumination(5, new int[][]{
                {0, 0}, {4, 4}
        }, new int[][]{
                {1, 1}, {1, 0}
        });
    }

    class Pair {
        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Pair)) return false;
            return ((Pair) obj).first == this.first && ((Pair) obj).second == this.second;
        }
    }

    public int[] gridIllumination(int N, int[][] lamps, int[][] queries) {

        if (N == 0) return new int[]{};

        Set<String> set = new HashSet<>();

        for (int i = 0; i < lamps.length; i++) {
            set.add(lamps[i][0] + "_" + lamps[i][1]);
        }

        int[] a = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int[] q = queries[i];
            for (String l : set) {
                String[] ss = l.split("_");
                int first = Integer.parseInt(ss[0]);
                int second = Integer.parseInt(ss[1]);
                if (first == q[0]) {
                    a[i] = 1;
                    break;
                } else if (second == q[1]) {
                    a[i] = 1;
                    break;
                } else if (Math.abs(first - q[0]) == Math.abs(second - q[1])) {
                    a[i] = 1;
                    break;
                }
            }

            set.remove(q[0] + "_" + q[1]);
            if (q[0] + 1 < N) {
                set.remove(q[0] + 1 + "_" + q[1]);

            }

            if (q[1] + 1 < N) {
                set.remove(q[0] + "_" + (q[1] + 1));
            }

            if (q[0] - 1 >= 0) {
                set.remove(q[0] - 1 + "_" + q[1]);
            }

            if (q[1] - 1 < N) {
                set.remove(q[0] + "_" + (q[1] - 1));
            }

            if (q[0] + 1 < N && q[1] + 1 < N)
                set.remove(q[0] + 1 + "_" + (q[1] + 1));

            if (q[0] - 1 >= 0 && q[1] - 1 >= 0)
                set.remove(q[0] - 1 + "_" + (q[1] - 1));

            if (q[0] + 1 < N && q[1] - 1 >= 0)
                set.remove(q[0] + 1 + "_" + (q[1] - 1));

            if (q[0] - 1 >= 0 && q[1] + 1 < N)
                set.remove(q[0] - 1 + "_" + (q[1] + 1));

        }

        return a;
    }

}