package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {


    public void execute() {

    }

    public int minMovesToSeat(int[] seats, int[] students) {
        int n = seats.length;
        int ans = 0;


        Arrays.sort(seats);
        Arrays.sort(students);

        for (int i = 0; i < n; i++) {
            ans = ans + Math.abs(seats[i] - students[i]);
        }
        return ans;
    }

}


