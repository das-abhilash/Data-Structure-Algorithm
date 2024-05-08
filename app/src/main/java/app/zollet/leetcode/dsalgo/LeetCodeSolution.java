package app.zollet.leetcode.dsalgo;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {
        String[] hjg = findRelativeRanks(new int[]{5, 4, 3, 2, 1});
    }

    public String[] findRelativeRanks(int[] score) {


        Map<Integer, Integer> map = new HashMap<>();
        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }

        Arrays.sort(score);

        for (int i = 0; i < score.length; i++) {
            int index = map.get(score[i]);
            result[index] = String.valueOf(score.length - i);
        }

        result[map.get(score[score.length - 1])] = "Gold Medal";
        if (score.length > 1)
            result[map.get(score[score.length - 2])] = "Silver Medal";
        if (score.length > 2)
            result[map.get(score[score.length - 3])] = "Bronze Medal";

        return result;

    }

}


