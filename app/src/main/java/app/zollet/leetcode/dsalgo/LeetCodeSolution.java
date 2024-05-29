package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {

    public void execute() {


    }

    public int numSteps(String s) {

        int ans = 0;
        int carry = 0;

        for (int i = s.length() - 1; i > 0; i--) {

            int digit = (s.charAt(i) - '0') + carry;

            if (digit % 2 == 1) {
                ans = ans + 2;
                carry = 1;
            } else {
                ans = ans + 1;
            }
        }
        return ans + carry;
    }


}


