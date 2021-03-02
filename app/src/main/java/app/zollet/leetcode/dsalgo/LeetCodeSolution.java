package app.zollet.leetcode.dsalgo;

import java.util.TreeMap;

public class LeetCodeSolution {

    public void execute() {
    }

    public int distributeCandies(int[] candyType) {

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < candyType.length; i++) {
            map.put(candyType[i], map.getOrDefault(candyType[i], 0) + 1);
        }

        return Math.min(map.size(), candyType.length / 2);

    }

}