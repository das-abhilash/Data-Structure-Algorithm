package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
    }

    public int[] minOperations(String boxes) {

        int[] a = new int[boxes.length()];

        for (int i = 0; i < boxes.length(); i++) {
            int c = 0;
            int s = 0;
            for (int j = i - 1; j > 0; j--) {
                s++;
                if (boxes.charAt(j) == '1') {
                    c += s;
                }
            }

            s = 0;
            for (int j = i + 1; j < boxes.length(); j++) {
                s++;
                if (boxes.charAt(j) == '1') {
                    c += s;
                }
            }
            a[i] = c;
        }
        return a;
    }

}