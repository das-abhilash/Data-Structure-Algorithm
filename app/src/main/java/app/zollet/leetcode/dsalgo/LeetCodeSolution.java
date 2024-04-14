package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {


    }

    public int maximumPrimeDifference(int[] nums) {
        int index = -1;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            if (isPrime(nums[i])) {
                if (index > -1) {
                    ans = i - index;
                } else
                    index = i;
            }
        }
        return ans;
    }

    private boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }


}