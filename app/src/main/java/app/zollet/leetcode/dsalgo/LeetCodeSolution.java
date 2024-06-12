package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {


    public void execute() {

    }

    public void sortColors(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        int index = 0;

        while (index <= r) {
            if (nums[index] == 0) {
                int temp = nums[l];
                nums[l] = nums[index];
                nums[index] = temp;
                l++;
                index++;
            } else if (nums[index] == 1) {
                index++;
            } else {
                int temp = nums[r];
                nums[r] = nums[index];
                nums[index] = temp;
                r--;
            }
        }

    }

}


