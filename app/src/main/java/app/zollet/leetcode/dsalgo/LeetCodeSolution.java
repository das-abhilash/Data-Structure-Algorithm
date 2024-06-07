package app.zollet.leetcode.dsalgo;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {
    }

    public boolean isNStraightHand(int[] hand, int groupSize) {

        if (hand.length != groupSize * groupSize) return false;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < hand.length; i++) {
            map.put(hand[i], map.getOrDefault(hand[i], 0) + 1);
        }

        Arrays.sort(hand);


        for (int i = 0; i < hand.length; i++) {
            int count = 0;
            int start = hand[i];
            if (map.getOrDefault(start, 0) == 0) continue;
            while (count < groupSize) {
                if (map.getOrDefault(start, 0) > 0) {
                    map.put(start, map.get(start) - 1);
                } else {
                    return false;
                }
                count++;
                start++;
            }
        }
        return true;
    }


}


