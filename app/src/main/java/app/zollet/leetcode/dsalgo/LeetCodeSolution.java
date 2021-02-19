package app.zollet.leetcode.dsalgo;

import java.util.Stack;

public class LeetCodeSolution {

    public void execute() {
        String s = minRemoveToMakeValid("))((");
    }

    public String minRemoveToMakeValid(String s) {

        StringBuilder a = new StringBuilder(s);

        Stack<Integer> index = new Stack<>();
        Stack<Character> bracket = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                continue;
            }

            char c = s.charAt(i);

            if (bracket.isEmpty() && c == ')') {
                a.setCharAt(i, '$');
            } else if (c == ')' && bracket.peek() == '(') {
                index.pop();
                bracket.pop();
            } else {
                index.push(i);
                bracket.push(c);
            }
        }

        while (!index.isEmpty()) {
            a.setCharAt(index.pop(), '$');
        }
        String o = a.toString().replace("$", "");

        return o;
    }
}