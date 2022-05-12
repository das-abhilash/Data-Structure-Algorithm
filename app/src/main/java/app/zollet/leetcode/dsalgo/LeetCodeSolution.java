package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {


    public void execute() {

        reverseString(new char[]{'a', 'b', 'c'});
        reverseString(new char[]{'a', 'b', 'c', 'd'});
        reverseString(new char[]{});
    }

    public void reverseString(char[] s) {
        int l = s.length;

        for (int i = 0; i < l / 2; i++) {
            char c = s[i];
            s[i] = s[l - i - 1];
            s[l - i - 1] = c;
        }
    }
}