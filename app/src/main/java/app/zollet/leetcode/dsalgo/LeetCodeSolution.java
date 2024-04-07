package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
    }
// [1,5,10,3]
    public int longestMonotonicSubarray(int[] nums) {

        if (nums.length == 1) return 1;
        if (nums.length == 2) return nums[1] != nums[0] ? 2 : 1;


        int count = nums[1] !=  nums[0] ? 2 : 1;

        int ans = count;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                ans = Math.max(count, ans);
                count = 1;
            } else if (nums[i] > nums[i - 1]) {
                if (nums[i-1] > nums [i-2]) {
                    count++;
                } else {
                    ans = Math.max(count , ans);
                    count = 2;
                }
            } else {
                if (nums[i-1] < nums [i-2]) {
                    count++;
                } else {
                    ans = Math.max(count, ans);
                    count = 2;
                }
            }
        }

        ans = Math.max(ans,count);
        return ans;
    }
}