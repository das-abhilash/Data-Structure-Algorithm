package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
        String sdf = getSmallestString(5, 73);
    }

    public String getSmallestString(int n, int k) {

        StringBuilder s = new StringBuilder();

        for (int i = 0; i < n; i++) {
            s.append('a');
            k--;
        }

        while (k >= 26) {
            s.setCharAt(n - 1, 'z');
            k = k - 25;
            n--;
        }

        if (k > 0) {
            s.setCharAt(n - 1, (char) ('a' + (k)));
        }
        return s.toString();
    }


}