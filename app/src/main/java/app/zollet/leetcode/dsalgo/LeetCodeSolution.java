package app.zollet.leetcode.dsalgo;


public class LeetCodeSolution {


    public void execute() {

    }

    public boolean stoneGame(int[] piles) {


        return solve(piles, true, 0, 0, 0, piles.length-1);

    }

    private boolean solve(int[] piles, boolean isAlice, int alice, int bob, int start, int end) {

        if (start > end || start >= piles.length || end < 0) {
            return alice > bob;
        }

        if (isAlice) {
            return solve(piles, !isAlice, alice + piles[start], bob, start + 1, end) || solve(piles, !isAlice, alice + piles[end], bob, start, end - 1);
        } else {
            return solve(piles, !isAlice, alice, bob + piles[start], start + 1, end) || solve(piles, !isAlice, alice, bob + piles[end], start, end - 1);
        }
    }
}