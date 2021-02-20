package app.zollet.leetcode.dsalgo;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeSolution {

    public void execute() {
        int a = romanToInt("MCMXCIV");
    }

    public int romanToInt(String s) {

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        int a = 0;
        for (int i = 0; i < s.length(); i++) {

            if (i < s.length() - 1 && map.containsKey(s.substring(i, i + 2))) {
                a += map.get(s.substring(i, i + 2));
                i++;
            } else {
                a += map.get(String.valueOf(s.charAt(i)));
            }
        }
        return a;
    }
}