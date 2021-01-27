package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
        int s = concatenatedBinary(13);
    }


    public int concatenatedBinary(int n) {

        int m = 1000000007;
        long a = 0;
        for (int i = 1; i <= n; i++) {
            int l = ((int) (Math.log(i) / Math.log(2)) + 1) % m;
            a = (a<<l)% m + i % m;
        }
        return (int) a % m;
    }


}