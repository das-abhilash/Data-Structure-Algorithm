package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
    }

    public int maxArea(int[] height) {
        if (height.length < 2) return 0;

        int l = 0;
        int r = height.length - 1;
        int a = 0;

        while (l < r) {

            int area = (r - l) * Math.min(height[l], height[r]);
            a = Math.max(a, area);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }

        }
        return a;
    }

}