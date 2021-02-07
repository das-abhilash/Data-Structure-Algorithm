package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
        boolean a = check(new int[]{2, 1, 3, 4});
    }

    public boolean check(int[] nums) {

        int i = 0;
        int max = nums[0];
        int min = nums[0];

        while (i < nums.length - 1 && nums[i] <= nums[i + 1]) {
            max = nums[i + 1];
            min = Math.min(min,nums[i]);
            i++;
        }

        if (i == nums.length - 1) return true;
        i++;
        while (i < nums.length - 1 && nums[i] <= nums[i + 1]) {
            if (nums[i + 1] > max) return false;
            if (nums[i] > min) return false;
            i++;
        }
        if (i == nums.length - 1) return true;
        if (i == 0) {
            while (i < nums.length - 1 && nums[i] >= nums[i + 1]) {
                i++;
            }
        }
        return i == nums.length - 1;

    }

}