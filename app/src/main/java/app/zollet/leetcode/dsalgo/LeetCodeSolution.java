package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {


    public void execute() {

    }

    public int guessNumber(int n) {

        int l = 1;
        int r = n;
        while (l < r) {
            int mid = (r - l) / 2;

            if (guess(mid) == 0) return mid;

            if (guess(mid) == -1) {
                r = mid - 1;
            }
            if (guess(mid) == 1) {
                l = mid + 1;
            }
        }
        return -1;
    }

    int guess(int num) {
        return 1;
    }

}