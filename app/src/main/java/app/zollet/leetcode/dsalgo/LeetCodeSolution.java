package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {

    public void execute() {
        int a = numRescueBoats(new int[]{3, 2, 2, 1}, 3);
    }

    // 3
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;

        int boats = 0;


        while (left <= right) {

            if ((people[left] + people[right]) <= limit) {
                boats++;
                left++;
                right--;
            } else {
                boats++;
                right--;
            }

        }


        return boats;
    }

}


