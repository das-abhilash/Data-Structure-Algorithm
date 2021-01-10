package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
    }

    public int[] decode(int[] encoded, int first) {

        if (encoded.length == 0) return new int[]{first};

        int[] a = new int[encoded.length + 1];
        a[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            a[i + 1] = encoded[i] ^ a[i];
        }
        return a;
    }

}