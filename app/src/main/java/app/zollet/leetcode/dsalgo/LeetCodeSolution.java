package app.zollet.leetcode.dsalgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import app.zollet.leetcode.dsalgo.util.ListNode;

public class LeetCodeSolution {

    public void execute() {
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Set<Character> ss = new HashSet<>();
        ss.add(']');
        ss.add(')');
        ss.add('}');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (ss.contains(c)) {
                if (stack.isEmpty()) return false;
                if (c == ')' && stack.peek() != '(') return false;
                if (c == '}' && stack.peek() != '{') return false;
                if (c == ']' && stack.peek() != '[') return false;
                stack.pop();
            } else {
                stack.push(c);
            }

        }
        return stack.isEmpty();
    }

}