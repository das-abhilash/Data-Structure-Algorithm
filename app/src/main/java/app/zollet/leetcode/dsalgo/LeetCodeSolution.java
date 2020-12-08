package app.zollet.leetcode.dsalgo;

public class LeetCodeSolution {

    public void execute() {
        int a = bitwiseComplement(10);
    }

    public int bitwiseComplement(int N) {
        if (N == 0) return 1;
        int l = (int) (Math.log(N) / Math.log(2)) + 1;
        return N ^ ((int) Math.pow(2,l) -1);
    }

}