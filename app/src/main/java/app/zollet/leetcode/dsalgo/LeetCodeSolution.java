package app.zollet.leetcode.dsalgo;

import java.util.Stack;

public class LeetCodeSolution {

    public void execute() {
    }

    public int largestRectangleArea(int[] heights) {

        if (heights.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();

        int a = 0;
        for (int i = 0; i <= heights.length; i++) {
            if (stack.isEmpty()) {
                stack.push(i);
                continue;
            }
            while (i == heights.length || heights[stack.peek()] <= heights[i]) {
                int p = stack.pop();
                if (stack.isEmpty()) {
                    a = Math.max(a, heights[p] * i);
                    break;
                } else
                    a = Math.max(a, heights[p] * (i - stack.peek() +1));
            }
            stack.push(i);
        }
        return a;
    }

}