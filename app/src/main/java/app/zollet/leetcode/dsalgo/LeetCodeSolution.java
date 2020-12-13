package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {

    }

    public int numberOfMatches(int n) {
        if (n == 1) return 0;
        int a = 0;

        while (n > 1) {

            if (n % 2 == 0) {
                a += n / 2;
                n = n / 2;
            } else {
                a += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return a;
    }

}