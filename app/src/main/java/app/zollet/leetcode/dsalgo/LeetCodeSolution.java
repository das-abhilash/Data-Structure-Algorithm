package app.zollet.leetcode.dsalgo;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class LeetCodeSolution {
    public void execute() {
        int a = calculate("4/3+2");
    }

    public int calculate(String s) {

        String in = s.replaceAll(" ", "");
        Stack<Character> sign = new Stack<>();
        Stack<Integer> val = new Stack<>();

        Set<Character> cc = new HashSet<Character>();
        cc.add('+');
        cc.add('-');
        cc.add('*');
        cc.add('/');

        for (int i = 0; i < in.length(); i++) {
            if (cc.contains(in.charAt(i))) {
                if (in.charAt(i) == '*') {
                    int v = 0;
                    i++;
                    while (i < in.length() && !cc.contains(in.charAt(i))) {
                        v = (v * 10 + Integer.parseInt(String.valueOf(in.charAt(i))));
                        i++;
                    }
                    int jj = val.pop() * v;
                    val.push(jj);
                    if (i != in.length())
                        i--;
                } else if (in.charAt(i) == '/') {
                    int v = 0;
                    i++;
                    while (i < in.length() && !cc.contains(in.charAt(i))) {
                        v = (v * 10 + Integer.parseInt(String.valueOf(in.charAt(i))));
                        i++;
                    }

                    int jj = val.pop() / v;
                    val.push(jj);
                    if (i != in.length())
                        i--;
                } else {
                    sign.push(in.charAt(i));
                }
            } else {

                int v = 0;
                while (i < in.length() && !cc.contains(in.charAt(i))) {
                    v = (v * 10 + Integer.parseInt(String.valueOf(in.charAt(i))));
                    i++;
                }
                val.push(v);
                if (i != in.length())
                    i--;
            }
        }

        int aa = 0;
        int mm = 0;
        while (val.size() > 1) {
            int v = val.pop();
            int si = sign.pop();
            if (si == '+')
                aa += v;
            else
                mm += v;
        }
        return val.pop() + aa - mm;
    }
}