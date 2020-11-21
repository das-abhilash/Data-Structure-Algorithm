package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {

    public void execute() {

        int a = atMostNGivenDigitSet(new String[]{"1", "3", "7", "8"}, 873);
    }

    public int atMostNGivenDigitSet(String[] digits, int n) {

        Arrays.sort(digits);

        long a = 0;
        int K = n;

        int d = 0;
        while (K != 0) {
            K = K / 10;
            d++;
        }

        for (int i = 0; i < d - 1; i++) {
            a += Math.pow(digits.length, i + 1);
        }

        a += solve(n, digits, d);

        return (int) a;
    }

    private int solve(int n, String[] digits, int d) {
        long a = 0;
        if (d == 1) {
            for (String digit : digits) {
                if (Integer.parseInt(digit) > n)
                    break;
                else
                    a++;
            }
            return (int) a;
        }
        int l = (int) (n / Math.pow(10, d - 1));

        for (String digit : digits) {
            if (Integer.parseInt(digit) < l) {
                a += Math.pow(digits.length, d - 1);
            } else if (Integer.parseInt(digit) == l) {
                int aa = (int) (n % Math.pow(10, d - 1));
                a += solve(aa, digits, d - 1);
            } else {
                break;
            }
        }
        return (int) a;
    }
}