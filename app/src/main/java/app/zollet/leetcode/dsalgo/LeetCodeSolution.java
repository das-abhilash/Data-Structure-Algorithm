package app.zollet.leetcode.dsalgo;


import java.util.Stack;

public class LeetCodeSolution {

    public void execute() {
        minRemoveToMakeValid("(a(b(c)d)");
// (a(b(c)d)
    }

    // a -> ( a ( b  c ) d )
    // b ->
    public String minRemoveToMakeValid(String s) {

        Stack<Character> actual = new Stack<>();
        Stack<Character> bracket = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {

                bracket.push(c);
                actual.push(c);

            } else if (c == ')') {

                if (!bracket.isEmpty() && bracket.peek() == '(') {
                    bracket.pop();
                    actual.push(c);
                }

            } else {
                actual.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!actual.isEmpty()) {

            if (actual.peek() == ')' || actual.peek() != '(') {
                sb.insert(0, actual.pop());
            } else {
                if (bracket.isEmpty()) {
                    sb.insert(0, actual.pop());
                } else {
                    actual.pop();
                    bracket.pop();
                }
            }
        }
        return sb.toString();
    }
}