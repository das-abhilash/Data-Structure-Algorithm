package app.zollet.leetcode.dsalgo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LeetCodeSolution {

    public void execute() {
        int h = numDupDigitsAtMostN(8765);
    }

    public int numDupDigitsAtMostN(int N) {
        if (N < 11) return 0;
        int a = 1;
        for (int i = 12; i <= N; i++) {

            Set<Character> set = new HashSet<>();
            String l = String.valueOf(i);

            for (int j = 0; j < l.length(); j++) {
                if (set.contains(l.charAt(j))) {
                    a++;
                    break;
                } else
                    set.add(l.charAt(j));
            }
        }
        return a;
    }
}