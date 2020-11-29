package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
    }

    public int maximumWealth(int[][] accounts) {

        int s = 0;

        for (int i = 0; i < accounts.length; i++) {
            int ss = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                ss += accounts[i][j];
            }
            s = Math.max(s, ss);
        }
        return s;
    }


}