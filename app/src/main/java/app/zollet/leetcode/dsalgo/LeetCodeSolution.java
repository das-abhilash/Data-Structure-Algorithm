package app.zollet.leetcode.dsalgo;


import java.util.Stack;

public class LeetCodeSolution {

    public void execute() {

        String out = makeGood("leEeetcode");
    }

    //abBAcC
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if (stack.peek() == s.charAt(i)) {
                stack.push(s.charAt(i));
            } else if (Character.toLowerCase(stack.peek()) == Character.toLowerCase(s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}