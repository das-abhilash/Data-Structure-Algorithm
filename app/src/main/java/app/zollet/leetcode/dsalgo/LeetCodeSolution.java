package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {
    }

    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {

        int test = minutesToTest / minutesToDie;

        int l = 0;
        int r = buckets;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (Math.pow(test + 1, mid) >= buckets) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

}