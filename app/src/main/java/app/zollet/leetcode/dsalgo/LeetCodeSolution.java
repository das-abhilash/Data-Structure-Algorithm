package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {


    public void execute() {
        nextPermutation(new int[]{1,5,1});
    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;

        int j = nums.length - 1;
        if (i >= 0) {
            while (nums[j] <= nums[i]) {
                j-- ;
            }
            swap(nums, i, j);
        }

        i++;
        j = nums.length - 1;
        while (i < nums.length && i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
        return;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}