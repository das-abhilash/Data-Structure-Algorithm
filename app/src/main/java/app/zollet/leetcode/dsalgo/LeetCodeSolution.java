package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
    }

    public int hammingWeight(int n) {

        String b = Integer.toBinaryString(n);

        int a = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '1') {
                a++;
            }
        }
        return a;
    }

}