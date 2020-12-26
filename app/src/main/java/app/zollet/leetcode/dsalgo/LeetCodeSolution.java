package app.zollet.leetcode.dsalgo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LeetCodeSolution {

    public void execute() {
        int a = countStudents(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1});
    }

    public int countStudents(int[] students, int[] sandwiches) {

        int size = students.length;

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            stack.push(sandwiches[size - i - 1]);
            queue.add(students[i]);
        }

        int s = 0;
        while (s != stack.size()) {
            if (queue.peek().equals(stack.peek())) {
                s = 0;
                queue.poll();
                stack.pop();
            } else {
                s++;
                int p = queue.poll();
                queue.add(p);
            }
        }
        return stack.size();
    }
}