package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {


    public void execute() {

    }

    public int heightChecker(int[] heights) {

        int[] copy = Arrays.copyOf(heights,heights.length);
        Arrays.sort(copy);



        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i]!= copy[i]){
                ans++;
            }
        }
        return ans;
    }

}


