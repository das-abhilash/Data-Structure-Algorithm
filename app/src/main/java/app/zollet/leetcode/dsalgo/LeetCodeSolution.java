package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LeetCodeSolution {

    public void execute() {
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length < 2) return intervals;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] t1, int[] t2) {
                return Integer.compare(t1[0], t2[0]);
            }
        });
        List<int[]> answer = new ArrayList<>();

        int[] inter = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] j = intervals[i];

            if (j[0] > inter[1]) {
                answer.add(inter);
            } else {
                inter = new int[]{Math.min(inter[0], j[0]), Math.max(inter[1], j[1])};
            }
        }
        answer.add(inter);


        return answer.toArray(new int[answer.size()][2]);
    }

}