package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {

        int a = maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
    }

    public int maxArea(int[] height) {

        int i = 0;
        int j = height.length - 1;
        int a = 0;
        while (i < j) {
            a = Math.max(a, (j - i) * Math.min(height[i], height[j]));

            if (height[i] < height[j]) {
                i++;
            } else
                j--;
        }
        return a;
    }
}