package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCodeSolution {

    public void execute() {

    }


    public List<Integer> addToArrayForm(int[] A, int K) {
        int c = 0;

        List<Integer> answer = new ArrayList<>();

        for (int i = A.length - 1; i >= 0; i--) {
            int r = K % 10;
            K = K / 10;
            int s = A[i] + r + c;
            answer.add(s % 10);
            c = s / 10;
        }

        while (K != 0) {
            int r = K % 10;
            K = K / 10;
            int s = r + c;
            answer.add(s % 10);
            c = s / 10;
        }

        if (c != 0)
            answer.add(c);

        Collections.reverse(answer);

        return answer;
    }

}