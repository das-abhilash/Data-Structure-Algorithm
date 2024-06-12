package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {


    public void execute() {

        int[] a = relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6});
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] map = new int[1000];
        Arrays.fill(map, 0);

        for (int i = 0; i < arr1.length; i++) {
            map[arr1[i]] = map[arr1[i]] + 1;
        }

        int[] ans = new int[arr1.length];

        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            int count = map[arr2[i]];
            while (count > 0) {
                ans[index] = arr2[i];
                index++;
                count--;
            }
            map[arr2[i]] = 0;
        }

        int fh = 0;
        for (int i = 0; i < map.length; i++) {
            if (map[i] == 0) continue;
            int count = map[i];
            while (count > 0) {
                ans[index] = i;
                index++;
                count--;
            }
            map[i] = 0;
        }

        return ans;
    }

}


