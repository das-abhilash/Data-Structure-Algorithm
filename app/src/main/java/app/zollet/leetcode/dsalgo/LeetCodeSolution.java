package app.zollet.leetcode.dsalgo;

import java.util.Arrays;
import java.util.Comparator;

public class LeetCodeSolution {

    public void execute() {
    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return -1* Integer.compare(o1[1], o2[1]);
            }
        });

        int a = 0;
        int b = 0;
        for (int i = 0; i < boxTypes.length; i++) {

            b += boxTypes[i][0];
            a += boxTypes[i][0] * boxTypes[i][1];
            if (b > truckSize) {

                a = a - (b - truckSize) * boxTypes[i][1];

                break;
            }
        }
        return a;
    }

}