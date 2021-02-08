package app.zollet.leetcode.dsalgo;

import java.util.TreeSet;

public class LeetCodeSolution {


    public void execute() {
        int[] a = shortestToChar("loveleetcode", 'e');


    }

    public enum EnumSingleton {

        INSTANCE;

        public static void doSomething(){
            //do something
        }
    }

            public int[] shortestToChar(String s, char c) {

        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                set.add(i);
        }

        int[] a = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                a[i] = 0;
            else {
                if (set.ceiling(i) == null) {
                    a[i] = Math.abs(i - set.floor(i));
                } else if (set.floor(i) == null) {
                    a[i] = Math.abs(i - set.ceiling(i));
                } else {
                    a[i] = Math.min(Math.abs(i - set.ceiling(i)), Math.abs(i - set.floor(i)));
                }
            }
        }
        return a;
    }

}