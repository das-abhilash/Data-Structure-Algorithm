package app.zollet.leetcode.dsalgo;

import java.util.Arrays;

public class LeetCodeSolution {


    public void execute() {
        boolean sdf = isAnagram("abc", "cba");
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(tt);
        return new String(ss).equals(new String(tt));
    }

}