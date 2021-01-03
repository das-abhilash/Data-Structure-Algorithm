package app.zollet.leetcode.dsalgo;

import java.util.HashSet;
import java.util.Set;

public class LeetCodeSolution {

    public void execute() {
        int aa = countArrangement(3);
    }

    int a = 0;

    public int countArrangement(int n) {

        Set<Integer> set = new HashSet<>();

        solve(n, 1, set);


        return a;
    }

    private void solve(int n, int i, Set<Integer> set) {
        if (i == n) {
            a++;
            return;
        }

        for (int j = 1; j <= n; j++) {
            if (!set.contains(j) && (j % i == 0 || i % j == 0)) {
                set.add(j);
                solve(n, i + 1, set);
                set.remove(j);
            }

        }
    }

}