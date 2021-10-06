package app.zollet.leetcode.dsalgo;


import java.util.ArrayList;
import java.util.List;

public class LeetCodeSolution {


    public void execute() {

        findDuplicates(new int[]{4,3,2,7,8,2,3,1});
    }

    public List<Integer> findDuplicates(int[] nums) {


        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) -1] < 0) {
                answer.add(Math.abs(nums[i]));
            }
            nums[Math.abs(nums[i])-1] = nums[Math.abs(nums[i])-1] * -1;
        }
        return answer;
    }
}