package app.zollet.leetcode.dsalgo;


import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {
        int df= minimumOperationsToMakeKPeriodic("leetcodeleet", 4);
    }

    public int minimumOperationsToMakeKPeriodic(String word, int k) {

        Map<String, Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;
        for (int i = k; i <= word.length(); i = i + k) {
            String sub = word.substring( i - k, i);
            if (map.containsKey(sub)) {
                int c = map.get(sub) + 1;
                map.put(sub, c);
                max = Math.max(max, c);
            } else {
                map.put(sub, 1);
                max = Math.max(max, 1);
            }
        }

        return word.length() / k - max;
    }

}


