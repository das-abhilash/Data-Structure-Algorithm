package app.zollet.leetcode.dsalgo;


import java.util.Arrays;

public class LeetCodeSolution {

    public void execute() {

    }

    public boolean exist(char[][] board, String word) {
        if (word.isEmpty()) return false;
        char start = word.charAt(0);

        boolean[][] dp = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == start) {
                    if (check(board, dp, word, 1, i, j)) return true;
                }

            }
        }
        return false;
    }

    private boolean check(char[][] board, boolean[][] dp, String word, int index, int x, int y) {
        if (index >= word.length()) return true;
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length) return false;



        if (dp[x][y]) return false;


        if (board[x][y] != word.charAt(index)) return false;

        dp[x][y] = true;
        if (check(board, dp, word, index + 1, x + 1, y)) return true;
        if (check(board, dp, word, index + 1, x - 1, y)) return true;
        if (check(board, dp, word, index + 1, x, y + 1)) return true;
        if( check(board, dp, word, index + 1, x, y - 1)) return true;

        dp[x][y] = false;
        return false;
    }


}