package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {

    public void execute() {

    }

    public boolean isIsomorphic(String s, String t) {

        if (s.equals(t)) return true;
        int[] charMap = new int[256];
        int[] countMap = new int[256];
        int[] countMap2 = new int[256];

        Arrays.fill(charMap, -1);

        for (int i = 0; i < s.length(); i++) {

            if (charMap[(int) s.charAt(i)] != -1 && charMap[(int) s.charAt(i)] != (int) t.charAt(i)) {
                return false;
            }


            charMap[(int) s.charAt(i)] = (int) t.charAt(i);
            countMap[(int) s.charAt(i)] = countMap[(int) s.charAt(i)] + 1;
            countMap2[(int) t.charAt(i)] = countMap2[(int) t.charAt(i)] + 1;

            if (countMap[(int) s.charAt(i)] != countMap2[(int) t.charAt(i)]) return false;
        }

        return true;
    }

}