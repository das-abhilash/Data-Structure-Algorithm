package app.zollet.leetcode.dsalgo;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCodeSolution {

    public void execute() {
        int[] students = { 1,1,0,0 };
        int[] sandwiches = { 0,1,0,1 };
        countStudents(students,sandwiches);
    }

    public int countStudents(int[] students, int[] sandwiches) {

        if (students.length == 0) return 0;
        int index = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < students.length; i++) {
            queue.add(students[i]);
        }

        int notAte = 0;
        while (!queue.isEmpty()) {
            int student = queue.poll();
            if (sandwiches[index] == student) {
                index++;
                notAte = 0;
            } else {
                queue.add(student);
                notAte++;
            }
            if(notAte == students.length) return students.length - index;
        }
        return 0;
    }
}